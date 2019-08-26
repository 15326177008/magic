package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/6 0006.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        //return login page
        return "login";
    }
}
