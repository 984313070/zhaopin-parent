package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsJobs;
import com.jk.service.JobsService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ExportExcel;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：JobsController
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-10 16:34
 * 修改人： 程龙
 * 修改时间：2019-09-10 16:34
 * 修改备注：
 * @version </pre>
 */
@RestController
@RequestMapping("jobs")
public class JobsController {

    @Reference(timeout = 1200000)
    private JobsService jobsService;

    @RequestMapping("/findJobsList")
    public PageResult findJobsList(QsJobs qsJobs, Integer rows, Integer page){
     return   jobsService.findJobsList(qsJobs,rows,page);
    }

    @RequestMapping("/findById")
    public QsJobs findById(Integer id){
        return  jobsService.findById(id);
    }

    @RequestMapping("/delJobs")
    public Result delJobs(String ids){
        try {
            jobsService.delJobs(ids);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, "删除失败！");
    }



    @RequestMapping("updJobs")
    public Result updJobs(Integer audit,Integer[] ids){
        try {
            jobsService.updJobs(audit,ids);
            return new Result(true, "修改成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, "修改失败！");
    }

    @RequestMapping("exportResumeList")
    public void exportResumePhotoList(HttpServletResponse response){
        //获得数据信息
        List<QsJobs> jobsList = jobsService.findAll();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","职位名称","公司名称","审核状态","发布时间", "刷新时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;

        for (int i = 0; i < jobsList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = jobsList.get(i).getId();
            obj[1] = jobsList.get(i).getJobsName();
            obj[2] = jobsList.get(i).getCompanyname();
            obj[3] = jobsList.get(i).getAudit();
            obj[4] = jobsList.get(i).getAddtime();
            obj[5] = jobsList.get(i).getRefreshtime();
            objects.add(obj);
        }
        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("importXLS")
    public Result importXLS(String filePath){
        return  jobsService.importXLS(filePath);
    }

}
