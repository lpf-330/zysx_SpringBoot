package com.jxnu.zysxdemo.controller;

import com.jxnu.zysxdemo.dto.LoginRequest;
import com.jxnu.zysxdemo.dto.LoginResponse;
import com.jxnu.zysxdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@Slf4j
@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private UserService userService;


    @PostMapping
    public LoginResponse postLogin(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest);
    }
}
