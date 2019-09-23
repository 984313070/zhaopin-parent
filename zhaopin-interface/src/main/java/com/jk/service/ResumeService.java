package com.jk.service;

import com.jk.pojo.*;
import entity.PageResult;

import java.util.List;

public interface ResumeService {

    //PageResult findPage(QsResumeExample qsResume, int pageNum, int pageSize);

    PageResult findPage(QsResume qsResume, int pageNum, int pageSize);

    void delResume(Integer[] ids);

    void deleteResumeById(Integer id);

    QsResume findResumeById(Integer id);

    PageResult findCenter(QsJobs qsJobs, int pageNum, int pageSize);

    PageResult findPerson(int pageNum, int pageSize);

    PageResult findPersonById(Integer id,int pageNum, int pageSize);

    void updatePersonPromotion(QsPersonalServiceStickLog personalServiceStickLog);

    PageResult findTop(QsAdvResume advResume, int pageNum, int pageSize);

    QsAdvResume findTopById(Integer id);

    void updateAdv(QsAdvResume advResume);

    PageResult findEducation(QsAdvResumeEducation advResumeEducation,int pageNum, int pageSize);

    PageResult findWork(QsAdvResumeWork resumeWork, int pageNum, int pageSize);

    PageResult peixunjigou(QsAdvResumeTraining advResumeTraining, int pageNum, int pageSize);

    PageResult findCre(QsAdvResumeCredent advResumeCredent,int pageNum, int pageSize);

    PageResult findLanguage(QsAdvResumeLanguage advResumeLanguage, int pageNum, int pageSize);

    void deleteTopById(Integer id);

    void deleteTops(Integer[] ids);

    List<QsResume> findAll();

    void insert(QsResumeWithBLOBs qsResume);

    List<QsJobs> findJobsAll();

    QsAdvResumeEducation findEducationById(Integer id);

    void updateEducation(QsAdvResumeEducation advResumeEducation);

    void deleteEdu(Integer id);

    QsAdvResumeWork findWorkByIds(Integer id);

    void updateWork(QsAdvResumeWork advResumeWork);

    void deleteWork(Integer id);

    QsAdvResumeTraining findPeixunByIds(Integer id);

    void deletePeixun(Integer id);

    void updatePeixunById(QsAdvResumeTraining advResumeTraining);

    void deleteCreById(Integer id);

    void updateCreById(QsAdvResumeCredent advResumeCredent);

    QsAdvResumeCredent findzhengshuByIds(Integer id);

    QsAdvResumeLanguage findlanguageByIds(Integer id);

    void deleteLanguageById(Integer id);

    void updateLanguageById(QsAdvResumeLanguage advResumeLanguage);

    PageResult queryLogs(int pageNum, int pageSize);

    List<QsPersonalServiceStickLog> findStickAll();

    void addEducation(QsAdvResumeEducation advResumeEducation);
}
