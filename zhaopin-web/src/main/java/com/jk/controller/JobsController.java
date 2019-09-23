package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsJobs;
import com.jk.service.JobsService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
