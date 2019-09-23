package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.QsCompanyProfileMapper;
import com.jk.mapper.QsMembersMapper;
import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsCompanyProfileExample;
import com.jk.pojo.QsMembers;
import com.jk.pojo.QsMembersExample;
import com.jk.service.MemberService;
import com.jk.until.Md5Util;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private QsMembersMapper qsMembersMapper;

    @Autowired
    private QsCompanyProfileMapper qsCompanyProfileMapper;

    @Override
    public Result toLogin(QsMembers qsMembers) {
        QsMembersExample example = new QsMembersExample();
        QsMembersExample.Criteria criteria = example.createCriteria();
        if(qsMembers.getUsername()!=null && qsMembers.getUsername().length()>0){
            criteria.andUsernameEqualTo(qsMembers.getUsername());
        }
        List<QsMembers> qsMembers1 = qsMembersMapper.selectByExample(example);
        QsMembers  qsMembers2=null;
        if(qsMembers1.size()>0){
            qsMembers2 = qsMembers1.get(0);
        }else{
            return  new Result(false,"用户不存在");
        }

        String password = qsMembers.getPassword();
        String md532 = Md5Util.getMd532(password);
        if(!md532.equals(qsMembers2.getPassword())){
            return  new Result(false,"密码错误");
        }
        if(qsMembers2.getUtype()){
            return new Result(true,"企业登录成功",qsMembers2);
        }else{
            return new Result(true,"个人登录成功");
        }
    }

    @Override
    public QsCompanyProfile finfcompare(Integer uid) {
        QsCompanyProfileExample qsCompanyProfileExample = new QsCompanyProfileExample();
        QsCompanyProfileExample.Criteria criteria = qsCompanyProfileExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<QsCompanyProfile> qsCompanyProfiles = qsCompanyProfileMapper.selectByExample(qsCompanyProfileExample);
        QsCompanyProfile qsCompanyProfile=null;
        if(qsCompanyProfiles.size()>0){
             qsCompanyProfile = qsCompanyProfiles.get(1);
        }
        return qsCompanyProfile;
    }

    @Override
    public Result register(QsMembers qsMembers) {
        QsMembersExample example = new QsMembersExample();
        QsMembersExample.Criteria criteria = example.createCriteria();
        if(qsMembers.getUsername()!=null && qsMembers.getUsername().length()>0){
            criteria.andUsernameEqualTo(qsMembers.getUsername());
        }
        List<QsMembers> qsMemberss = qsMembersMapper.selectByExample(example);
        if(qsMemberss.size()>0){
            return  new Result(false,"用户已存在，不能注册");
        }

        String password = qsMembers.getPassword();
        String md532 = Md5Util.getMd532(password);
        qsMembers.setPassword(md532);
        qsMembersMapper.insert(qsMembers);
        return new Result(true,"注册成功");
    }



}

