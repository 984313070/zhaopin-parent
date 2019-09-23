package com.jk.service;

import com.jk.pojo.QsCompanyProfile;
import entity.PageResult;

public interface CompanyService {

    public  PageResult findCompanylist(QsCompanyProfile qsCompanyProfile, Integer rows, Integer page);

    public  void addCompany(QsCompanyProfile qsCompanyProfile);

    public  void delCompany(Integer[] ids);

    public  QsCompanyProfile findById(Integer id);

    public  void updCompany(QsCompanyProfile qsCompanyProfile);

    public void deleteCompany(Integer id);
}
