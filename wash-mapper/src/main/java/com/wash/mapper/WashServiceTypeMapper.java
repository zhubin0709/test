package com.wash.mapper;

import com.wash.common.base.mapper.BaseMapper;
import com.wash.domain.WashServiceType;
import com.wash.domain.WashSubscribeAndWashServiceType;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface WashServiceTypeMapper   extends Mapper<WashServiceType>, SelectByIdListMapper<WashServiceType, Long> {

    @Select("select subscribe_id subscribeId,(select name from wash_service_type where id=b.service_type_id) name from wash_subscribe_detailed b where subscribe_id= #{subscribeId}")
    List<WashSubscribeAndWashServiceType> queryCategoryByBid(Long subscribeId);
}