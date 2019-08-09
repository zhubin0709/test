package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.common.exception.ServiceException;
import com.wash.domain.WashCategory;
import com.wash.mapper.WashCategoryMapper;
import com.wash.service.CateGoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Service
public class CateGoryServiceImpl implements CateGoryService {
    @Autowired
    private WashCategoryMapper washCategoryMapper;
    @Override
    public List<WashCategory> queryCateGorys() {
        return washCategoryMapper.selectAll();
    }

    @Override
    public List<WashCategory> queryCateGorysById(Long id) {
        WashCategory washCategory=new WashCategory();
        washCategory.setParentId(id.longValue());
        List<WashCategory> select = washCategoryMapper.select(washCategory);
        if (CollectionUtils.isEmpty(select)) {
            throw new ServiceException("查询分类不存在");
        }
        return select;
    }
}
