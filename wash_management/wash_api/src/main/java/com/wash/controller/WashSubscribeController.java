package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.domain.WashSubscribe;
import com.wash.domain.WashSubscribeAndWashServiceType;
import com.wash.domain.WashSubscribeBo;
import com.wash.domain.WashSubscribeDao;
import com.wash.service.WashSubscribeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 预约服务模块
 */
@RestController
@RequestMapping("api/washSubscribe")
public class WashSubscribeController {
    @Reference(timeout = 4000)
    private WashSubscribeService washSubscribeService;
    @PostMapping("/insertWashSubscribe")
//    public int insertWashSubscribe(WashSubscribe washSubscribe,@RequestParam(value = "id",defaultValue = "1") Long id){
//        return washSubscribeService.insertWashsubscribe(washSubscribe,id);
//    }
    public ResponseEntity<Void> insertWashSubscribe(WashSubscribeBo washSubscribeBo){
         washSubscribeService.insertWashsubscribe(washSubscribeBo);
            return  ResponseEntity.ok().build();
    }
    @GetMapping("/selectWashSubscribe")
    public ResponseEntity selectWashSubscribe(long userId){
        List<WashSubscribeDao> washSubscribeDaos = washSubscribeService.selectWashSubscribe(userId);
        System.out.println(washSubscribeDaos);
        return ResponseEntity.ok(washSubscribeDaos);
    }
}
