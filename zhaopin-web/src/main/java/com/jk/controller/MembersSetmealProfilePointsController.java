package com.jk.controller;/**
 * @类名: MembersSetmealProfilePointsController
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-17 09:40
 **/

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.pojo.MembersSetmealProfilePoints;
import com.jk.pojo.OrderMembersJobsResult;
import com.jk.pojo.PromotionJobsBean;
import com.jk.pojo.QsPromotion;
import com.jk.service.MembersSetmealProfilePointsService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ExportExcel;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：MembersSetmealProfilePointsController    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-17 09:40   
 * 修改人：顾可帅
 * 修改时间：2019-09-17 09:40    
 * 修改备注：       
 * @version </pre>  
 */
@RestController
@RequestMapping("/membersSetmealProfilePoints")
public class MembersSetmealProfilePointsController {

    @Reference
    private MembersSetmealProfilePointsService membersSetmealProfilePointsService;

    @RequestMapping("/findMembersSetmealProfilePointsList")
    public PageResult findMembersSetmealProfilePointsList(Integer page, Integer rows){
       return  membersSetmealProfilePointsService.findMembersSetmealProfilePointsList(page,rows);
    }

    @RequestMapping("/findcounthuiyuanAll")
    public Map findcounthuiyuanAll(){
        return membersSetmealProfilePointsService.findcounthuiyuanAll();
    }

    @RequestMapping("/findOrderMembersJobsResult")
    public PageResult findOrderMembersJobsResult(Integer page, Integer rows){
        return membersSetmealProfilePointsService.findOrderMembersJobsResult(page,rows);
    }

    @RequestMapping("/countfukuanAll")
    public Map countfukuanAll(){
        return membersSetmealProfilePointsService.countfukuanAll();
    }

    @RequestMapping("/findPromotionJobsAll")
    public PageResult findPromotionJobsAll(QsPromotion promotion, Integer page, Integer rows){
        return membersSetmealProfilePointsService.findPromotionJobsAll (promotion,page,rows);
    }

    @RequestMapping("/findZhengZhiFuWu")
    public PageResult findZhengZhiFuWu(Integer page, Integer rows){
        return membersSetmealProfilePointsService.findZhengZhiFuWu(page,rows);
    }

    @RequestMapping("/updateIspaid")
    public void updateIspaid (Integer id){
        membersSetmealProfilePointsService.updateIspaid (id);
    }

