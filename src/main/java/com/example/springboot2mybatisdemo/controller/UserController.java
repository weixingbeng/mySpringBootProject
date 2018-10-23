package com.example.springboot2mybatisdemo.controller;

import com.example.springboot2mybatisdemo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value = "/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) throws IllegalAccessException, InstantiationException {
        return userService.findAllUser(pageNum,pageSize);
    }

}
