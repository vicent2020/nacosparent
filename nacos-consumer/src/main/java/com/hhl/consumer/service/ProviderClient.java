package com.hhl.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: nacosparent
 * @description:
 * @author: hlh
 * @create: 2021-03-25 10:24
 **/
@FeignClient(value = "com.hhl.provider")
public interface ProviderClient {

    @GetMapping("/service")
    String service();
}
