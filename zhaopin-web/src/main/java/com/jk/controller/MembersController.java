package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.CompanyService;
import com.jk.service.MembersService;
import entity.MembersResult;
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
 * 类名称：MembersController
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-16 20:24
 * 修改人： 程龙
 * 修改时间：2019-09-16 20:24
 * 修改备注：
 * @version </pre>
 */
@RestController
@RequestMapping("members")
public class MembersController {
    @Reference
    private MembersService membersService;

    @Reference
    private CompanyService companyService;

    @RequestMapping("findMemberslist")
    public PageResult findMemberslist(QsMembers qsMembers,@RequestParam(defaultValue = "5") Integer rows, @RequestParam(defaultValue = "1") Integer page){
        return membersService.findMemberslist(qsMembers,rows,page);
    }
    @RequestMapping("/delMembers")
    public Result delMembers(Integer[] ids){
        try {
            membersService.delMembers(ids);
            return new Result(true, "删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, "删除失败！");
    }

    @RequestMapping("exportResumeList")
   public void exportResumePhotoList(HttpServletResponse response){
       QsMembers qsMembers=new QsMembers();
        //获得数据信息
        List<MembersResult> MembersResultList = membersService.findMemberslist(qsMembers,5,1).getRows();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"序号","用户名","企业信息","手机","email", "注册时间","最后登录时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();
        Object[] obj = null;
        for (int i = 0; i < MembersResultList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = MembersResultList.get(i).getQsMembers().getUid();
            obj[1] = MembersResultList.get(i).getQsMembers().getUsername();
            obj[2] = MembersResultList.get(i).getQsCompanyProfile().getCompanyname();
            obj[3] = MembersResultList.get(i).getQsMembers().getMobile();
            obj[4] = MembersResultList.get(i).getQsMembers().getEmail();
            obj[5] = MembersResultList.get(i).getQsMembers().getRegTime();
            obj[6] = MembersResultList.get(i).getQsMembers().getLastLoginTime();
            objects.add(obj);
        }
        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
