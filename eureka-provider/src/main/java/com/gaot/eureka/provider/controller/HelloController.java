/*
 * 版权说明
 */
package com.gaot.eureka.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO 类描述
 *
 * @author gaot
 * @date 2019/12/24
 */
@RestController
public class HelloController {
    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        List<String> services = client.getServices();
        LOG.info("******************************{}", services);
        return "hello";
    }

}
