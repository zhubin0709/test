package com.wash;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.wash.mapper")
public class WashServiceApplication{
    public static void main(String[] args) {
        SpringApplication.run(WashServiceApplication.class);

    }
}
