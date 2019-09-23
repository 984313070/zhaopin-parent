package com.jk.service;

import com.jk.pojo.QsAdmin;
import com.jk.pojo.Test;
import entity.Result;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface TestService  {

    List<Test> findAll();

    Result login(QsAdmin qsAdmin);

}
