package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.domain.WashEngineer;
import com.wash.mapper.WashEngineerMapper;
import com.wash.service.WashEngineerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class WashEngineerServiceImpl implements WashEngineerService {
    @Autowired
    private WashEngineerMapper washEngineerMapper;
    @Override
    public List<WashEngineer> getWashEngineer() {
        return  washEngineerMapper.selectAll();
    }
}
