package com.stu.providerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author hch
 * @Email hechunhui_email@163.com
 * @Date 2022/7/14 17:17
 * @Version 1.0
 **/
@RestController
@RequestMapping("index")
public class IndexController {

    @GetMapping("index")
    public String getIndex(){
        return "哈哈哈";
    }
}
