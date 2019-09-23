package com.jk.service;

import com.jk.pojo.QsJobs;
import entity.PageResult;
import entity.Result;

import java.util.List;

public interface JobsService {

    public PageResult  findJobsList(QsJobs qsJobs, Integer rows, Integer page);

    public QsJobs findById(Integer id);

    public void updJobs(Integer audit,Integer[] ids);

    public  void delJobs(Integer[] ids);

    public  void deleteJobs(Integer id);

    public List<QsJobs> findAll();

    public Result importXLS(String filePath);
}
