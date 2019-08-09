package com.wash.service;

import java.util.Map;

public interface GouldService {

    Object getRegeo(String longItUde, String latItUde,String output);


    /**
     *
     * @param locations 可以个经纬度
     * @param coordsys  原坐标系
     *
     * 可选值：
     *
     * gps;
     *
     * mapbar;
     *
     * baidu;
     *
     * autonavi(不进行转换)
     * @param outPut 返回数据格式类型
     *
     * 可选值：JSON,XML
     * @return
     * @throws Exception
     */
    Object getConvert(Map locations, String coordsys, String outPut);

    /**
     *行政区域查询
     * @param keyWords
     * 查询关键字
     *
     * 规则：只支持单个关键词语搜索关键词支持：行政区名称、citycode、adcode
     *
     * 例如，在subdistrict=2，搜索省份（例如山东），能够显示市（例如济南），区（例如历下区）
     *
     * adcode信息可参考城市编码表获取
     * @param subDistrict 子级行政区
     *
     * 规则：设置显示下级行政区级数（行政区级别包括：国家、省/直辖市、市、区/县、乡镇/街道多级数据）
     *
     * 可选值：0、1、2、3等数字，并以此类推
     *
     * 0：不返回下级行政区；
     *
     * 1：返回下一级行政区；
     *
     * 2：返回下两级行政区；
     *
     * 3：返回下三级行政区；
     *
     *
     *
     * 需要在此特殊说明，目前部分城市和省直辖县因为没有区县的概念，故在市级下方直接显示街道。
     *
     * 例如：广东-东莞、海南-文昌市
     * @param outPut 返回数据格式类型
     *
     * 可选值：JSON，XML
     * @return
     * @throws Exception
     */
    Object getDistrict(String keyWords,String subDistrict,String outPut);
}