    @RequestMapping("/quxiaotuiguang")
    public Result quxiaotuiguang(Integer[] ids){
        try {
            membersSetmealProfilePointsService.quxiaotuiguang (ids);
            return new Result (true ,"取消成功");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return new Result (false ,"取消失败");
    }

    @RequestMapping("/exportTaoChanShuju")
    public void exportTaoChanShuju(HttpServletResponse response){
        //获得数据信息
        List<MembersSetmealProfilePoints> TaoChanShujuList = membersSetmealProfilePointsService.findMembersSetmealProfilePointsList ();
        //标题
        String title = "套餐信息";
        String[] rowsName = new String[]{"套餐名称","公司名称","用户名","开始时间","结束时间", "剩余天数"};
        //定义数据集合
       List<Object[]> objects = new ArrayList<Object[]> ();
        Object[] obj = null;
        for (int i = 0; i < TaoChanShujuList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = TaoChanShujuList.get(i).getCompanyProfile ().getSetmealName ();
            obj[1] = TaoChanShujuList.get(i).getCompanyProfile ().getCompanyname ();
            obj[2] = TaoChanShujuList.get(i).getMembers ().getUsername ();
            obj[3] = TaoChanShujuList.get(i).getMembersSetmeal ().getStarttime ();
            obj[4] = TaoChanShujuList.get(i).getMembersSetmeal ().getEndtime ();
            obj[5] = Math.floor((TaoChanShujuList.get(i).getMembersSetmeal ().getEndtime () - new Date ().getTime ()/1000)/60/60/24);
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel (title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 @RequestMapping("/exportJiFenShuJu")
public void exportJiFenShuJu(HttpServletResponse response){
    //获得数据信息
    List<MembersSetmealProfilePoints> TaoChanShujuList = membersSetmealProfilePointsService.findMembersSetmealProfilePointsList ();
    //标题
    String title = "积分信息";
    String[] rowsName = new String[]{"公司名称","积分数","用户名","注册时间"};
    //定义数据集合
    List<Object[]> objects = new ArrayList<Object[]> ();
    Object[] obj = null;
    for (int i = 0; i < TaoChanShujuList.size(); i++) {
        obj = new Object[rowsName.length];
        obj[0] = TaoChanShujuList.get(i).getCompanyProfile ().getCompanyname ();
        obj[1] = TaoChanShujuList.get(i).getMembersPoints ().getPoints ();
        obj[2] = TaoChanShujuList.get(i).getMembers ().getUsername ();
        obj[3] = TaoChanShujuList.get(i).getMembers ().getRegTime ();
        objects.add(obj);
    }

    ExportExcel exportExcel = new ExportExcel (title, rowsName, objects, response);
    try {
        exportExcel.export();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@RequestMapping("/exportDingDanGuanLi")
public void  exportDingDanGuanLi(HttpServletResponse response){
        //获得数据信息
        List<OrderMembersJobsResult> DingDanGuanLiList = membersSetmealProfilePointsService.findOrderMembersJobsResult ();
        //标题
        String title = "订单管理信息";
        String[] rowsName = new String[]{"付款状态","金额","公司名称","说明","单号","申请会员","申请时间","支付方式"};
        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]> ();
        Object[] obj = null;
        for (int i = 0; i < DingDanGuanLiList.size(); i++) {
            obj = new Object[rowsName.length];
            if (DingDanGuanLiList.get(i).getOrder ().getIsPaid ()==1){
                obj[0] ="待付款";
            }else if (DingDanGuanLiList.get(i).getOrder ().getIsPaid ()==2){
                obj[0] ="已完成";
            }else {
                obj[0] ="已取消";
            }

            obj[1] = "￥"+DingDanGuanLiList.get(i).getOrder ().getAmount ()+"元";
            obj[2] = DingDanGuanLiList.get(i).getJobs ().getCompanyname ();
            obj[3] = DingDanGuanLiList.get(i).getOrder ().getServiceName ();
            obj[4] = DingDanGuanLiList.get(i).getOrder ().getOid ();
            obj[5] = DingDanGuanLiList.get(i).getMembers ().getUsername ();
            obj[6] = DingDanGuanLiList.get(i).getOrder ().getAddtime ();
            obj[7] = DingDanGuanLiList.get(i).getOrder ().getPaymentCn ();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel (title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/exportqiyetuiguang")
    public void exportqiyetuiguang(HttpServletResponse response){
        List<PromotionJobsBean> PromotionJobsBeanList=membersSetmealProfilePointsService.findPromotionJobsAll();
        //标题
        String title = "企业推广";
        String[] rowsName = new String[]{"职位名称","所属公司","开始时间","结束时间"};
        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]> ();
        Object[] obj = null;
        for (int i = 0; i < PromotionJobsBeanList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = PromotionJobsBeanList.get(i).getJobs ().getJobsName ();
            obj[1] = PromotionJobsBeanList.get(i).getJobs ().getCompanyname ();
            obj[2] = PromotionJobsBeanList.get(i).getPromotion ().getCpStarttime ();
            obj[3] = PromotionJobsBeanList.get(i).getPromotion ().getCpEndtime ();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel (title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/exportZhengZhiFuWu")
    public void exportZhengZhiFuWu(HttpServletResponse response,Integer page,Integer rows){
        List<OrderMembersJobsResult> orderMembersJobsResults= membersSetmealProfilePointsService.findZhengZhiFuWu (page, rows).getRows ();
        //标题
        String title = "增值服务";
        String[] rowsName = new String[]{"服务内容","公司名称","申请会员","金额","时间"};
        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]> ();
        Object[] obj = null;
        for (int i = 0; i < orderMembersJobsResults.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = orderMembersJobsResults.get(i).getOrder ().getServiceName ();
            obj[1] = orderMembersJobsResults.get(i).getJobs ().getCompanyname ();
            obj[2] = orderMembersJobsResults.get(i).getMembers ().getUsername ();
            obj[3] = "￥"+orderMembersJobsResults.get(i).getOrder ().getAmount ()+"元";
            obj[4] = orderMembersJobsResults.get(i).getOrder ().getAddtime ();
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel (title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/findOrderMembersJobsResultById")
    public OrderMembersJobsResult findOrderMembersJobsResultById(Integer id){
      return   membersSetmealProfilePointsService.findOrderMembersJobsResultById (id);
    }
}
