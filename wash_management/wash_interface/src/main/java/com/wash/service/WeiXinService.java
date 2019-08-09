package com.wash.service;

public interface WeiXinService {

    /**
     * 获取微信公众号的推荐
     * @return
     */
    Object getBatchgetmMaterial(String type,String offset,String count);
}
