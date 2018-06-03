package com.nastyair.project.jianshublog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    String login(
            @RequestParam String username,
            @RequestParam String password
    ){
        return "ok";
    }

}
