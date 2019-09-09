package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.Test;
import com.jk.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: TestController
 * @描述:
 * @作者: 李康飞
 * @时间: 2019-09-07 09:07
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/find")
    public List<Test> find(){
        return testService.findAll();
    }
}