package com.jk.service;

import com.jk.pojo.QsJobs;
import entity.PageResult;

public interface JobsService {

    public PageResult  findJobsList(QsJobs qsJobs, Integer rows, Integer page);

    public QsJobs findById(Integer id);

    public void updJobs(QsJobs qsJobs);

    public  void delJobs(Integer[] ids);

    public  void deleteJobs(Integer id);
}
