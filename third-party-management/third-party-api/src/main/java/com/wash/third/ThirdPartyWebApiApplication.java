package com.wash.third;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.wash.third")
@EnableDubbo
public class ThirdPartyWebApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyWebApiApplication.class);
    }
}
