package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.until.Md5Util;
import com.jk.mapper.QsAdminMapper;
import com.jk.mapper.TestMapper;
import com.jk.pojo.QsAdmin;
import com.jk.pojo.QsAdminExample;
import com.jk.pojo.Test;
import com.jk.service.TestService;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @类名: TestServiceImpl
 * @描述:
 * @作者: 李康飞
 * @时间: 2019-09-07 09:11
 **/
@Service(timeout = 60000)
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private QsAdminMapper qsAdminMapper;

    @Override
    public List<Test> findAll() {
        return testMapper.selectByExample(null);
    }

    @Override
    public Result login(QsAdmin qsAdmin) {
        QsAdminExample example = new QsAdminExample();
        QsAdminExample.Criteria criteria = example.createCriteria();
        if(qsAdmin.getUsername()!=null && qsAdmin.getUsername().length()>0){
            criteria.andUsernameEqualTo(qsAdmin.getUsername());
        }
        List<QsAdmin> qsAdmins = qsAdminMapper.selectByExample(example);
        QsAdmin qsAdmin1=null;
        if(qsAdmins.size()>=1){
            qsAdmin1 = qsAdmins.get(0);
        }else{
            return  new Result(false,"用户不存在");
        }

        String password = qsAdmin.getPassword();
        String md532 = Md5Util.getMd532(password);
        if(!md532.equals(qsAdmin1.getPassword())){
            return  new Result(false,"密码错误");
       }
           return new Result(true,"登录成功",qsAdmin1);

    }



}