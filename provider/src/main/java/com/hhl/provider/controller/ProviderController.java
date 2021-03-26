package com.hhl.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacosparent
 * @description:
 * @author: hlh
 * @create: 2021-03-25 10:19
 **/
@RestController
public class ProviderController {

    @GetMapping("/service")
    public String service() {
        return "com.hhl.provider invoke";
    }
}

