package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.QsJobsMapper;
import com.jk.pojo.QsJobs;
import com.jk.service.JobsService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：JobsServiceImpl
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-10 16:36
 * 修改人： 程龙
 * 修改时间：2019-09-10 16:36
 * 修改备注：
 * @version </pre>
 */
@Service(timeout = 1200000)
public class JobsServiceImpl implements JobsService {

    @Autowired
    private QsJobsMapper qsJobsMapper;

    @Override
    public PageResult findJobsList(QsJobs qsJobs, Integer rows, Integer page) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<QsJobs> qsJobs1 = qsJobsMapper.selectByExample(null);
        int count = qsJobsMapper.countByExample(null);
        pageResult.setTotal(count);
        pageResult.setRows(qsJobs1);
        return pageResult;
    }

    @Override
    public QsJobs findById(Integer id) {
        return qsJobsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updJobs(QsJobs qsJobs) {
        qsJobsMapper.updateByPrimaryKey(qsJobs);
    }

    @Override
    public void delJobs(String ids) {
        String[] idss = ids.split(",");
        for(String  id: idss){
            qsJobsMapper.deleteByPrimaryKey(Integer.parseInt(id));
        }
    }




}
