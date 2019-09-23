package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsAdmin;
import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsMembers;
import com.jk.service.MemberService;
import entity.Result;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("memberLogin")
public class MemberController {

    @Reference
    private MemberService memberService;

    @RequestMapping("tologin")
    public Result toLogin(QsMembers qsMembers, HttpServletRequest request ){
        HttpSession session = request.getSession();
        Result result = memberService.toLogin(qsMembers);
       if (result.getQsMembers()!=null) {
       session.setAttribute("qsMembers",result.getQsMembers());
       }
        return result;
    }

    @RequestMapping("register")
    public Result register(QsMembers qsMembers){
        return memberService.register(qsMembers);
    }

    @RequestMapping("getUserName")
    public QsMembers getUserName(HttpSession session){
        QsMembers attribute = (QsMembers) session.getAttribute("qsMembers");
        return attribute;
    }

    @RequestMapping("finfcompare")
    public QsCompanyProfile finfcompare(Integer uid){
        return memberService.finfcompare(uid);
    }

}
