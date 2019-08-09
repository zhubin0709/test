package com.wash.client;

import com.wash.common.exception.ServiceException;
import com.wash.common.util.RestTemplateUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * 高德地图
 */
@Component
public class GouldClient {

    @Value("${goldClient.url}")
    private String url;

    @Value("${goldClient.key}")
    private String key;

    /**
     *
     * @param longItUde  113.09210639106
     * @param latItUde   28.246129557292
     * @param output    json/xml
     * @return
     */
    public Object getRegeo(String longItUde, String latItUde,String output){
        //geocode/regeo?output=JSONORXML&location=LONGITUDE,LATITUDE&key=KEY&radius=1000&extensions=all
       // String requestUrl = url+"api/user/query?username={username}&password={password}";
        String requestUrl = url+"geocode/regeo?output={output}&location={longItUde},{latItUde}&key={key}&radius=1000&extensions=all";
        Map<String, Object> params = new HashMap<>();
        params.put("output",output);
        params.put("longItUde", longItUde);
        params.put("latItUde", latItUde);
        params.put("key", key);
        ResponseEntity<Object> entity = RestTemplateUtils.get(requestUrl,Object.class,params);
        return entity.getBody();
    }

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
     * @param output 返回数据格式类型
     *
     * 可选值：JSON,XML
     * @return
     * @throws Exception
     */
    public Object getConvert(Map locations,String coordsys,String output){
        String requestUrl = url+"assistant/coordinate/convert?locations={locations}&coordsys={coordsys}&output={output}&key={key}";
        if(locations.isEmpty()){
            throw new ServiceException("locations不能为空");
        }
        StringBuilder s=new StringBuilder();
        locations.forEach((k,v)->  s.append(k+","+v+"|"));
        String substring = s.substring(0, s.lastIndexOf("|"));
        Map<String, Object> params = new HashMap<>();
        params.put("locations",substring);
        params.put("coordsys",coordsys);
        params.put("output",output);
        params.put("key",key);
        ResponseEntity<Object> entity = RestTemplateUtils.get(requestUrl,Object.class,params);
        return  entity.getBody();
    }

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
    public Object getDistrict(String keyWords,String subDistrict,String outPut)throws Exception{
        String requestUrl =  url+"config/district?keywords={keyWords}&subdistrict={subDistrict}&key={key}&output={outPut}";
        Map<String, Object> params = new HashMap<>();
        params.put("keyWords",keyWords);
        params.put("subDistrict",subDistrict);
        params.put("key",key);
        params.put("outPut",outPut);
        ResponseEntity<Object> entity = RestTemplateUtils.get(requestUrl, Object.class, params);
        return entity.getBody();
    }
}
