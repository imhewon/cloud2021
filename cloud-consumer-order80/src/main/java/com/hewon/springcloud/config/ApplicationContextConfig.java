package com.hewon.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced 使用自己手写的负载均衡算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
