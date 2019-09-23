package com.jk.service.impl;/**
 * @类名: MembersSetmealProfilePointsServiceImpl
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-17 09:47
 **/

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jk.mapper.*;
import com.jk.pojo.*;
import com.jk.service.MembersSetmealProfilePointsService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * <pre>项目名称：zhaopin-parent    
 * 类名称：MembersSetmealProfilePointsServiceImpl    
 * 类描述：   
 * 创建人：顾可帅
 * 创建时间：2019-09-17 09:47   
 * 修改人：顾可帅
 * 修改时间：2019-09-17 09:47    
 * 修改备注：       
 * @version </pre>  
 */
@Service
public class MembersSetmealProfilePointsServiceImpl implements MembersSetmealProfilePointsService {

    @Autowired
    private QsCompanyProfileMapper companyProfileMapper;     //业务表

    @Autowired
    private QsMembersMapper membersMapper;                   //用户表

    @Autowired
    private QsMembersSetmealMapper membersSetmealMapper;    //会员表

    @Autowired
    private QsMembersPointsMapper membersPointsMapper;      //积分表

    @Autowired
    private QsJobsMapper jobsMapper;                      //职位发布

    @Autowired
    private QsOrderMapper orderMapper;                   //订单管理

    @Autowired
    private QsPromotionMapper promotionMapper;          //企业推广

    @Override
    public void quxiaotuiguang(Integer[] ids) {
        for (Integer id : ids) {
            promotionMapper.deleteByPrimaryKey (id);
        }
    }
    
    @Override
    public void updateIspaid(Integer id) {
        Byte ispaid=3;
        QsOrder qsOrder = new QsOrder ();
        qsOrder.setId (id);
        qsOrder.setIsPaid (ispaid);
        orderMapper.updateByPrimaryKeySelective (qsOrder);
    }

  

    @Override
    public PageResult findZhengZhiFuWu(Integer pageNum, Integer pageSize) {
        byte ispaid=2;
        List<OrderMembersJobsResult> result = new ArrayList<> ();
        PageHelper.startPage(pageNum, pageSize);
        QsOrderExample qsOrderExample = new QsOrderExample ();
        QsOrderExample.Criteria criteria = qsOrderExample.createCriteria ();
        criteria.andIsPaidEqualTo (ispaid);
        List<QsOrder> qsOrders = orderMapper.selectByExample (qsOrderExample);
        for (QsOrder qsOrder : qsOrders) {
            QsMembers members = membersMapper.selectByPrimaryKey (qsOrder.getUid ());
            QsJobsExample qsJobsExample = new QsJobsExample ();
            QsJobsExample.Criteria criteria1 = qsJobsExample.createCriteria ();
            criteria1.andUidEqualTo (qsOrder.getUid ());
            QsJobs qsJobs = jobsMapper.selectByExample (qsJobsExample).get (0);
            OrderMembersJobsResult orderMembersJobsResult = new OrderMembersJobsResult (qsOrder,qsJobs,members);
            result.add (orderMembersJobsResult);
        }
        return new PageResult(result.size (),result);
    }



    @Override
    public PageResult findPromotionJobsAll(QsPromotion promotion,Integer pageNum, Integer pageSize) {
        List<PromotionJobsBean> result = new ArrayList<PromotionJobsBean> ();
        List<QsPromotion> qsPromotions =null;
        PageHelper.startPage(pageNum, pageSize);
        if (promotion.getCpPtype ()!=null && !promotion.getCpPtype().equals ("") ){
            QsPromotionExample qsPromotionExample = new QsPromotionExample ();
            QsPromotionExample.Criteria criteria = qsPromotionExample.createCriteria ();
            criteria.andCpPtypeEqualTo (promotion.getCpPtype ());
            qsPromotions = promotionMapper.selectByExample (qsPromotionExample);
        }else  {
            qsPromotions = promotionMapper.selectByExample (null);
        }
        for (QsPromotion qsPromotion : qsPromotions) {
            QsJobsExample qsJobsExample = new QsJobsExample ();
            QsJobsExample.Criteria criteria1 = qsJobsExample.createCriteria ();
            criteria1.andUidEqualTo (qsPromotion.getCpUid ());
            QsJobs qsJob = jobsMapper.selectByExample (qsJobsExample).get (0);
            PromotionJobsBean promotionJobsBean = new PromotionJobsBean (qsJob,qsPromotion);
            result.add (promotionJobsBean);
        }
        return new PageResult(result.size (),result);
    }

    @Override
    public List<PromotionJobsBean> findPromotionJobsAll() {
        List<PromotionJobsBean> result = new ArrayList<PromotionJobsBean> ();
        List<QsPromotion> qsPromotions = promotionMapper.selectByExample (null);
        for (QsPromotion qsPromotion : qsPromotions) {
            QsJobsExample qsJobsExample = new QsJobsExample ();
            QsJobsExample.Criteria criteria1 = qsJobsExample.createCriteria ();
            criteria1.andUidEqualTo (qsPromotion.getCpUid ());
            QsJobs qsJob = jobsMapper.selectByExample (qsJobsExample).get (0);
            PromotionJobsBean promotionJobsBean = new PromotionJobsBean (qsJob,qsPromotion);
            result.add (promotionJobsBean);
        }
        return result;
    }


