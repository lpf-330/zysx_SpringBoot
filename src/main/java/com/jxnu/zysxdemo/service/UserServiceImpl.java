package com.jxnu.zysxdemo.service;


import com.jxnu.zysxdemo.dto.LoginRequest;
import com.jxnu.zysxdemo.dto.LoginResponse;
import com.jxnu.zysxdemo.mapper.LoginMapper;
import com.jxnu.zysxdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private LoginMapper loginMapper;


    @Override
    public LoginResponse login(LoginRequest loginRequest) {
//        User user=loginMapper.findUser(loginRequest.getUsername(),loginRequest.getPassword());
        User user=loginMapper.findUser(loginRequest.getUsername(),loginRequest.getPassword());
        if(user!=null){
            return new LoginResponse(true,user.getUser_id(),user.getAvatar(),user.getAge(),user.getHeight(),user.getWeight());
        }else {
            return new LoginResponse(false,null,null,null,null,null);
        }

    }
}
