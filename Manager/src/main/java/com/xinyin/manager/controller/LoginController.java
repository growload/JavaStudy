package com.xinyin.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/5 20:51
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