    @Override
    public PageResult findMembersSetmealProfilePointsList(Integer pageNum, Integer pageSize) {
        List<MembersSetmealProfilePoints> result = new ArrayList<MembersSetmealProfilePoints> ();
        PageHelper.startPage(pageNum, pageSize);
        List<QsCompanyProfile> companyProfiles = companyProfileMapper.selectByExample (null);
        for (QsCompanyProfile companyProfile : companyProfiles) {
            QsMembersSetmeal membersSetmeal= membersSetmealMapper.selectByPrimaryKey (companyProfile.getUid ());
            QsMembers members=membersMapper.selectByPrimaryKey (companyProfile.getUid ());
            QsMembersPoints membersPoints = membersPointsMapper.selectByPrimaryKey (companyProfile.getUid ());
            MembersSetmealProfilePoints membersSetmealProfilePoints = new MembersSetmealProfilePoints (companyProfile,members,membersPoints,membersSetmeal);
            result.add (membersSetmealProfilePoints);
        }
        return new PageResult(result.size (),result);
    }

    @Override
    public List<MembersSetmealProfilePoints> findMembersSetmealProfilePointsList() {
        List<MembersSetmealProfilePoints> result = new ArrayList<MembersSetmealProfilePoints> ();
        List<QsCompanyProfile> companyProfiles = companyProfileMapper.selectByExample (null);
        for (QsCompanyProfile companyProfile : companyProfiles) {
            QsMembersSetmeal membersSetmeal= membersSetmealMapper.selectByPrimaryKey (companyProfile.getUid ());
            QsMembers members=membersMapper.selectByPrimaryKey (companyProfile.getUid ());
            QsMembersPoints membersPoints = membersPointsMapper.selectByPrimaryKey (companyProfile.getUid ());
            MembersSetmealProfilePoints membersSetmealProfilePoints = new MembersSetmealProfilePoints (companyProfile,members,membersPoints,membersSetmeal);
            result.add (membersSetmealProfilePoints);
        }
        return result;
    }

    @Override
    public Map findcounthuiyuanAll() {
        Date date = new Date ();
        long dangqianshijian=date.getTime ()/1000;
        HashMap<String, Number> result = new HashMap<> ();
        int yueduhuiyuan=membersSetmealMapper.findcounthuiyuanAll(2);
        int jiduhuiyuan=membersSetmealMapper.findcounthuiyuanAll(3);
        int nianduhuiyuan=membersSetmealMapper.findcounthuiyuanAll(4);
        int yidaoqi=membersSetmealMapper.findcounthuiyuanyidaoqi(dangqianshijian);
        int weidaoqi=membersSetmealMapper.findcounthuiyuanweidaoqi(dangqianshijian);
        result.put ("yueduhuiyuan",yueduhuiyuan);
        result.put ("jiduhuiyuan",jiduhuiyuan);
        result.put ("nianduhuiyuan",nianduhuiyuan);
        result.put ("yidaoqi",yidaoqi);
        result.put ("weidaoqi",weidaoqi);
        return result;
    }

    @Override
    public PageResult findOrderMembersJobsResult(Integer pageNum, Integer pageSize) {
        List<OrderMembersJobsResult> result = new ArrayList<> ();
        PageHelper.startPage(pageNum, pageSize);
        List<QsOrder> qsOrders = orderMapper.selectByExample (null);
        for (QsOrder qsOrder : qsOrders) {
            QsMembers members = membersMapper.selectByPrimaryKey (qsOrder.getUid ());
            QsJobsExample qsJobsExample = new QsJobsExample ();
            QsJobsExample.Criteria criteria = qsJobsExample.createCriteria ();
            criteria.andUidEqualTo (qsOrder.getUid ());
            QsJobs qsJobs = jobsMapper.selectByExample (qsJobsExample).get (0);
            OrderMembersJobsResult orderMembersJobsResult = new OrderMembersJobsResult (qsOrder,qsJobs,members);
            result.add (orderMembersJobsResult);
        }
        return new PageResult(result.size (),result);
    }

    @Override
    public List<OrderMembersJobsResult> findOrderMembersJobsResult() {
        List<OrderMembersJobsResult> result = new ArrayList<> ();
        List<QsOrder> qsOrders = orderMapper.selectByExample (null);
        for (QsOrder qsOrder : qsOrders) {
            QsMembers members = membersMapper.selectByPrimaryKey (qsOrder.getUid ());
            QsJobsExample qsJobsExample = new QsJobsExample ();
            QsJobsExample.Criteria criteria = qsJobsExample.createCriteria ();
            criteria.andUidEqualTo (qsOrder.getUid ());
            QsJobs qsJobs = jobsMapper.selectByExample (qsJobsExample).get (0);
            OrderMembersJobsResult orderMembersJobsResult = new OrderMembersJobsResult (qsOrder,qsJobs,members);
            result.add (orderMembersJobsResult);
        }
        return result;
    }

    @Override
    public OrderMembersJobsResult findOrderMembersJobsResultById(Integer id) {

        QsOrder qsOrder = orderMapper.selectByPrimaryKey (id);
        QsMembers members = membersMapper.selectByPrimaryKey (qsOrder.getUid ());
        QsJobsExample qsJobsExample = new QsJobsExample ();
        QsJobsExample.Criteria criteria = qsJobsExample.createCriteria ();
        criteria.andUidEqualTo (qsOrder.getUid ());
        QsJobs qsJobs = jobsMapper.selectByExample (qsJobsExample).get (0);
        OrderMembersJobsResult orderMembersJobsResult = new OrderMembersJobsResult (qsOrder,qsJobs,members);
        return orderMembersJobsResult;
    }

    @Override
    public Map countfukuanAll() {
        HashMap<String, Number> result = new HashMap<> ();
        int yiwancheng=orderMapper.countfukuanAll(2);
        int yiquxiao=orderMapper.countfukuanAll(3);
        int daifukuan=orderMapper.countfukuanAll(1);
        result.put ("yiwancheng",yiwancheng);
        result.put ("daifukuan",daifukuan);
        result.put ("yiquxiao",yiquxiao);
        return result;
    }


}
