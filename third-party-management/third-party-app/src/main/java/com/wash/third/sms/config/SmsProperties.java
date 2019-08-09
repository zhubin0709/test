package com.wash.third.sms.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @ProjectName: yitao-parent
 * @Auther: GERRY
 * @Date: 2019/5/6 18:21
 * @Description:
 */

@Data
@Component
@ConfigurationProperties(prefix = ("wash.sms"))
public class SmsProperties {
    private String accessKeyId;
    private String accessKeySecret;
}
