package com.wash.client;

import com.alibaba.fastjson.JSONObject;
import com.wash.common.exception.ServiceException;
import com.wash.common.util.RestTemplateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.UEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.weixin4j.Weixin;
import org.weixin4j.WeixinException;
import org.weixin4j.model.base.Token;
import org.weixin4j.spring.WeixinTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class WeiXinClient {

    @Autowired
    private WeixinTemplate weixinTemplate;
    @Autowired
    private Weixin weixin;

    public Object getBatchgetmMaterial(String type,String offset,String count){
        String requestUrl ="https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token={access_token}";
        Map object=new HashMap();
        object.put("type",type);
        object.put("offset",offset);
        object.put("count",count);

        String access_token =null;
        try {
             access_token = weixinTemplate.getToken().getAccess_token();
        } catch (WeixinException e) {
            throw new ServiceException("获取token失败");
        }
        ResponseEntity post = RestTemplateUtils.post(requestUrl,object, String.class, access_token);
        try {
            String encode = URLEncoder.encode(post.getBody().toString(), "utf-8");
            System.out.println(encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return  post.getBody();
    }
}
