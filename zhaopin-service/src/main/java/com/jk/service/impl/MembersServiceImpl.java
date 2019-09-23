package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsCompanyProfileMapper;
import com.jk.mapper.QsMembersMapper;
import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsCompanyProfileExample;
import com.jk.pojo.QsMembers;
import com.jk.service.MembersService;
import entity.MembersResult;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：MembersServiceImpl
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-16 20:22
 * 修改人： 程龙
 * 修改时间：2019-09-16 20:22
 * 修改备注：
 * @version </pre>
 */
@Service
public class MembersServiceImpl implements MembersService {

    @Autowired
    private QsMembersMapper qsMembersMapper;
    @Autowired
    private QsCompanyProfileMapper qsCompanyProfileMapper;

    @Override
    public PageResult findMemberslist(QsMembers qsMembers, Integer rows, Integer page) {
        PageHelper.startPage(page, rows);
        PageResult pageResult = new PageResult();
        List<QsMembers> qsMembers1 = qsMembersMapper.selectByExample(null);
        int count = qsMembersMapper.countByExample(null);
        List<MembersResult> result = new ArrayList<>();
        for (QsMembers members : qsMembers1) {
            MembersResult membersResult = new MembersResult();
            QsCompanyProfileExample qsCompanyProfileExample = new QsCompanyProfileExample();
            QsCompanyProfileExample.Criteria criteria = qsCompanyProfileExample.createCriteria();
            criteria.andUidEqualTo(members.getUid());
            List<QsCompanyProfile> qsCompanyProfiles = qsCompanyProfileMapper.selectByExample(qsCompanyProfileExample);
            if (qsCompanyProfiles!=null&&qsCompanyProfiles.size()>0){
                QsCompanyProfile qsCompanyProfile = qsCompanyProfiles.get(0);
                membersResult.setQsMembers(members);
                membersResult.setQsCompanyProfile(qsCompanyProfile);
                result.add(membersResult);
            }
        }
        pageResult.setTotal(count);
        pageResult.setRows(result);
        return pageResult;
    }

    @Override
    public void delMembers(Integer[] ids) {
        for (Integer id : ids) {
            qsMembersMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<QsMembers> findAll() {
        return qsMembersMapper.selectByExample(null);
    }


}