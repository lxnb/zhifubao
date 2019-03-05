package com.alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.alipay.mapper")
public class ZhifubaoPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhifubaoPayApplication.class, args);
    }

}
