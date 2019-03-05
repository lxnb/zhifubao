package com.alipay.logbackAop;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Aop")
@RestController
public class AopController {

    @RequestMapping("aoptest")
    public String aopTest(String abc){
        return "Aop test OK";
    }
}
