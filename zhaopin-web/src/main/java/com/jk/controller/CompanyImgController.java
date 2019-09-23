package com.jk.controller;/**
 * @类名: CompanyImgController
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-10 17:06
 **/

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.QsCompanyImg;
import com.jk.service.CompanyImgService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：CompanyImgController    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-10 17:06   
 * 修改人：顾可帅
 * 修改时间：2019-09-10 17:06    
 * 修改备注：       
 * @version </pre>  
 */
@RestController
@RequestMapping("/companyImg")
public class CompanyImgController {
    @Reference
    private CompanyImgService companyImgService;

    @RequestMapping("/findCompanyImgList")
    public PageResult findCompanyImgList(QsCompanyImg companyImg, Integer page, Integer rows){
        return companyImgService.findCompanyImgList (companyImg,page,rows);
    }

    @RequestMapping("/deletecompanyImg")
    public Result deletecompanyImg(Integer id){
        try {
            companyImgService.deletecompanyImg (id);
            return new Result (true,"删除完成");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return new Result (false,"删除失败");
    }

    @RequestMapping("/updateImg")
    public Result updateImg(Integer[] ids,Integer audit){
        try {
            companyImgService.updatecompanyImg (ids,audit);
            return new Result (true ,"审核成功");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return new Result (false ,"审核失败");
    }


}
