package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsCompanyProfile;
import com.jk.service.CompanyService;
import entity.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
   public void delCompany(Integer[] ids){
       companyService.delCompany(ids);
   }
   @RequestMapping("deleteCompany")
   public void deleteCompany(Integer id){
       companyService.deleteCompany(id);
   }

   @RequestMapping("findById")
   public QsCompanyProfile findById(Integer id){
     return   companyService.findById(id);
   }

   @RequestMapping("updCompany")
   public void updCompany(QsCompanyProfile qsCompanyProfile){
       companyService.updCompany(qsCompanyProfile);
   }

}
