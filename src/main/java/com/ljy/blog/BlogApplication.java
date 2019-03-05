package com.ljy.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ljy.blog")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
