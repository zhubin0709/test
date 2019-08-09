package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.domain.WashCharge;
import com.wash.domain.WashMaintenanceContentDao;
import com.wash.domain.WashMaintenanceDao;
import com.wash.mapper.WashChargeMapper;
import com.wash.mapper.WashContentMapper;
import com.wash.mapper.WashDescriptionMapper;
import com.wash.service.WashMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class WashMaintenanceServiceImpl implements WashMaintenanceService {
    //定义是否有服务说明的常量
    public static final Byte DESCRIPTION=1;
    @Autowired
    private WashDescriptionMapper washDescriptionMapper;
    @Autowired
    private WashContentMapper washContentMapper;
    @Autowired
    private WashChargeMapper washChargeMapper;
    @Override
    public List<WashMaintenanceDao> getWashShow(Long DetailsId) {
        return washDescriptionMapper.selectDescriptions(DetailsId);
    }
    @Override
    public List<WashMaintenanceContentDao> getWashContent(Long DetailsId) {
        return washContentMapper.queryWashMaintenanceContent(DetailsId);
    }

    @Override
    public List<WashCharge> getWashCharge(Long DetailsId) {
        Example example=new Example(WashCharge.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("detailsId",DetailsId);
        return washChargeMapper.selectByExample(example);
    }
}
