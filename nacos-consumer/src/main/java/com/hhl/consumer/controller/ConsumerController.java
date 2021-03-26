package com.hhl.consumer.controller;

import com.hhl.consumer.service.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacosparent
 * @description:
 * @author: hlh
 * @create: 2021-03-25 10:25
 **/
@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service() {
        String providerResult = providerClient.service();
        return "consumer invoke" + "|" + providerResult;
    }
}
