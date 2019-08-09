package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.domain.WashDetails;
import com.wash.domain.WashMaintenanceDao;
import com.wash.domain.WashSubscribeDetails;
import com.wash.mapper.WashDetailsMapper;
import com.wash.service.WashDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class WashDetailsServiceImpl implements WashDetailsService {
    @Autowired
    private WashDetailsMapper washDetailsMapper;
    @Override
    public List<WashDetails> selectWashDetailsList(WashSubscribeDetails washSubscribeDetails) {
        WashDetails washDetails=new WashDetails();
        washDetails.setCategoryIdOne(washSubscribeDetails.getCategoryIdOne());
        washDetails.setCategoryIdTwo(washSubscribeDetails.getCategoryIdTwo());
        //根据一级菜单和二级菜单,查询出分类所有的详情表,前台根据id判断拿数据
        List<WashDetails> washDetailsList = washDetailsMapper.select(washDetails);
        return washDetailsList;
    }
}
