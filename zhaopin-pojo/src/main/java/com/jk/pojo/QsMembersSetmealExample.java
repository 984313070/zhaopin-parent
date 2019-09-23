package com.jk.pojo;

import java.util.ArrayList;
import java.util.List;

public class QsMembersSetmealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsMembersSetmealExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExpireIsNull() {
            addCriterion("expire is null");
            return (Criteria) this;
        }

        public Criteria andExpireIsNotNull() {
            addCriterion("expire is not null");
            return (Criteria) this;
        }

        public Criteria andExpireEqualTo(Boolean value) {
            addCriterion("expire =", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotEqualTo(Boolean value) {
            addCriterion("expire <>", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThan(Boolean value) {
            addCriterion("expire >", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireGreaterThanOrEqualTo(Boolean value) {
            addCriterion("expire >=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThan(Boolean value) {
            addCriterion("expire <", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireLessThanOrEqualTo(Boolean value) {
            addCriterion("expire <=", value, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireIn(List<Boolean> values) {
            addCriterion("expire in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotIn(List<Boolean> values) {
            addCriterion("expire not in", values, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireBetween(Boolean value1, Boolean value2) {
            addCriterion("expire between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andExpireNotBetween(Boolean value1, Boolean value2) {
            addCriterion("expire not between", value1, value2, "expire");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIsNull() {
            addCriterion("setmeal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIsNotNull() {
            addCriterion("setmeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetmealIdEqualTo(Integer value) {
            addCriterion("setmeal_id =", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotEqualTo(Integer value) {
            addCriterion("setmeal_id <>", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThan(Integer value) {
            addCriterion("setmeal_id >", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id >=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThan(Integer value) {
            addCriterion("setmeal_id <", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id <=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIn(List<Integer> values) {
            addCriterion("setmeal_id in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotIn(List<Integer> values) {
            addCriterion("setmeal_id not in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id between", value1, value2, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id not between", value1, value2, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealNameIsNull() {
            addCriterion("setmeal_name is null");
            return (Criteria) this;
        }

        public Criteria andSetmealNameIsNotNull() {
            addCriterion("setmeal_name is not null");
            return (Criteria) this;
        }

        public Criteria andSetmealNameEqualTo(String value) {
            addCriterion("setmeal_name =", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameNotEqualTo(String value) {
            addCriterion("setmeal_name <>", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameGreaterThan(String value) {
            addCriterion("setmeal_name >", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameGreaterThanOrEqualTo(String value) {
            addCriterion("setmeal_name >=", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameLessThan(String value) {
            addCriterion("setmeal_name <", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameLessThanOrEqualTo(String value) {
            addCriterion("setmeal_name <=", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameLike(String value) {
            addCriterion("setmeal_name like", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameNotLike(String value) {
            addCriterion("setmeal_name not like", value, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameIn(List<String> values) {
            addCriterion("setmeal_name in", values, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameNotIn(List<String> values) {
            addCriterion("setmeal_name not in", values, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameBetween(String value1, String value2) {
            addCriterion("setmeal_name between", value1, value2, "setmealName");
            return (Criteria) this;
        }

        public Criteria andSetmealNameNotBetween(String value1, String value2) {
            addCriterion("setmeal_name not between", value1, value2, "setmealName");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(Integer value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(Integer value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(Integer value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(Integer value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(Integer value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<Integer> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<Integer> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(Integer value1, Integer value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(Integer value1, Integer value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileIsNull() {
            addCriterion("jobs_meanwhile is null");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileIsNotNull() {
            addCriterion("jobs_meanwhile is not null");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileEqualTo(Integer value) {
            addCriterion("jobs_meanwhile =", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileNotEqualTo(Integer value) {
            addCriterion("jobs_meanwhile <>", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileGreaterThan(Integer value) {
            addCriterion("jobs_meanwhile >", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobs_meanwhile >=", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileLessThan(Integer value) {
            addCriterion("jobs_meanwhile <", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileLessThanOrEqualTo(Integer value) {
            addCriterion("jobs_meanwhile <=", value, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileIn(List<Integer> values) {
            addCriterion("jobs_meanwhile in", values, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileNotIn(List<Integer> values) {
            addCriterion("jobs_meanwhile not in", values, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileBetween(Integer value1, Integer value2) {
            addCriterion("jobs_meanwhile between", value1, value2, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andJobsMeanwhileNotBetween(Integer value1, Integer value2) {
            addCriterion("jobs_meanwhile not between", value1, value2, "jobsMeanwhile");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeIsNull() {
            addCriterion("refresh_jobs_free is null");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeIsNotNull() {
            addCriterion("refresh_jobs_free is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeEqualTo(Integer value) {
            addCriterion("refresh_jobs_free =", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeNotEqualTo(Integer value) {
            addCriterion("refresh_jobs_free <>", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeGreaterThan(Integer value) {
            addCriterion("refresh_jobs_free >", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refresh_jobs_free >=", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeLessThan(Integer value) {
            addCriterion("refresh_jobs_free <", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeLessThanOrEqualTo(Integer value) {
            addCriterion("refresh_jobs_free <=", value, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeIn(List<Integer> values) {
            addCriterion("refresh_jobs_free in", values, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeNotIn(List<Integer> values) {
            addCriterion("refresh_jobs_free not in", values, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeBetween(Integer value1, Integer value2) {
            addCriterion("refresh_jobs_free between", value1, value2, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andRefreshJobsFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("refresh_jobs_free not between", value1, value2, "refreshJobsFree");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeIsNull() {
            addCriterion("download_resume is null");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeIsNotNull() {
            addCriterion("download_resume is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeEqualTo(Integer value) {
            addCriterion("download_resume =", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeNotEqualTo(Integer value) {
            addCriterion("download_resume <>", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeGreaterThan(Integer value) {
            addCriterion("download_resume >", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_resume >=", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeLessThan(Integer value) {
            addCriterion("download_resume <", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeLessThanOrEqualTo(Integer value) {
            addCriterion("download_resume <=", value, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeIn(List<Integer> values) {
            addCriterion("download_resume in", values, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeNotIn(List<Integer> values) {
            addCriterion("download_resume not in", values, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeBetween(Integer value1, Integer value2) {
            addCriterion("download_resume between", value1, value2, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeNotBetween(Integer value1, Integer value2) {
            addCriterion("download_resume not between", value1, value2, "downloadResume");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxIsNull() {
            addCriterion("download_resume_max is null");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxIsNotNull() {
            addCriterion("download_resume_max is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxEqualTo(Integer value) {
            addCriterion("download_resume_max =", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxNotEqualTo(Integer value) {
            addCriterion("download_resume_max <>", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxGreaterThan(Integer value) {
            addCriterion("download_resume_max >", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_resume_max >=", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxLessThan(Integer value) {
            addCriterion("download_resume_max <", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxLessThanOrEqualTo(Integer value) {
            addCriterion("download_resume_max <=", value, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxIn(List<Integer> values) {
            addCriterion("download_resume_max in", values, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxNotIn(List<Integer> values) {
            addCriterion("download_resume_max not in", values, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxBetween(Integer value1, Integer value2) {
            addCriterion("download_resume_max between", value1, value2, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andDownloadResumeMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("download_resume_max not between", value1, value2, "downloadResumeMax");
            return (Criteria) this;
        }

        public Criteria andAddedIsNull() {
            addCriterion("added is null");
            return (Criteria) this;
        }

        public Criteria andAddedIsNotNull() {
            addCriterion("added is not null");
            return (Criteria) this;
        }

        public Criteria andAddedEqualTo(String value) {
            addCriterion("added =", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotEqualTo(String value) {
            addCriterion("added <>", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThan(String value) {
            addCriterion("added >", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedGreaterThanOrEqualTo(String value) {
            addCriterion("added >=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThan(String value) {
            addCriterion("added <", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLessThanOrEqualTo(String value) {
            addCriterion("added <=", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedLike(String value) {
            addCriterion("added like", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotLike(String value) {
            addCriterion("added not like", value, "added");
            return (Criteria) this;
        }

        public Criteria andAddedIn(List<String> values) {
            addCriterion("added in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotIn(List<String> values) {
            addCriterion("added not in", values, "added");
            return (Criteria) this;
        }

        public Criteria andAddedBetween(String value1, String value2) {
            addCriterion("added between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andAddedNotBetween(String value1, String value2) {
            addCriterion("added not between", value1, value2, "added");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andSetmealImgIsNull() {
            addCriterion("setmeal_img is null");
            return (Criteria) this;
        }

        public Criteria andSetmealImgIsNotNull() {
            addCriterion("setmeal_img is not null");
            return (Criteria) this;
        }

        public Criteria andSetmealImgEqualTo(String value) {
            addCriterion("setmeal_img =", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgNotEqualTo(String value) {
            addCriterion("setmeal_img <>", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgGreaterThan(String value) {
            addCriterion("setmeal_img >", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgGreaterThanOrEqualTo(String value) {
            addCriterion("setmeal_img >=", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgLessThan(String value) {
            addCriterion("setmeal_img <", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgLessThanOrEqualTo(String value) {
            addCriterion("setmeal_img <=", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgLike(String value) {
            addCriterion("setmeal_img like", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgNotLike(String value) {
            addCriterion("setmeal_img not like", value, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgIn(List<String> values) {
            addCriterion("setmeal_img in", values, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgNotIn(List<String> values) {
            addCriterion("setmeal_img not in", values, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgBetween(String value1, String value2) {
            addCriterion("setmeal_img between", value1, value2, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andSetmealImgNotBetween(String value1, String value2) {
            addCriterion("setmeal_img not between", value1, value2, "setmealImg");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactIsNull() {
            addCriterion("show_apply_contact is null");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactIsNotNull() {
            addCriterion("show_apply_contact is not null");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactEqualTo(Boolean value) {
            addCriterion("show_apply_contact =", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactNotEqualTo(Boolean value) {
            addCriterion("show_apply_contact <>", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactGreaterThan(Boolean value) {
            addCriterion("show_apply_contact >", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_apply_contact >=", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactLessThan(Boolean value) {
            addCriterion("show_apply_contact <", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactLessThanOrEqualTo(Boolean value) {
            addCriterion("show_apply_contact <=", value, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactIn(List<Boolean> values) {
            addCriterion("show_apply_contact in", values, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactNotIn(List<Boolean> values) {
            addCriterion("show_apply_contact not in", values, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactBetween(Boolean value1, Boolean value2) {
            addCriterion("show_apply_contact between", value1, value2, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andShowApplyContactNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_apply_contact not between", value1, value2, "showApplyContact");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Boolean value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Boolean value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Boolean value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Boolean value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Boolean> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Boolean> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeIsNull() {
            addCriterion("discount_download_resume is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeIsNotNull() {
            addCriterion("discount_download_resume is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeEqualTo(Double value) {
            addCriterion("discount_download_resume =", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeNotEqualTo(Double value) {
            addCriterion("discount_download_resume <>", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeGreaterThan(Double value) {
            addCriterion("discount_download_resume >", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_download_resume >=", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeLessThan(Double value) {
            addCriterion("discount_download_resume <", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeLessThanOrEqualTo(Double value) {
            addCriterion("discount_download_resume <=", value, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeIn(List<Double> values) {
            addCriterion("discount_download_resume in", values, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeNotIn(List<Double> values) {
            addCriterion("discount_download_resume not in", values, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeBetween(Double value1, Double value2) {
            addCriterion("discount_download_resume between", value1, value2, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountDownloadResumeNotBetween(Double value1, Double value2) {
            addCriterion("discount_download_resume not between", value1, value2, "discountDownloadResume");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsIsNull() {
            addCriterion("discount_sms is null");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsIsNotNull() {
            addCriterion("discount_sms is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsEqualTo(Double value) {
            addCriterion("discount_sms =", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsNotEqualTo(Double value) {
            addCriterion("discount_sms <>", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsGreaterThan(Double value) {
            addCriterion("discount_sms >", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_sms >=", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsLessThan(Double value) {
            addCriterion("discount_sms <", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsLessThanOrEqualTo(Double value) {
            addCriterion("discount_sms <=", value, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsIn(List<Double> values) {
            addCriterion("discount_sms in", values, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsNotIn(List<Double> values) {
            addCriterion("discount_sms not in", values, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsBetween(Double value1, Double value2) {
            addCriterion("discount_sms between", value1, value2, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountSmsNotBetween(Double value1, Double value2) {
            addCriterion("discount_sms not between", value1, value2, "discountSms");
            return (Criteria) this;
        }

        public Criteria andDiscountStickIsNull() {
            addCriterion("discount_stick is null");
            return (Criteria) this;
        }

        public Criteria andDiscountStickIsNotNull() {
            addCriterion("discount_stick is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountStickEqualTo(Double value) {
            addCriterion("discount_stick =", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickNotEqualTo(Double value) {
            addCriterion("discount_stick <>", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickGreaterThan(Double value) {
            addCriterion("discount_stick >", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_stick >=", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickLessThan(Double value) {
            addCriterion("discount_stick <", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickLessThanOrEqualTo(Double value) {
            addCriterion("discount_stick <=", value, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickIn(List<Double> values) {
            addCriterion("discount_stick in", values, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickNotIn(List<Double> values) {
            addCriterion("discount_stick not in", values, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickBetween(Double value1, Double value2) {
            addCriterion("discount_stick between", value1, value2, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountStickNotBetween(Double value1, Double value2) {
            addCriterion("discount_stick not between", value1, value2, "discountStick");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyIsNull() {
            addCriterion("discount_emergency is null");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyIsNotNull() {
            addCriterion("discount_emergency is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyEqualTo(Double value) {
            addCriterion("discount_emergency =", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyNotEqualTo(Double value) {
            addCriterion("discount_emergency <>", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyGreaterThan(Double value) {
            addCriterion("discount_emergency >", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_emergency >=", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyLessThan(Double value) {
            addCriterion("discount_emergency <", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyLessThanOrEqualTo(Double value) {
            addCriterion("discount_emergency <=", value, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyIn(List<Double> values) {
            addCriterion("discount_emergency in", values, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyNotIn(List<Double> values) {
            addCriterion("discount_emergency not in", values, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyBetween(Double value1, Double value2) {
            addCriterion("discount_emergency between", value1, value2, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountEmergencyNotBetween(Double value1, Double value2) {
            addCriterion("discount_emergency not between", value1, value2, "discountEmergency");
            return (Criteria) this;
        }

        public Criteria andDiscountTplIsNull() {
            addCriterion("discount_tpl is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTplIsNotNull() {
            addCriterion("discount_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTplEqualTo(Double value) {
            addCriterion("discount_tpl =", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplNotEqualTo(Double value) {
            addCriterion("discount_tpl <>", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplGreaterThan(Double value) {
            addCriterion("discount_tpl >", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_tpl >=", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplLessThan(Double value) {
            addCriterion("discount_tpl <", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplLessThanOrEqualTo(Double value) {
            addCriterion("discount_tpl <=", value, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplIn(List<Double> values) {
            addCriterion("discount_tpl in", values, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplNotIn(List<Double> values) {
            addCriterion("discount_tpl not in", values, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplBetween(Double value1, Double value2) {
            addCriterion("discount_tpl between", value1, value2, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountTplNotBetween(Double value1, Double value2) {
            addCriterion("discount_tpl not between", value1, value2, "discountTpl");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsIsNull() {
            addCriterion("discount_auto_refresh_jobs is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsIsNotNull() {
            addCriterion("discount_auto_refresh_jobs is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsEqualTo(Double value) {
            addCriterion("discount_auto_refresh_jobs =", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsNotEqualTo(Double value) {
            addCriterion("discount_auto_refresh_jobs <>", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsGreaterThan(Double value) {
            addCriterion("discount_auto_refresh_jobs >", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_auto_refresh_jobs >=", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsLessThan(Double value) {
            addCriterion("discount_auto_refresh_jobs <", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsLessThanOrEqualTo(Double value) {
            addCriterion("discount_auto_refresh_jobs <=", value, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsIn(List<Double> values) {
            addCriterion("discount_auto_refresh_jobs in", values, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsNotIn(List<Double> values) {
            addCriterion("discount_auto_refresh_jobs not in", values, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsBetween(Double value1, Double value2) {
            addCriterion("discount_auto_refresh_jobs between", value1, value2, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andDiscountAutoRefreshJobsNotBetween(Double value1, Double value2) {
            addCriterion("discount_auto_refresh_jobs not between", value1, value2, "discountAutoRefreshJobs");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectIsNull() {
            addCriterion("show_contact_direct is null");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectIsNotNull() {
            addCriterion("show_contact_direct is not null");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectEqualTo(Boolean value) {
            addCriterion("show_contact_direct =", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectNotEqualTo(Boolean value) {
            addCriterion("show_contact_direct <>", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectGreaterThan(Boolean value) {
            addCriterion("show_contact_direct >", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_contact_direct >=", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectLessThan(Boolean value) {
            addCriterion("show_contact_direct <", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectLessThanOrEqualTo(Boolean value) {
            addCriterion("show_contact_direct <=", value, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectIn(List<Boolean> values) {
            addCriterion("show_contact_direct in", values, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectNotIn(List<Boolean> values) {
            addCriterion("show_contact_direct not in", values, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectBetween(Boolean value1, Boolean value2) {
            addCriterion("show_contact_direct between", value1, value2, "showContactDirect");
            return (Criteria) this;
        }

        public Criteria andShowContactDirectNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_contact_direct not between", value1, value2, "showContactDirect");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}