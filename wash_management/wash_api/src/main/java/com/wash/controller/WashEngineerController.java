package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.domain.WashEngineer;
import com.wash.service.WashEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 查询工程师
 */
@RestController
@RequestMapping("api/washEngineer")
public class WashEngineerController {
    @Reference(timeout = 4000, check = false)
    private WashEngineerService washEngineerService;
    @GetMapping("/getWashEngineer")
    public ResponseEntity getWashEngineer(){
       return ResponseEntity.ok(washEngineerService.getWashEngineer());
    }
}
