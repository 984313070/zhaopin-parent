package com.jk.service;

import com.jk.pojo.QsMembers;
import entity.PageResult;

import java.util.List;

public interface MembersService {

    public PageResult findMemberslist(QsMembers qsMembers, Integer rows, Integer page);

    public void delMembers(Integer[] ids);

    public  List<QsMembers> findAll();
}
