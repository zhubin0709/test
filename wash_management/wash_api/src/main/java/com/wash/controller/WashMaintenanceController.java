package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.domain.*;
import com.wash.service.WashDetailsService;
import com.wash.service.WashMaintenanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 清洗维保
 */
@RestController
@RequestMapping("api/washMaintenance")
public class WashMaintenanceController {
    @Reference
    private WashMaintenanceService washMaintenanceService;
    @Reference
    private WashDetailsService washDetailsService;
    //定义是否有服务说明的常量
    public static final Byte DESCRIPTION = 1;
    @GetMapping("/washMaintenance")
    public ResponseEntity getWashShow(@Validated WashSubscribeDetails washSubscribeDetails) {
            Map<Long, List<WashMaintenanceDao>> getWashShowMap = new HashMap<>();
            Map<Long, List<WashMaintenanceContentDao>> getWashContentMap = new HashMap<>();
            Map<Long, List<WashCharge>> getWashCharge = new HashMap<>();
            //根据一级菜单和二级菜单,查询出分类所有的详情表,前台根据id判断拿数据
            List<WashDetails> washDetailsList = washDetailsService.selectWashDetailsList(washSubscribeDetails);
            for (WashDetails washDetails1 : washDetailsList) {
                //根据一级菜单，二级菜单查询,服务类型查询出,清洗详情表
                if (washDetails1.getIsDescription() == DESCRIPTION) {
                    getWashShowMap.put(washDetails1.getServiceTypeId(), washMaintenanceService.getWashShow(washDetails1.getId()));
                }
                if (washDetails1.getIsContent() == DESCRIPTION) {
                    getWashContentMap.put(washDetails1.getServiceTypeId(), washMaintenanceService.getWashContent(washDetails1.getId()));
                }
                if (washDetails1.getIsCharge() == DESCRIPTION) {
                    getWashCharge.put(washDetails1.getServiceTypeId(), washMaintenanceService.getWashCharge(washDetails1.getId()));
                }
            }
            ShowContentCharge showContentCharge = new ShowContentCharge();
            showContentCharge.setShowMap(getWashShowMap);
            showContentCharge.setContentMap(getWashContentMap);
            showContentCharge.setChargeMap(getWashCharge);
            return ResponseEntity.ok(showContentCharge);
        }

}