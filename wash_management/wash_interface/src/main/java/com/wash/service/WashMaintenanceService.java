package com.wash.service;

import com.wash.domain.WashCharge;
import com.wash.domain.WashMaintenanceContentDao;
import com.wash.domain.WashMaintenanceDao;

import java.util.List;

public interface WashMaintenanceService {
    public List<WashMaintenanceDao> getWashShow(Long DetailsId);
    public List<WashMaintenanceContentDao> getWashContent(Long DetailsId);
    public List<WashCharge> getWashCharge(Long DetailsId);
}
