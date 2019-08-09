package com.wash.serviceImpl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.wash.domain.WashCaseShow;
import com.wash.domain.WashEngineer;
import com.wash.mapper.WashCaseShowMapper;
import com.wash.service.WashCaseShowService;
import com.wash.service.WashEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class WashCaseShowServiceImpl implements WashCaseShowService {
    @Autowired
    private WashCaseShowMapper washCaseShowMapper;
    @Override
    public List<WashCaseShow> getWashCaseShow(long serviceTypeId) {
        if(serviceTypeId==0) {
            return washCaseShowMapper.selectAll();
        }
        Example example=new Example(WashCaseShow.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("serviceTypeId",serviceTypeId);
        return washCaseShowMapper.selectByExample(example);
    }
}
