package com.wash.mapper;

import com.wash.common.base.mapper.BaseMapper;
import com.wash.domain.WashDescription;
import com.wash.domain.WashMaintenanceDao;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WashDescriptionMapper extends BaseMapper<WashDescription> {
    //select sort,(select name from wash_shows where id=d.shows_id) from wash_description d where details_id=
    @Select("select sort,(select name from wash_shows where id=d.shows_id) name from wash_description d where details_id=#{detailsId}")
    List<WashMaintenanceDao> selectDescription(Long detailsId);
    @Select("select sort,name from wash_shows s inner join wash_description d on s.id=d.shows_id where details_id =#{detailsId}")
    List<WashMaintenanceDao> selectDescriptions(Long detailsId);
}
