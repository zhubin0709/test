package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.domain.RotaryPlantingMap;
import com.wash.service.RotaryPlantingMapService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 轮播图控制器
 */
@RestController
@RequestMapping(value = "api/rotaryPlantingMap")
public class RotaryPlantingMapController {
    @Reference(timeout = 4000, check = false)
    private RotaryPlantingMapService rotaryPlantingMapService;
    @GetMapping("/getSwiper")
    public ResponseEntity getSwiper(short type){
        List<RotaryPlantingMap> swiper = rotaryPlantingMapService.getSwiper(type);
        return ResponseEntity.ok(swiper);
    }
}
