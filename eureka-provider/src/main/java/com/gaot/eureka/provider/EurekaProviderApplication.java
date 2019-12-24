/*
 * 版权说明
 */
package com.gaot.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供方启动类
 *
 * @author gaot
 * @date 2019/12/24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class, args);
    }
}
