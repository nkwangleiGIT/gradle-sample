package com.tenxcloud.gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rd on 17-4-27.
 */
@Controller
@RequestMapping("/gradle")
public class HelloController {
    //@RequestMapping("/login")
    @RequestMapping("/")
    public String login(String username, String password) {
        return "index";
    }
}
