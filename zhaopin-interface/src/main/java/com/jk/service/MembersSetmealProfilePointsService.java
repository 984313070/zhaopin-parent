package com.jk.service;

import com.jk.pojo.MembersSetmealProfilePoints;
import com.jk.pojo.OrderMembersJobsResult;
import com.jk.pojo.PromotionJobsBean;
import com.jk.pojo.QsPromotion;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * @类名: MembersSetmealProfilePointsService
 * @描述:
 * @作者: 顾可帅
 * @时间: 2019-09-17 09:44
 **/
public interface MembersSetmealProfilePointsService {


    public PageResult findMembersSetmealProfilePointsList(Integer pageNum , Integer pageSize);

    public List<MembersSetmealProfilePoints> findMembersSetmealProfilePointsList();

    public Map findcounthuiyuanAll();

    public PageResult findOrderMembersJobsResult(Integer pageNum , Integer pageSize);

    public List<OrderMembersJobsResult> findOrderMembersJobsResult();

    public OrderMembersJobsResult findOrderMembersJobsResultById(Integer id);

    public Map countfukuanAll();

    public PageResult findPromotionJobsAll(QsPromotion promotion, Integer pageNum , Integer pageSize);

    public List<PromotionJobsBean> findPromotionJobsAll();

    public PageResult findZhengZhiFuWu( Integer pageNum , Integer pageSize);

    public void updateIspaid(Integer id);

    public void quxiaotuiguang(Integer[] ids);


}
