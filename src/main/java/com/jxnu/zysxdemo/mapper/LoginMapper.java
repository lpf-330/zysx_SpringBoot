package com.jxnu.zysxdemo.mapper;


import com.jxnu.zysxdemo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface LoginMapper {
    @Select("select * from users where Username=#{userName} and Password=#{password}")
    User findUser(String userName, String password);
}
