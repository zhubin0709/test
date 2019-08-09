package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.domain.RotaryPlantingMap;
import com.wash.mapper.RotaryPlantingMapMapper;
import com.wash.service.RotaryPlantingMapService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class RotaryPlantingMapImpl implements RotaryPlantingMapService {
    @Autowired
    private RotaryPlantingMapMapper rotaryPlantingMapMapper;
    @Override
    public List<RotaryPlantingMap> getSwiper(short type) {
        Example example=new Example(RotaryPlantingMap.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("type",type);
        List<RotaryPlantingMap> list=rotaryPlantingMapMapper.selectByExample(example);
        return rotaryPlantingMapMapper.selectByExample(example);
    }
}
