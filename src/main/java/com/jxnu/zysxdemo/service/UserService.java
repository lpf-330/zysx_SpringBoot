package com.jxnu.zysxdemo.service;


import com.jxnu.zysxdemo.dto.LoginRequest;
import com.jxnu.zysxdemo.dto.LoginResponse;

public interface UserService {
    LoginResponse login(LoginRequest loginRequest);
}
