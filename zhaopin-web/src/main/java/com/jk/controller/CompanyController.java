package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsCompanyProfile;
import com.jk.service.CompanyService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.ExportExcel;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：CompanyController
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-09 21:06
 * 修改人： 程龙
 * 修改时间：2019-09-09 21:06
 * 修改备注：
 * @version </pre>
 */
@RestController
@RequestMapping("company")
public class CompanyController {

    @Reference(timeout = 1200000)
    private CompanyService companyService;

    @RequestMapping("findCompanylist")
    public PageResult findCompanylist(QsCompanyProfile qsCompanyProfile, @RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "5")Integer rows){
        return companyService.findCompanylist(qsCompanyProfile,rows,page);
    }


   @RequestMapping("addCompany")
    public void addCompany(QsCompanyProfile qsCompanyProfile){
       companyService.addCompany(qsCompanyProfile);
   }

   @RequestMapping("delCompany")
   public Result delCompany(Integer[] ids){
       try {
           companyService.delCompany(ids);
           return new Result(true, "删除成功！");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false, "删除失败！");
   }

   @RequestMapping("findById")
   public QsCompanyProfile findById(Integer id){
     return   companyService.findById(id);
   }

   @RequestMapping("updCompany")
   public Result updCompany(Integer audit,Integer[] ids){

       try {
           companyService.updCompany(audit,ids);
           return new Result(true, "修改成功！");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false, "修改失败！");
   }

    @RequestMapping("exportResumeList")
    public void exportResumePhotoList(HttpServletResponse response){
        //获得数据信息
        List<QsCompanyProfile> CompanyList = companyService.findAll();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","公司名称","企业认证","创建时间","刷新时间", "套餐名称","在招职位"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;

        for (int i = 0; i < CompanyList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = CompanyList.get(i).getId();
            obj[1] = CompanyList.get(i).getCompanyname();
            obj[2] = CompanyList.get(i).getAudit();
            obj[3] = CompanyList.get(i).getAddtime();
            obj[4] = CompanyList.get(i).getRefreshtime();
            obj[5] = CompanyList.get(i).getSetmealName();
            obj[6] = CompanyList.get(i).getJobs();
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
        return  companyService.importXLS(filePath);
    }

}
