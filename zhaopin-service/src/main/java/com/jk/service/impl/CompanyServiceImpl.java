package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsCompanyProfileMapper;
import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsCompanyProfileExample;
import com.jk.service.CompanyService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：CompanyServiceImpl
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-09 21:12
 * 修改人： 程龙
 * 修改时间：2019-09-09 21:12
 * 修改备注：
 * @version </pre>
 */
@Service(timeout = 1200000)
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private QsCompanyProfileMapper qsCompanyProfileMapper;


    @Override
    public PageResult findCompanylist(QsCompanyProfile qsCompanyProfile, Integer rows, Integer page) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<QsCompanyProfile> qsCompanyProfiles = qsCompanyProfileMapper.selectByExample(null);
        int count = qsCompanyProfileMapper.countByExample(null);
        pageResult.setTotal(count);
        pageResult.setRows(qsCompanyProfiles);
        return pageResult;
      /*  QsCompanyProfileExample example = new QsCompanyProfileExample();
        QsCompanyProfileExample.Criteria criteria = example.createCriteria();
        if (qsCompanyProfile!=null){
           if(qsCompanyProfile.getAudit()!=null){
               criteria.andAuditEqualTo(qsCompanyProfile.getAudit());
           }
           if (qsCompanyProfile.getSetmealId()!=null){
               criteria.andSetmealIdEqualTo(qsCompanyProfile.getSetmealId());
           }
        }
        Page<QsCompanyProfile> page = (Page<QsCompanyProfile>) qsCompanyProfileMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());*/
    }

    @Override
    public void addCompany(QsCompanyProfile qsCompanyProfile) {
            qsCompanyProfileMapper.insert(qsCompanyProfile);
    }

    @Override
    public void delCompany(Integer[] ids) {
        for(Integer id: ids){
            qsCompanyProfileMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public QsCompanyProfile findById(Integer id) {
        return qsCompanyProfileMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updCompany(QsCompanyProfile qsCompanyProfile) {
        qsCompanyProfileMapper.updateByPrimaryKey(qsCompanyProfile);
    }

    @Override
    public void deleteCompany(Integer id) {
        qsCompanyProfileMapper.deleteByPrimaryKey(id);
    }


}
