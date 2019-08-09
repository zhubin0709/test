package com.wash.mapper;

import com.wash.common.base.mapper.BaseMapper;
import com.wash.domain.WashContent;
import com.wash.domain.WashMaintenanceContentDao;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WashContentMapper extends BaseMapper<WashContent> {
    @Select("SELECT sort,name,url FROM wash_shows s INNER JOIN wash_content c on s.id=c.shows_id WHERE c.details_id=#{details_id}")
    List<WashMaintenanceContentDao> queryWashMaintenanceContent(Long detailsId);
}