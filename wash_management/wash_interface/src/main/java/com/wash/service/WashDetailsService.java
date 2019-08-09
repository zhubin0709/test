package com.wash.service;

import com.wash.domain.WashDetails;
import com.wash.domain.WashSubscribeDetails;

import java.util.List;

public interface WashDetailsService {
    public List<WashDetails> selectWashDetailsList(WashSubscribeDetails washSubscribeDetails);
}
