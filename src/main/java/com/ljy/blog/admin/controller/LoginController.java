package com.ljy.blog.admin.controller;

import com.ljy.blog.admin.domain.User;
import com.ljy.blog.admin.request.ReqUser;
import com.ljy.blog.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "/admin/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String loginHome(@RequestBody ReqUser reqUser) {
        User loginUser = userService.getUserByLoginName(reqUser.getUsername());
        System.out.println(loginUser.toString());

//        System.out.println(reqUser.toString());
        return "success";
    }

}
