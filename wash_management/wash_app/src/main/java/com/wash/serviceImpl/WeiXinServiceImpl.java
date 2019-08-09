package com.wash.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wash.client.WeiXinClient;
import com.wash.service.WeiXinService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class WeiXinServiceImpl implements WeiXinService {

    @Autowired
    private WeiXinClient weiXinClient;
    @Override
    public Object getBatchgetmMaterial(String type, String offset, String count) {
        Object batchgetmMaterial = weiXinClient.getBatchgetmMaterial(type, offset, count);
        return batchgetmMaterial;
    }
}
