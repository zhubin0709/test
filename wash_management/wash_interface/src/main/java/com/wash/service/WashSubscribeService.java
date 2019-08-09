package com.wash.service;

import com.wash.domain.WashSubscribe;
//import com.wash.domain.WashSubscribeAndWashServiceType;
import com.wash.domain.WashSubscribeBo;
import com.wash.domain.WashSubscribeDao;
import com.wash.domain.WashSubscribeId;

import java.util.List;

public interface WashSubscribeService {
//    public int insertWashsubscribe(WashSubscribe washSubscribe, WashSubscribeId washSubscribeId);
    public List<WashSubscribeDao> selectWashSubscribe(long userId);

    public void insertWashsubscribe(WashSubscribeBo washSubscribeBo);
}
