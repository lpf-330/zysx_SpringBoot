package com.jxnu.zysxdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxnu.zysxdemo.mapper")
public class ZysxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZysxDemoApplication.class, args);
    }

}
