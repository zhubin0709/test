package com.wash.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.service.GouldService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("api/gould")
public class GouldController {

    @Reference(timeout = 4000, check = false)
    private GouldService gouldService;

    /**
     *
     * @param longItUde 坐标点经度
     * @param latItUde  坐标点纬度
     * @param output  json或者是xml
     * @return
     * @throws Exception
     */
    @ApiOperation(value="逆地理编码", notes="可查看高德api")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "longItUde", value = "坐标点经度", dataType = "String"),
            @ApiImplicitParam(name = "latItUde", value = " 坐标点纬度", dataType = "String"),
            @ApiImplicitParam(name = "output",value = "返回的数据格式，只支持json", dataType = "String")
    })
    @GetMapping("getRegeo")
    public ResponseEntity getRegeo(@RequestParam(value = "longItUde")String longItUde,@RequestParam(value = "latItUde")String latItUde,@RequestParam(value = "output",defaultValue = "json") String output){
        Object regeo = gouldService.getRegeo(longItUde, latItUde, output);
        return ResponseEntity.ok(regeo);
    }

    /**
     *
     * @param longItUde 坐标点经度
     * @param latItUde 坐标点纬度
     * @param coordsys gps,mapbar,baidu
     * @param output json或者是xml
     * @return
     */
    @ApiOperation(value="坐标转换", notes="坐标转换是一类简单的HTTP接口，能够将用户输入的非高德坐标（GPS坐标、mapbar坐标、baidu坐标）转换成高德坐标。")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "longItUde", value = "坐标点经度", dataType = "String"),
            @ApiImplicitParam(name = "latItUde", value = " 坐标点纬度", dataType = "String"),
            @ApiImplicitParam(name = "coordsys", value = "gps,mapbar", dataType = "String"),
            @ApiImplicitParam(name = "output",value = "返回的数据格式，只支持json", dataType = "String")
    })
    @GetMapping("getConvert")
    public ResponseEntity getConvert(@RequestParam(value = "longItUde")String longItUde,@RequestParam(value = "latItUde")String latItUde,@RequestParam(value = "coordsys",defaultValue = "gps")String coordsys,@RequestParam(value = "output",defaultValue = "json")String output){
        Map map=new HashMap();
        map.put(longItUde,latItUde);
        Object convert = gouldService.getConvert(map, coordsys, output);
        return ResponseEntity.ok(convert);
    }

    /**
     *行政区域查询
     * @param keyWord
     * 查询关键字
     * 规则：只支持单个关键词语搜索关键词支持：行政区名称、citycode、adcode
     * 例如，在subdistrict=2，搜索省份（例如山东），能够显示市（例如济南），区（例如历下区）
     * adcode信息可参考城市编码表获取
     * @param subDistrict 子级行政区
     * 规则：设置显示下级行政区级数（行政区级别包括：国家、省/直辖市、市、区/县、乡镇/街道多级数据）
     * 可选值：0、1、2、3等数字，并以此类推
     * 0：不返回下级行政区；
     * 1：返回下一级行政区；
     * 2：返回下两级行政区；
     * 3：返回下三级行政区；
     * 需要在此特殊说明，目前部分城市和省直辖县因为没有区县的概念，故在市级下方直接显示街道
     * 例如：广东-东莞、海南-文昌市
     * @param output 返回数据格式类型
     *
     * 可选值：JSON，XML
     */
    @ApiOperation(value="获取城市联动", notes="行政区域查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "keyWord", value = "默认查询湖南省，长沙市", dataType = "String"),
            @ApiImplicitParam(name = "subDistrict", value = "子级行政区(可选值：0、1、2、3等数字* 0：不返回下级行政区；\n" +
                    "     * 1：返回下一级行政区；\n" +
                    "     * 2：返回下两级行政区；\n" +
                    "     * 3：返回下三级行政区；)", dataType = "String"),
            @ApiImplicitParam(name = "output",value = "返回的数据格式，只支持json", dataType = "String")
    })
    @GetMapping("getDistrict")
    public ResponseEntity getDistrict(@RequestParam(value = "keyWord",defaultValue = "长沙市")String keyWord,@RequestParam(value = "subDistrict",defaultValue = "1")String subDistrict,@RequestParam(value = "output",defaultValue = "json")String output){
        Object district = gouldService.getDistrict(keyWord, subDistrict, output);
        return ResponseEntity.ok(district);
    }

}
