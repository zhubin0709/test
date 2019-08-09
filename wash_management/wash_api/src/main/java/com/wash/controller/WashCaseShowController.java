package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.domain.WashCaseShow;
import com.wash.service.WashCaseShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 案列
 */
@RestController
@RequestMapping(value = "api/washCaseShow")
public class WashCaseShowController {
    @Reference(timeout = 4000, check = false)
    private WashCaseShowService washCaseShowService;
    @GetMapping("/getWashCaseShow")
    public ResponseEntity getWashCaseShow(@RequestParam(value = "serviceTypeId",defaultValue = "0") long serviceTypeId){
        return  ResponseEntity.ok(washCaseShowService.getWashCaseShow(serviceTypeId));
    }
}
