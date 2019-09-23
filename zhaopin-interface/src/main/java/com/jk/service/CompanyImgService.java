package com.jk.service;

import com.jk.pojo.QsCompanyImg;
import entity.PageResult;
import entity.Result;

/**
 * @类名: CompanyImgService
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-10 16:13
 **/
public interface CompanyImgService {

    public PageResult findCompanyImgList(QsCompanyImg companyImg, Integer pageNum, Integer pageSize);

    public void deletecompanyImg(Integer id);

    public void updatecompanyImg(Integer[] ids, Integer audit);
}
