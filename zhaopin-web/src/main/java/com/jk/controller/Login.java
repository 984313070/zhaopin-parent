package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsAdmin;
import com.jk.service.TestService;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("login")
public class Login {

    @Reference
    private TestService testService;

    @RequestMapping("login")
    public Result login(QsAdmin qsAdmin, HttpServletRequest request){
        HttpSession session = request.getSession();
        Result result = testService.login(qsAdmin);
        if (result.getQsAdmin()!=null){
            session.setAttribute("findusername",result.getQsAdmin());
        }
        return result;
    }

    @RequestMapping("findUserName")
    public QsAdmin findUserName(HttpServletRequest request){
        HttpSession session = request.getSession();
        QsAdmin findusername = (QsAdmin) session.getAttribute("findusername");
        return findusername;

    }


}
