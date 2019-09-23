package com.jk.service;

import com.jk.pojo.QsCompanyProfile;
import entity.PageResult;
import entity.Result;

import java.util.List;

public interface CompanyService {

    public  PageResult findCompanylist(QsCompanyProfile qsCompanyProfile, Integer rows, Integer page);

    public  void addCompany(QsCompanyProfile qsCompanyProfile);

    public  void delCompany(Integer[] ids);

    public  QsCompanyProfile findById(Integer id);

    public  void updCompany(Integer audit, Integer[] ids);

    public void deleteCompany(Integer id);

    public List<QsCompanyProfile> findAll();

    public  Result importXLS(String filePath);

}
