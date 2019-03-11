package com.ljy.blog.admin.controller;

import com.ljy.blog.admin.domain.User;
import com.ljy.blog.admin.request.ReqUser;
import com.ljy.blog.admin.service.UserService;
import com.ljy.blog.admin.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "/admin/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String loginHome(@RequestBody ReqUser reqUser) {
        User loginUser = userService.getUserByLoginName(reqUser.getUsername());
        try {
            if (MD5.checkPassword(MD5.md5(reqUser+loginUser.getPassword()), loginUser.getPassword())) {
                return "success";
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "error";
    }

}
