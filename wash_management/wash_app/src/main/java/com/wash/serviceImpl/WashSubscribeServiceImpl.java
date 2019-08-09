package com.wash.serviceImpl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.wash.common.exception.ServiceException;
import com.wash.common.util.IdWorker;
import com.wash.common.util.PhoneFormatCheckUtils;
import com.wash.domain.*;
import com.wash.domain.WashServiceType;
import com.wash.mapper.*;
import com.wash.service.WashSubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(timeout = 40000)
public class WashSubscribeServiceImpl implements WashSubscribeService {
    //我要预约实现了类，同时新增预约表和预约详情表
    @Autowired
    private WashSubscribeMapper washSubscribeMapper;
    @Autowired
    private WashSubscribeDetailedMapper washSubscribeDetailedMapper;
    @Autowired
    private WashServiceTypeMapper washServiceTypeMapper;
    @Autowired
    private WashCategoryMapper washCategoryMapper;
    /**
     * 我要预约模块
     * @param washSubscribeBo
     */
    public void insertWashsubscribe(WashSubscribeBo washSubscribeBo){
        //判断有无登录
        //添加手机号验证
        //json数据封装
        if(PhoneFormatCheckUtils.isChinaPhoneLegal(washSubscribeBo.getTel())) {
            IdWorker idWorker = new IdWorker();
            long l = idWorker.nextId();
            WashSubscribe washSubscribe = new WashSubscribe();
            washSubscribe.setSubscribeId(l);
            washSubscribe.setUserId((long) 1);
            washSubscribe.setName(washSubscribeBo.getName());
            washSubscribe.setTel(washSubscribeBo.getTel());
            washSubscribe.setCategoryIdOne(washSubscribeBo.getCategoryIdOne());
            washSubscribe.setCategoryIdTwo(washSubscribeBo.getCategoryIdTwo());
            washSubscribe.setAddress(washSubscribeBo.getAddress());
            washSubscribe.setAddressDetailed(washSubscribeBo.getAddressDetailed());
            washSubscribe.setCreateTime(new Date());
            washSubscribeMapper.insertSelective(washSubscribe);
            for (WashSubscribeDetailed washSubscribeDetailed : washSubscribeBo.getWashSubscribeDetaileds()) {
                washSubscribeDetailed.setSubscribeId(washSubscribe.getSubscribeId());
                int insert = washSubscribeDetailedMapper.insert(washSubscribeDetailed);
            }
        }else {
            throw new ServiceException("手机号不正确！");
        }
    }

    /**
     * 订单表查询的模块
     * @param userId
     * @return 封装类集合
     */
    @Override
    public List<WashSubscribeDao> selectWashSubscribe(long userId) {
        List<WashSubscribeDao> list=new ArrayList<WashSubscribeDao>();
        Example example=new Example(WashSubscribe.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        //通过userId查询到用户的订单
        List<WashSubscribe> washSubscribes = washSubscribeMapper.selectByExample(example);
        for (WashSubscribe washSubscribe:washSubscribes){
            //循环判断所有的订单详情
            if( washSubscribe.getSubscribeId()!=null){
                Example sub=new Example(WashSubscribeDetailed.class);
                Example.Criteria subCriteria = sub.createCriteria();
                subCriteria.andEqualTo("subscribeId",washSubscribe.getSubscribeId());
                //通过Mapper代理来查询出所有的订单详情表
                List<WashSubscribeDetailed> washSubscribeDetaileds = washSubscribeDetailedMapper.selectByExample(sub);
                WashSubscribeDao washSubscribeDao=new WashSubscribeDao();
                washSubscribeDao.setSubscribeId(washSubscribe.getSubscribeId());
                washSubscribeDao.setName(washSubscribe.getName());
                //设置分类id
                Example example1Category=new Example(WashCategory.class);
                Example.Criteria criteriaCategory = example1Category.createCriteria();
                criteriaCategory.andEqualTo("id",washSubscribe.getCategoryIdTwo());
                WashCategory washCategory = washCategoryMapper.selectOneByExample(example1Category);
                washSubscribeDao.setCategory(washCategory.getName());
                for (WashSubscribeDetailed detailed:washSubscribeDetaileds){
                    //循环判断
                    if (detailed.getServiceTypeId()!=null){
                        List<WashSubscribeAndWashServiceType> washSubscribeDetailedMappers = washServiceTypeMapper.queryCategoryByBid(detailed.getSubscribeId());
                        washSubscribeDao.setWashSubscribeDtailedTypes(washSubscribeDetailedMappers);
                        //System.out.println(washSubscribeDetailedMappers);
                    }
                }
                list.add(washSubscribeDao);
            }else {
                throw new ServiceException("你还没有订单!");
            }
        }
        return list;
    }
}
