package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.*;
import com.jk.pojo.*;
import com.jk.service.ResumeService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：zhaopin-parent
 * 类名称：ResumeServiceImpl
 * 类描述：
 * 创建人：马娇娇
 * 创建时间：2019-09-11 17:09
 * 修改人：马娇娇
 * 修改时间：2019-09-11 17:09
 * 修改备注：
 */
@Service
public class ResumeServiceImpl implements ResumeService {


    @Autowired
    private QsResumeMapper resumeMapper;

    @Autowired
    private QsJobsMapper jobsMapper;

    @Autowired
    private QsPersonalServiceStickLogMapper personalServiceStickLogMapper;

    @Autowired
    private QsAdvResumeMapper advResumeMapper;

    @Autowired
    private QsAdvResumeEducationMapper advResumeEducationMapper;

    @Autowired
    private QsAdvResumeWorkMapper advResumeWorkMapper;

    @Autowired
    private QsAdvResumeTrainingMapper advResumeTrainingMapper;

    @Autowired
    private QsAdvResumeCredentMapper advResumeCredentMapper;

    @Autowired
    private QsAdvResumeLanguageMapper advResumeLanguageMapper;

    @Autowired
    private QsAdminLogMapper adminLogMapper;

    @Override
    public PageResult findPage(QsResume qsResume, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsResumeExample example = new QsResumeExample();
        QsResumeExample.Criteria criteria = example.createCriteria();
        Page<QsResume> page = (Page<QsResume>) resumeMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void delResume(Integer[] ids) {
        System.out.println(ids);
        for (Integer id : ids) {
            resumeMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void deleteResumeById(Integer id) {
        resumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public QsResume findResumeById(Integer id) {
        return resumeMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findCenter(QsJobs qsJobs, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsJobsExample example =  new QsJobsExample();
        QsJobsExample.Criteria criteria = example.createCriteria();
        Page<QsJobs> page = (Page<QsJobs>) jobsMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult findPerson(int pageNum, int pageSize) {
        List<QsPersonalResume> result = new ArrayList<>();
        PageHelper.startPage(pageNum, pageSize);
        List<QsPersonalServiceStickLog> personalServiceStickLogs = personalServiceStickLogMapper.selectByExample (null);
        for (QsPersonalServiceStickLog personalServiceStickLog : personalServiceStickLogs) {
              QsResume resume = resumeMapper.selectByPrimaryKey(personalServiceStickLog.getResumeId());
              QsPersonalResume personalResume = new QsPersonalResume(resume,personalServiceStickLog);
              result.add(personalResume);
        }
        return  new PageResult(result.size(), result);
    }

    @Override
    public PageResult findPersonById(Integer id,int pageNum, int pageSize) {
        List<QsPersonalResume> result = new ArrayList<>();
        List<QsPersonalServiceStickLog> personalServiceStickLogs = personalServiceStickLogMapper.selectByExample (null);
        for (QsPersonalServiceStickLog personalServiceStickLog : personalServiceStickLogs) {
            QsResume resume  = resumeMapper.selectByPrimaryKey(id);
            QsPersonalResume personalResume = new QsPersonalResume(resume,personalServiceStickLog);
            result.add(personalResume);
        }
        return new PageResult(result.size(), result);
    }

    @Override
    public void updatePersonPromotion(QsPersonalServiceStickLog personalServiceStickLog) {
        personalServiceStickLogMapper.updateByPrimaryKey(personalServiceStickLog);
    }

    @Override
    public PageResult findTop(QsAdvResume advResume,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeExample example= new QsAdvResumeExample();
        QsAdvResumeExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResume> page = (Page<QsAdvResume>)advResumeMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public QsAdvResume findTopById(Integer id) {
        return advResumeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateAdv(QsAdvResume advResume) {
        advResumeMapper.updateByPrimaryKey(advResume);
    }

    @Override
    public PageResult findEducation(QsAdvResumeEducation advResumeEducation,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeEducationExample example = new QsAdvResumeEducationExample();
        QsAdvResumeEducationExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResumeEducation> page = (Page<QsAdvResumeEducation>)advResumeEducationMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult findWork(QsAdvResumeWork resumeWork, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeWorkExample example = new QsAdvResumeWorkExample();
        QsAdvResumeWorkExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResumeWork> page = ( Page<QsAdvResumeWork>)advResumeWorkMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult peixunjigou(QsAdvResumeTraining advResumeTraining, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeTrainingExample example = new QsAdvResumeTrainingExample();
        QsAdvResumeTrainingExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResumeTraining> page = (Page<QsAdvResumeTraining>) advResumeTrainingMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult findCre(QsAdvResumeCredent advResumeCredent, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeCredentExample example = new QsAdvResumeCredentExample();
        QsAdvResumeCredentExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResumeCredent> page  = (Page<QsAdvResumeCredent>) advResumeCredentMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public PageResult findLanguage(QsAdvResumeLanguage advResumeLanguage, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdvResumeLanguageExample example = new QsAdvResumeLanguageExample();
        QsAdvResumeLanguageExample.Criteria criteria = example.createCriteria();
        Page<QsAdvResumeLanguage> page = (Page<QsAdvResumeLanguage>) advResumeLanguageMapper.selectByExample(example);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void deleteTopById(Integer id) {
        advResumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteTops(Integer[] ids) {
        for (Integer id : ids) {
            advResumeMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<QsResume> findAll() {
        return resumeMapper.selectByExample(null);
    }

    @Override
    public void insert(QsResumeWithBLOBs qsResume) {
        resumeMapper.insert(qsResume);
    }

    @Override
    public List<QsJobs> findJobsAll() {
        return jobsMapper.selectByExample(null);
    }

    @Override
    public QsAdvResumeEducation findEducationById(Integer id) {
        return advResumeEducationMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateEducation(QsAdvResumeEducation advResumeEducation) {
        advResumeEducationMapper.updateByPrimaryKey(advResumeEducation);
    }

    @Override
    public void deleteEdu(Integer id) {
        advResumeEducationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public QsAdvResumeWork findWorkByIds(Integer id) {
        return advResumeWorkMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateWork(QsAdvResumeWork advResumeWork) {
        advResumeWorkMapper.updateByPrimaryKey(advResumeWork);
    }

    @Override
    public void deleteWork(Integer id) {
        advResumeWorkMapper.deleteByPrimaryKey(id);
    }

    @Override
    public QsAdvResumeTraining findPeixunByIds(Integer id) {
        return advResumeTrainingMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deletePeixun(Integer id) {
        advResumeTrainingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updatePeixunById(QsAdvResumeTraining advResumeTraining) {
        advResumeTrainingMapper.updateByPrimaryKey(advResumeTraining);
    }

    @Override
    public void deleteCreById(Integer id) {
        advResumeCredentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateCreById(QsAdvResumeCredent advResumeCredent) {
         advResumeCredentMapper.updateByPrimaryKey(advResumeCredent);
    }

    @Override
    public QsAdvResumeCredent findzhengshuByIds(Integer id) {
        return advResumeCredentMapper.selectByPrimaryKey(id);
    }

    @Override
    public QsAdvResumeLanguage findlanguageByIds(Integer id) {
        return advResumeLanguageMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteLanguageById(Integer id) {
        advResumeLanguageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateLanguageById(QsAdvResumeLanguage advResumeLanguage) {
        advResumeLanguageMapper.updateByPrimaryKey(advResumeLanguage);
    }

    @Override
    public PageResult queryLogs(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QsAdminLogExample example = new QsAdminLogExample();
        QsAdminLogExample.Criteria criteria = example.createCriteria();
        Page<QsAdminLog> page = (Page<QsAdminLog>) adminLogMapper.selectByExample(null);
        long totalPage  = (int) Math.ceil(page.getTotal()/ pageSize) + 1;
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public List<QsPersonalServiceStickLog> findStickAll() {
        return personalServiceStickLogMapper.selectByExample(null);
    }

    @Override
    public void addEducation(QsAdvResumeEducation advResumeEducation) {
        advResumeEducationMapper.insert(advResumeEducation);
    }


}
