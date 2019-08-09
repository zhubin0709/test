package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.service.WeiXinService;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/weixn/recommend")
public class WeiXinReCommend {

    @Reference(timeout =  4000)
    private WeiXinService weiXinService;

    @PostMapping("getBatchgetmMaterial")
    public ResponseEntity getBatchgetmMaterial(HttpServletRequest request){
        String type = request.getParameter("type");
        String offset = request.getParameter("offset");
        String count = request.getParameter("count");
        Object batchgetmMaterial = weiXinService.getBatchgetmMaterial(type, offset, count);
        return ResponseEntity.ok(batchgetmMaterial);
    }
}
