package com.jk.service.impl;/**
 * @类名: CompanyImgServiceImpl
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-10 16:13
 **/

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsCompanyImgMapper;
import com.jk.pojo.QsCompanyImg;
import com.jk.pojo.QsCompanyImgExample;
import com.jk.service.CompanyImgService;
import entity.PageResult;
import entity.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：CompanyImgServiceImpl    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-10 16:13   
 * 修改人：顾可帅
 * 修改时间：2019-09-10 16:13    
 * 修改备注：       
 * @version </pre>  
 */
@Service
public class CompanyImgServiceImpl implements CompanyImgService {
    @Autowired
    public QsCompanyImgMapper companyImgMapper;

    @Override
    public PageResult findCompanyImgList(QsCompanyImg companyImg, Integer pageNum, Integer pageSize) {
        PageHelper.startPage (pageNum,pageSize);
        QsCompanyImgExample companyImgExample = new QsCompanyImgExample ();
        QsCompanyImgExample.Criteria criteria = companyImgExample.createCriteria ();
        if (companyImg != null) {
            if (companyImg.getAudit () != null ) {
               criteria.andAuditEqualTo (companyImg.getAudit ());
            }
        }
        Page<QsCompanyImg> qsCompanyImgs = (Page<QsCompanyImg>) companyImgMapper.selectByExample (companyImgExample);
        return new PageResult(qsCompanyImgs.getTotal (),qsCompanyImgs.getResult ());
    }

    @Override
    public void deletecompanyImg(Integer id) {
        companyImgMapper.deleteByPrimaryKey (id);
    }

    @Override
    public void updatecompanyImg(Integer[] ids,Integer audit) {
        for (Integer id : ids) {
            QsCompanyImg qsCompanyImg = new QsCompanyImg ();
            qsCompanyImg.setId (id);
            qsCompanyImg.setAudit (audit);
            companyImgMapper.updateByPrimaryKeySelective (qsCompanyImg);
        }

    }
}
