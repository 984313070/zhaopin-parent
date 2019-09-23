package com.jk.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QsJobsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsJobsExample() {
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

        public Criteria andJobsNameIsNull() {
            addCriterion("jobs_name is null");
            return (Criteria) this;
        }

        public Criteria andJobsNameIsNotNull() {
            addCriterion("jobs_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobsNameEqualTo(String value) {
            addCriterion("jobs_name =", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameNotEqualTo(String value) {
            addCriterion("jobs_name <>", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameGreaterThan(String value) {
            addCriterion("jobs_name >", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameGreaterThanOrEqualTo(String value) {
            addCriterion("jobs_name >=", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameLessThan(String value) {
            addCriterion("jobs_name <", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameLessThanOrEqualTo(String value) {
            addCriterion("jobs_name <=", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameLike(String value) {
            addCriterion("jobs_name like", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameNotLike(String value) {
            addCriterion("jobs_name not like", value, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameIn(List<String> values) {
            addCriterion("jobs_name in", values, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameNotIn(List<String> values) {
            addCriterion("jobs_name not in", values, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameBetween(String value1, String value2) {
            addCriterion("jobs_name between", value1, value2, "jobsName");
            return (Criteria) this;
        }

        public Criteria andJobsNameNotBetween(String value1, String value2) {
            addCriterion("jobs_name not between", value1, value2, "jobsName");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeIsNull() {
            addCriterion("company_addtime is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeIsNotNull() {
            addCriterion("company_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeEqualTo(Integer value) {
            addCriterion("company_addtime =", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeNotEqualTo(Integer value) {
            addCriterion("company_addtime <>", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeGreaterThan(Integer value) {
            addCriterion("company_addtime >", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_addtime >=", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeLessThan(Integer value) {
            addCriterion("company_addtime <", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("company_addtime <=", value, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeIn(List<Integer> values) {
            addCriterion("company_addtime in", values, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeNotIn(List<Integer> values) {
            addCriterion("company_addtime not in", values, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("company_addtime between", value1, value2, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_addtime not between", value1, value2, "companyAddtime");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditIsNull() {
            addCriterion("company_audit is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditIsNotNull() {
            addCriterion("company_audit is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditEqualTo(Boolean value) {
            addCriterion("company_audit =", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditNotEqualTo(Boolean value) {
            addCriterion("company_audit <>", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditGreaterThan(Boolean value) {
            addCriterion("company_audit >", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("company_audit >=", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditLessThan(Boolean value) {
            addCriterion("company_audit <", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("company_audit <=", value, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditIn(List<Boolean> values) {
            addCriterion("company_audit in", values, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditNotIn(List<Boolean> values) {
            addCriterion("company_audit not in", values, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("company_audit between", value1, value2, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andCompanyAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("company_audit not between", value1, value2, "companyAudit");
            return (Criteria) this;
        }

        public Criteria andEmergencyIsNull() {
            addCriterion("emergency is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyIsNotNull() {
            addCriterion("emergency is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyEqualTo(Boolean value) {
            addCriterion("emergency =", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotEqualTo(Boolean value) {
            addCriterion("emergency <>", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThan(Boolean value) {
            addCriterion("emergency >", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("emergency >=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThan(Boolean value) {
            addCriterion("emergency <", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyLessThanOrEqualTo(Boolean value) {
            addCriterion("emergency <=", value, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyIn(List<Boolean> values) {
            addCriterion("emergency in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotIn(List<Boolean> values) {
            addCriterion("emergency not in", values, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyBetween(Boolean value1, Boolean value2) {
            addCriterion("emergency between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andEmergencyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("emergency not between", value1, value2, "emergency");
            return (Criteria) this;
        }

        public Criteria andStickIsNull() {
            addCriterion("stick is null");
            return (Criteria) this;
        }

        public Criteria andStickIsNotNull() {
            addCriterion("stick is not null");
            return (Criteria) this;
        }

        public Criteria andStickEqualTo(Boolean value) {
            addCriterion("stick =", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotEqualTo(Boolean value) {
            addCriterion("stick <>", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThan(Boolean value) {
            addCriterion("stick >", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stick >=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThan(Boolean value) {
            addCriterion("stick <", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickLessThanOrEqualTo(Boolean value) {
            addCriterion("stick <=", value, "stick");
            return (Criteria) this;
        }

        public Criteria andStickIn(List<Boolean> values) {
            addCriterion("stick in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotIn(List<Boolean> values) {
            addCriterion("stick not in", values, "stick");
            return (Criteria) this;
        }

        public Criteria andStickBetween(Boolean value1, Boolean value2) {
            addCriterion("stick between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andStickNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stick not between", value1, value2, "stick");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureCnIsNull() {
            addCriterion("nature_cn is null");
            return (Criteria) this;
        }

        public Criteria andNatureCnIsNotNull() {
            addCriterion("nature_cn is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCnEqualTo(String value) {
            addCriterion("nature_cn =", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotEqualTo(String value) {
            addCriterion("nature_cn <>", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnGreaterThan(String value) {
            addCriterion("nature_cn >", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnGreaterThanOrEqualTo(String value) {
            addCriterion("nature_cn >=", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLessThan(String value) {
            addCriterion("nature_cn <", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLessThanOrEqualTo(String value) {
            addCriterion("nature_cn <=", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnLike(String value) {
            addCriterion("nature_cn like", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotLike(String value) {
            addCriterion("nature_cn not like", value, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnIn(List<String> values) {
            addCriterion("nature_cn in", values, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotIn(List<String> values) {
            addCriterion("nature_cn not in", values, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnBetween(String value1, String value2) {
            addCriterion("nature_cn between", value1, value2, "natureCn");
            return (Criteria) this;
        }

        public Criteria andNatureCnNotBetween(String value1, String value2) {
            addCriterion("nature_cn not between", value1, value2, "natureCn");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexCnIsNull() {
            addCriterion("sex_cn is null");
            return (Criteria) this;
        }

        public Criteria andSexCnIsNotNull() {
            addCriterion("sex_cn is not null");
            return (Criteria) this;
        }

        public Criteria andSexCnEqualTo(String value) {
            addCriterion("sex_cn =", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotEqualTo(String value) {
            addCriterion("sex_cn <>", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnGreaterThan(String value) {
            addCriterion("sex_cn >", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnGreaterThanOrEqualTo(String value) {
            addCriterion("sex_cn >=", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLessThan(String value) {
            addCriterion("sex_cn <", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLessThanOrEqualTo(String value) {
            addCriterion("sex_cn <=", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnLike(String value) {
            addCriterion("sex_cn like", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotLike(String value) {
            addCriterion("sex_cn not like", value, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnIn(List<String> values) {
            addCriterion("sex_cn in", values, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotIn(List<String> values) {
            addCriterion("sex_cn not in", values, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnBetween(String value1, String value2) {
            addCriterion("sex_cn between", value1, value2, "sexCn");
            return (Criteria) this;
        }

        public Criteria andSexCnNotBetween(String value1, String value2) {
            addCriterion("sex_cn not between", value1, value2, "sexCn");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Short value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Short value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Short value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Short value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Short value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Short> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Short> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Short value1, Short value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Short value1, Short value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTopclassIsNull() {
            addCriterion("topclass is null");
            return (Criteria) this;
        }

        public Criteria andTopclassIsNotNull() {
            addCriterion("topclass is not null");
            return (Criteria) this;
        }

        public Criteria andTopclassEqualTo(Short value) {
            addCriterion("topclass =", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassNotEqualTo(Short value) {
            addCriterion("topclass <>", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassGreaterThan(Short value) {
            addCriterion("topclass >", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassGreaterThanOrEqualTo(Short value) {
            addCriterion("topclass >=", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassLessThan(Short value) {
            addCriterion("topclass <", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassLessThanOrEqualTo(Short value) {
            addCriterion("topclass <=", value, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassIn(List<Short> values) {
            addCriterion("topclass in", values, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassNotIn(List<Short> values) {
            addCriterion("topclass not in", values, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassBetween(Short value1, Short value2) {
            addCriterion("topclass between", value1, value2, "topclass");
            return (Criteria) this;
        }

        public Criteria andTopclassNotBetween(Short value1, Short value2) {
            addCriterion("topclass not between", value1, value2, "topclass");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Short value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Short value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Short value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Short value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Short value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Short value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Short> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Short> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Short value1, Short value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Short value1, Short value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andSubclassIsNull() {
            addCriterion("subclass is null");
            return (Criteria) this;
        }

        public Criteria andSubclassIsNotNull() {
            addCriterion("subclass is not null");
            return (Criteria) this;
        }

        public Criteria andSubclassEqualTo(Short value) {
            addCriterion("subclass =", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotEqualTo(Short value) {
            addCriterion("subclass <>", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassGreaterThan(Short value) {
            addCriterion("subclass >", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassGreaterThanOrEqualTo(Short value) {
            addCriterion("subclass >=", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassLessThan(Short value) {
            addCriterion("subclass <", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassLessThanOrEqualTo(Short value) {
            addCriterion("subclass <=", value, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassIn(List<Short> values) {
            addCriterion("subclass in", values, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotIn(List<Short> values) {
            addCriterion("subclass not in", values, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassBetween(Short value1, Short value2) {
            addCriterion("subclass between", value1, value2, "subclass");
            return (Criteria) this;
        }

        public Criteria andSubclassNotBetween(Short value1, Short value2) {
            addCriterion("subclass not between", value1, value2, "subclass");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIsNull() {
            addCriterion("category_cn is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIsNotNull() {
            addCriterion("category_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCnEqualTo(String value) {
            addCriterion("category_cn =", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotEqualTo(String value) {
            addCriterion("category_cn <>", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnGreaterThan(String value) {
            addCriterion("category_cn >", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnGreaterThanOrEqualTo(String value) {
            addCriterion("category_cn >=", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLessThan(String value) {
            addCriterion("category_cn <", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLessThanOrEqualTo(String value) {
            addCriterion("category_cn <=", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnLike(String value) {
            addCriterion("category_cn like", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotLike(String value) {
            addCriterion("category_cn not like", value, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnIn(List<String> values) {
            addCriterion("category_cn in", values, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotIn(List<String> values) {
            addCriterion("category_cn not in", values, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnBetween(String value1, String value2) {
            addCriterion("category_cn between", value1, value2, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andCategoryCnNotBetween(String value1, String value2) {
            addCriterion("category_cn not between", value1, value2, "categoryCn");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(Short value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(Short value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(Short value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(Short value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(Short value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(Short value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<Short> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<Short> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(Short value1, Short value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(Short value1, Short value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeCnIsNull() {
            addCriterion("trade_cn is null");
            return (Criteria) this;
        }

        public Criteria andTradeCnIsNotNull() {
            addCriterion("trade_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCnEqualTo(String value) {
            addCriterion("trade_cn =", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotEqualTo(String value) {
            addCriterion("trade_cn <>", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnGreaterThan(String value) {
            addCriterion("trade_cn >", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnGreaterThanOrEqualTo(String value) {
            addCriterion("trade_cn >=", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLessThan(String value) {
            addCriterion("trade_cn <", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLessThanOrEqualTo(String value) {
            addCriterion("trade_cn <=", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnLike(String value) {
            addCriterion("trade_cn like", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotLike(String value) {
            addCriterion("trade_cn not like", value, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnIn(List<String> values) {
            addCriterion("trade_cn in", values, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotIn(List<String> values) {
            addCriterion("trade_cn not in", values, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnBetween(String value1, String value2) {
            addCriterion("trade_cn between", value1, value2, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andTradeCnNotBetween(String value1, String value2) {
            addCriterion("trade_cn not between", value1, value2, "tradeCn");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Short value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Short value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Short value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Short value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Short value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Short value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Short> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Short> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Short value1, Short value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Short value1, Short value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleCnIsNull() {
            addCriterion("scale_cn is null");
            return (Criteria) this;
        }

        public Criteria andScaleCnIsNotNull() {
            addCriterion("scale_cn is not null");
            return (Criteria) this;
        }

        public Criteria andScaleCnEqualTo(String value) {
            addCriterion("scale_cn =", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnNotEqualTo(String value) {
            addCriterion("scale_cn <>", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnGreaterThan(String value) {
            addCriterion("scale_cn >", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnGreaterThanOrEqualTo(String value) {
            addCriterion("scale_cn >=", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnLessThan(String value) {
            addCriterion("scale_cn <", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnLessThanOrEqualTo(String value) {
            addCriterion("scale_cn <=", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnLike(String value) {
            addCriterion("scale_cn like", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnNotLike(String value) {
            addCriterion("scale_cn not like", value, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnIn(List<String> values) {
            addCriterion("scale_cn in", values, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnNotIn(List<String> values) {
            addCriterion("scale_cn not in", values, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnBetween(String value1, String value2) {
            addCriterion("scale_cn between", value1, value2, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andScaleCnNotBetween(String value1, String value2) {
            addCriterion("scale_cn not between", value1, value2, "scaleCn");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIsNull() {
            addCriterion("district_cn is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIsNotNull() {
            addCriterion("district_cn is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCnEqualTo(String value) {
            addCriterion("district_cn =", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotEqualTo(String value) {
            addCriterion("district_cn <>", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnGreaterThan(String value) {
            addCriterion("district_cn >", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnGreaterThanOrEqualTo(String value) {
            addCriterion("district_cn >=", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLessThan(String value) {
            addCriterion("district_cn <", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLessThanOrEqualTo(String value) {
            addCriterion("district_cn <=", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnLike(String value) {
            addCriterion("district_cn like", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotLike(String value) {
            addCriterion("district_cn not like", value, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnIn(List<String> values) {
            addCriterion("district_cn in", values, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotIn(List<String> values) {
            addCriterion("district_cn not in", values, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnBetween(String value1, String value2) {
            addCriterion("district_cn between", value1, value2, "districtCn");
            return (Criteria) this;
        }

        public Criteria andDistrictCnNotBetween(String value1, String value2) {
            addCriterion("district_cn not between", value1, value2, "districtCn");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagCnIsNull() {
            addCriterion("tag_cn is null");
            return (Criteria) this;
        }

        public Criteria andTagCnIsNotNull() {
            addCriterion("tag_cn is not null");
            return (Criteria) this;
        }

        public Criteria andTagCnEqualTo(String value) {
            addCriterion("tag_cn =", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotEqualTo(String value) {
            addCriterion("tag_cn <>", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnGreaterThan(String value) {
            addCriterion("tag_cn >", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnGreaterThanOrEqualTo(String value) {
            addCriterion("tag_cn >=", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLessThan(String value) {
            addCriterion("tag_cn <", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLessThanOrEqualTo(String value) {
            addCriterion("tag_cn <=", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnLike(String value) {
            addCriterion("tag_cn like", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotLike(String value) {
            addCriterion("tag_cn not like", value, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnIn(List<String> values) {
            addCriterion("tag_cn in", values, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotIn(List<String> values) {
            addCriterion("tag_cn not in", values, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnBetween(String value1, String value2) {
            addCriterion("tag_cn between", value1, value2, "tagCn");
            return (Criteria) this;
        }

        public Criteria andTagCnNotBetween(String value1, String value2) {
            addCriterion("tag_cn not between", value1, value2, "tagCn");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Short value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Short value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Short value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Short value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Short value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Short value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Short> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Short> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Short value1, Short value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Short value1, Short value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationCnIsNull() {
            addCriterion("education_cn is null");
            return (Criteria) this;
        }

        public Criteria andEducationCnIsNotNull() {
            addCriterion("education_cn is not null");
            return (Criteria) this;
        }

        public Criteria andEducationCnEqualTo(String value) {
            addCriterion("education_cn =", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotEqualTo(String value) {
            addCriterion("education_cn <>", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnGreaterThan(String value) {
            addCriterion("education_cn >", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnGreaterThanOrEqualTo(String value) {
            addCriterion("education_cn >=", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLessThan(String value) {
            addCriterion("education_cn <", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLessThanOrEqualTo(String value) {
            addCriterion("education_cn <=", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnLike(String value) {
            addCriterion("education_cn like", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotLike(String value) {
            addCriterion("education_cn not like", value, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnIn(List<String> values) {
            addCriterion("education_cn in", values, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotIn(List<String> values) {
            addCriterion("education_cn not in", values, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnBetween(String value1, String value2) {
            addCriterion("education_cn between", value1, value2, "educationCn");
            return (Criteria) this;
        }

        public Criteria andEducationCnNotBetween(String value1, String value2) {
            addCriterion("education_cn not between", value1, value2, "educationCn");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Short value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Short value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Short value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Short value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Short value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Short value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Short> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Short> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Short value1, Short value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Short value1, Short value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIsNull() {
            addCriterion("experience_cn is null");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIsNotNull() {
            addCriterion("experience_cn is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceCnEqualTo(String value) {
            addCriterion("experience_cn =", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotEqualTo(String value) {
            addCriterion("experience_cn <>", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnGreaterThan(String value) {
            addCriterion("experience_cn >", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnGreaterThanOrEqualTo(String value) {
            addCriterion("experience_cn >=", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLessThan(String value) {
            addCriterion("experience_cn <", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLessThanOrEqualTo(String value) {
            addCriterion("experience_cn <=", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnLike(String value) {
            addCriterion("experience_cn like", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotLike(String value) {
            addCriterion("experience_cn not like", value, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnIn(List<String> values) {
            addCriterion("experience_cn in", values, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotIn(List<String> values) {
            addCriterion("experience_cn not in", values, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnBetween(String value1, String value2) {
            addCriterion("experience_cn between", value1, value2, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andExperienceCnNotBetween(String value1, String value2) {
            addCriterion("experience_cn not between", value1, value2, "experienceCn");
            return (Criteria) this;
        }

        public Criteria andMinwageIsNull() {
            addCriterion("minwage is null");
            return (Criteria) this;
        }

        public Criteria andMinwageIsNotNull() {
            addCriterion("minwage is not null");
            return (Criteria) this;
        }

        public Criteria andMinwageEqualTo(Integer value) {
            addCriterion("minwage =", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageNotEqualTo(Integer value) {
            addCriterion("minwage <>", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageGreaterThan(Integer value) {
            addCriterion("minwage >", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageGreaterThanOrEqualTo(Integer value) {
            addCriterion("minwage >=", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageLessThan(Integer value) {
            addCriterion("minwage <", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageLessThanOrEqualTo(Integer value) {
            addCriterion("minwage <=", value, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageIn(List<Integer> values) {
            addCriterion("minwage in", values, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageNotIn(List<Integer> values) {
            addCriterion("minwage not in", values, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageBetween(Integer value1, Integer value2) {
            addCriterion("minwage between", value1, value2, "minwage");
            return (Criteria) this;
        }

        public Criteria andMinwageNotBetween(Integer value1, Integer value2) {
            addCriterion("minwage not between", value1, value2, "minwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageIsNull() {
            addCriterion("maxwage is null");
            return (Criteria) this;
        }

        public Criteria andMaxwageIsNotNull() {
            addCriterion("maxwage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxwageEqualTo(Integer value) {
            addCriterion("maxwage =", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageNotEqualTo(Integer value) {
            addCriterion("maxwage <>", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageGreaterThan(Integer value) {
            addCriterion("maxwage >", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxwage >=", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageLessThan(Integer value) {
            addCriterion("maxwage <", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageLessThanOrEqualTo(Integer value) {
            addCriterion("maxwage <=", value, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageIn(List<Integer> values) {
            addCriterion("maxwage in", values, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageNotIn(List<Integer> values) {
            addCriterion("maxwage not in", values, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageBetween(Integer value1, Integer value2) {
            addCriterion("maxwage between", value1, value2, "maxwage");
            return (Criteria) this;
        }

        public Criteria andMaxwageNotBetween(Integer value1, Integer value2) {
            addCriterion("maxwage not between", value1, value2, "maxwage");
            return (Criteria) this;
        }

        public Criteria andNegotiableIsNull() {
            addCriterion("negotiable is null");
            return (Criteria) this;
        }

        public Criteria andNegotiableIsNotNull() {
            addCriterion("negotiable is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiableEqualTo(Boolean value) {
            addCriterion("negotiable =", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableNotEqualTo(Boolean value) {
            addCriterion("negotiable <>", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableGreaterThan(Boolean value) {
            addCriterion("negotiable >", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("negotiable >=", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableLessThan(Boolean value) {
            addCriterion("negotiable <", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableLessThanOrEqualTo(Boolean value) {
            addCriterion("negotiable <=", value, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableIn(List<Boolean> values) {
            addCriterion("negotiable in", values, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableNotIn(List<Boolean> values) {
            addCriterion("negotiable not in", values, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableBetween(Boolean value1, Boolean value2) {
            addCriterion("negotiable between", value1, value2, "negotiable");
            return (Criteria) this;
        }

        public Criteria andNegotiableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("negotiable not between", value1, value2, "negotiable");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Integer value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Integer value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Integer value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Integer value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Integer> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Integer> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNull() {
            addCriterion("refreshtime is null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNotNull() {
            addCriterion("refreshtime is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeEqualTo(Integer value) {
            addCriterion("refreshtime =", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotEqualTo(Integer value) {
            addCriterion("refreshtime <>", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThan(Integer value) {
            addCriterion("refreshtime >", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refreshtime >=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThan(Integer value) {
            addCriterion("refreshtime <", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThanOrEqualTo(Integer value) {
            addCriterion("refreshtime <=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIn(List<Integer> values) {
            addCriterion("refreshtime in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotIn(List<Integer> values) {
            addCriterion("refreshtime not in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeBetween(Integer value1, Integer value2) {
            addCriterion("refreshtime between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refreshtime not between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Integer value) {
            addCriterion("stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Integer value) {
            addCriterion("stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Integer value) {
            addCriterion("stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Integer value) {
            addCriterion("stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Integer value) {
            addCriterion("stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Integer> values) {
            addCriterion("stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Integer> values) {
            addCriterion("stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Integer value1, Integer value2) {
            addCriterion("stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineIsNull() {
            addCriterion("setmeal_deadline is null");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineIsNotNull() {
            addCriterion("setmeal_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineEqualTo(Integer value) {
            addCriterion("setmeal_deadline =", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineNotEqualTo(Integer value) {
            addCriterion("setmeal_deadline <>", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineGreaterThan(Integer value) {
            addCriterion("setmeal_deadline >", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("setmeal_deadline >=", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineLessThan(Integer value) {
            addCriterion("setmeal_deadline <", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("setmeal_deadline <=", value, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineIn(List<Integer> values) {
            addCriterion("setmeal_deadline in", values, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineNotIn(List<Integer> values) {
            addCriterion("setmeal_deadline not in", values, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_deadline between", value1, value2, "setmealDeadline");
            return (Criteria) this;
        }

        public Criteria andSetmealDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_deadline not between", value1, value2, "setmealDeadline");
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

        public Criteria andSetmealIdEqualTo(Short value) {
            addCriterion("setmeal_id =", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotEqualTo(Short value) {
            addCriterion("setmeal_id <>", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThan(Short value) {
            addCriterion("setmeal_id >", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdGreaterThanOrEqualTo(Short value) {
            addCriterion("setmeal_id >=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThan(Short value) {
            addCriterion("setmeal_id <", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdLessThanOrEqualTo(Short value) {
            addCriterion("setmeal_id <=", value, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdIn(List<Short> values) {
            addCriterion("setmeal_id in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotIn(List<Short> values) {
            addCriterion("setmeal_id not in", values, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdBetween(Short value1, Short value2) {
            addCriterion("setmeal_id between", value1, value2, "setmealId");
            return (Criteria) this;
        }

        public Criteria andSetmealIdNotBetween(Short value1, Short value2) {
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

        public Criteria andAuditIsNull() {
            addCriterion("audit is null");
            return (Criteria) this;
        }

        public Criteria andAuditIsNotNull() {
            addCriterion("audit is not null");
            return (Criteria) this;
        }

        public Criteria andAuditEqualTo(Integer value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Integer value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Integer value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Integer value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Integer value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Integer> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Integer> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Integer value1, Integer value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Integer value1, Integer value2) {
            addCriterion("audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Boolean value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Boolean value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Boolean value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Boolean value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Boolean value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Boolean> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Boolean> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Boolean value1, Boolean value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("display not between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Boolean value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Boolean value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Boolean value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Boolean value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Boolean> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Boolean> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andRobotIsNull() {
            addCriterion("robot is null");
            return (Criteria) this;
        }

        public Criteria andRobotIsNotNull() {
            addCriterion("robot is not null");
            return (Criteria) this;
        }

        public Criteria andRobotEqualTo(Boolean value) {
            addCriterion("robot =", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotEqualTo(Boolean value) {
            addCriterion("robot <>", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThan(Boolean value) {
            addCriterion("robot >", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("robot >=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThan(Boolean value) {
            addCriterion("robot <", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThanOrEqualTo(Boolean value) {
            addCriterion("robot <=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotIn(List<Boolean> values) {
            addCriterion("robot in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotIn(List<Boolean> values) {
            addCriterion("robot not in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotBetween(Boolean value1, Boolean value2) {
            addCriterion("robot between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("robot not between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andTplIsNull() {
            addCriterion("tpl is null");
            return (Criteria) this;
        }

        public Criteria andTplIsNotNull() {
            addCriterion("tpl is not null");
            return (Criteria) this;
        }

        public Criteria andTplEqualTo(String value) {
            addCriterion("tpl =", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotEqualTo(String value) {
            addCriterion("tpl <>", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThan(String value) {
            addCriterion("tpl >", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplGreaterThanOrEqualTo(String value) {
            addCriterion("tpl >=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThan(String value) {
            addCriterion("tpl <", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLessThanOrEqualTo(String value) {
            addCriterion("tpl <=", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplLike(String value) {
            addCriterion("tpl like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotLike(String value) {
            addCriterion("tpl not like", value, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplIn(List<String> values) {
            addCriterion("tpl in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotIn(List<String> values) {
            addCriterion("tpl not in", values, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplBetween(String value1, String value2) {
            addCriterion("tpl between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andTplNotBetween(String value1, String value2) {
            addCriterion("tpl not between", value1, value2, "tpl");
            return (Criteria) this;
        }

        public Criteria andMapXIsNull() {
            addCriterion("map_x is null");
            return (Criteria) this;
        }

        public Criteria andMapXIsNotNull() {
            addCriterion("map_x is not null");
            return (Criteria) this;
        }

        public Criteria andMapXEqualTo(BigDecimal value) {
            addCriterion("map_x =", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotEqualTo(BigDecimal value) {
            addCriterion("map_x <>", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXGreaterThan(BigDecimal value) {
            addCriterion("map_x >", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("map_x >=", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXLessThan(BigDecimal value) {
            addCriterion("map_x <", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("map_x <=", value, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXIn(List<BigDecimal> values) {
            addCriterion("map_x in", values, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotIn(List<BigDecimal> values) {
            addCriterion("map_x not in", values, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("map_x between", value1, value2, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("map_x not between", value1, value2, "mapX");
            return (Criteria) this;
        }

        public Criteria andMapYIsNull() {
            addCriterion("map_y is null");
            return (Criteria) this;
        }

        public Criteria andMapYIsNotNull() {
            addCriterion("map_y is not null");
            return (Criteria) this;
        }

        public Criteria andMapYEqualTo(BigDecimal value) {
            addCriterion("map_y =", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotEqualTo(BigDecimal value) {
            addCriterion("map_y <>", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYGreaterThan(BigDecimal value) {
            addCriterion("map_y >", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("map_y >=", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYLessThan(BigDecimal value) {
            addCriterion("map_y <", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("map_y <=", value, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYIn(List<BigDecimal> values) {
            addCriterion("map_y in", values, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotIn(List<BigDecimal> values) {
            addCriterion("map_y not in", values, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("map_y between", value1, value2, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("map_y not between", value1, value2, "mapY");
            return (Criteria) this;
        }

        public Criteria andMapZoomIsNull() {
            addCriterion("map_zoom is null");
            return (Criteria) this;
        }

        public Criteria andMapZoomIsNotNull() {
            addCriterion("map_zoom is not null");
            return (Criteria) this;
        }

        public Criteria andMapZoomEqualTo(Byte value) {
            addCriterion("map_zoom =", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotEqualTo(Byte value) {
            addCriterion("map_zoom <>", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomGreaterThan(Byte value) {
            addCriterion("map_zoom >", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomGreaterThanOrEqualTo(Byte value) {
            addCriterion("map_zoom >=", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomLessThan(Byte value) {
            addCriterion("map_zoom <", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomLessThanOrEqualTo(Byte value) {
            addCriterion("map_zoom <=", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomIn(List<Byte> values) {
            addCriterion("map_zoom in", values, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotIn(List<Byte> values) {
            addCriterion("map_zoom not in", values, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomBetween(Byte value1, Byte value2) {
            addCriterion("map_zoom between", value1, value2, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotBetween(Byte value1, Byte value2) {
            addCriterion("map_zoom not between", value1, value2, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andAddModeIsNull() {
            addCriterion("add_mode is null");
            return (Criteria) this;
        }

        public Criteria andAddModeIsNotNull() {
            addCriterion("add_mode is not null");
            return (Criteria) this;
        }

        public Criteria andAddModeEqualTo(Boolean value) {
            addCriterion("add_mode =", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeNotEqualTo(Boolean value) {
            addCriterion("add_mode <>", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeGreaterThan(Boolean value) {
            addCriterion("add_mode >", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("add_mode >=", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeLessThan(Boolean value) {
            addCriterion("add_mode <", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeLessThanOrEqualTo(Boolean value) {
            addCriterion("add_mode <=", value, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeIn(List<Boolean> values) {
            addCriterion("add_mode in", values, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeNotIn(List<Boolean> values) {
            addCriterion("add_mode not in", values, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeBetween(Boolean value1, Boolean value2) {
            addCriterion("add_mode between", value1, value2, "addMode");
            return (Criteria) this;
        }

        public Criteria andAddModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("add_mode not between", value1, value2, "addMode");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andFamousIsNull() {
            addCriterion("famous is null");
            return (Criteria) this;
        }

        public Criteria andFamousIsNotNull() {
            addCriterion("famous is not null");
            return (Criteria) this;
        }

        public Criteria andFamousEqualTo(Boolean value) {
            addCriterion("famous =", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotEqualTo(Boolean value) {
            addCriterion("famous <>", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousGreaterThan(Boolean value) {
            addCriterion("famous >", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousGreaterThanOrEqualTo(Boolean value) {
            addCriterion("famous >=", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousLessThan(Boolean value) {
            addCriterion("famous <", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousLessThanOrEqualTo(Boolean value) {
            addCriterion("famous <=", value, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousIn(List<Boolean> values) {
            addCriterion("famous in", values, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotIn(List<Boolean> values) {
            addCriterion("famous not in", values, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousBetween(Boolean value1, Boolean value2) {
            addCriterion("famous between", value1, value2, "famous");
            return (Criteria) this;
        }

        public Criteria andFamousNotBetween(Boolean value1, Boolean value2) {
            addCriterion("famous not between", value1, value2, "famous");
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