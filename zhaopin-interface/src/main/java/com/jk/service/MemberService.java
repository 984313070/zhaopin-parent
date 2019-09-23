package com.jk.service;

import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsMembers;
import entity.Result;


public interface MemberService {

    Result register(QsMembers qsMembers);

    Result toLogin(QsMembers qsMembers);

    QsCompanyProfile finfcompare(Integer uid);
}
