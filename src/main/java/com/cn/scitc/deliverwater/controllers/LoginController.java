package com.cn.scitc.deliverwater.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class LoginController {
    @RequestMapping(value = "/login")
    public String page(){
        return "login";
    }
}
