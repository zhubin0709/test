package com.wash.third.upload.config;

import com.wash.common.upload.FastdfsClient;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class FastdfsClientConfig {
    @Bean
    public FastdfsClient fastdfsClient() {
        return new FastdfsClient("classpath:fdfs/fdfs_client.conf");
    }
}
