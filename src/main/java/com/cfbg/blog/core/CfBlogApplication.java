package com.cfbg.blog.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cfbg.blog.core.dao")
@SpringBootApplication
public class CfBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfBlogApplication.class, args);
    }

}
