package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.support.Parameter;
import com.wash.domain.WashCategory;
import com.wash.service.CateGoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CateGoryController {

    @Reference(timeout = 40000, check = false)
    private CateGoryService cateGoryService;

    /**
     * 第一种 分类全部查询出来，让前端自己去做判断
     * @return
     */
    @GetMapping("getCateGorys")
    public ResponseEntity getCateGorys(){
        List<WashCategory> washCategories = cateGoryService.queryCateGorys();
        System.out.println(washCategories.toString());
        return ResponseEntity.ok(washCategories);
    }

    /**
     * 第二种是通过单击事件   根据父类ID查询分类结果
     */
    @GetMapping("getCateGorysById")
    public ResponseEntity getCateGorysById(@RequestParam(value = "pid",defaultValue = "0")Long pid){
        List<WashCategory> washCategories = cateGoryService.queryCateGorysById(pid);
        return ResponseEntity.ok(washCategories);
    }

}
