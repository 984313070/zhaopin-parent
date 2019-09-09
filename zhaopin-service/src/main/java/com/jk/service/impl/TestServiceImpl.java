package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.TestMapper;
import com.jk.pojo.Test;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @类名: TestServiceImpl
 * @描述:
 * @作者: 李康飞
 * @时间: 2019-09-07 09:11
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> findAll() {
        return testMapper.selectByExample(null);
    }
}