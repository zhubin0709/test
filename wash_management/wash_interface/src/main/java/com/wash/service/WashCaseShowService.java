package com.wash.service;

import com.wash.domain.WashCaseShow;

import java.util.List;

public interface WashCaseShowService {
    public List<WashCaseShow> getWashCaseShow(long serviceTypeId);
}