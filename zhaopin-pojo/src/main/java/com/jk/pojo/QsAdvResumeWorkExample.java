package com.jk.pojo;

import java.util.ArrayList;
import java.util.List;

public class QsAdvResumeWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsAdvResumeWorkExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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

        public Criteria andStartyearIsNull() {
            addCriterion("startyear is null");
            return (Criteria) this;
        }

        public Criteria andStartyearIsNotNull() {
            addCriterion("startyear is not null");
            return (Criteria) this;
        }

        public Criteria andStartyearEqualTo(Short value) {
            addCriterion("startyear =", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotEqualTo(Short value) {
            addCriterion("startyear <>", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThan(Short value) {
            addCriterion("startyear >", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearGreaterThanOrEqualTo(Short value) {
            addCriterion("startyear >=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThan(Short value) {
            addCriterion("startyear <", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearLessThanOrEqualTo(Short value) {
            addCriterion("startyear <=", value, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearIn(List<Short> values) {
            addCriterion("startyear in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotIn(List<Short> values) {
            addCriterion("startyear not in", values, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearBetween(Short value1, Short value2) {
            addCriterion("startyear between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartyearNotBetween(Short value1, Short value2) {
            addCriterion("startyear not between", value1, value2, "startyear");
            return (Criteria) this;
        }

        public Criteria andStartmonthIsNull() {
            addCriterion("startmonth is null");
            return (Criteria) this;
        }

        public Criteria andStartmonthIsNotNull() {
            addCriterion("startmonth is not null");
            return (Criteria) this;
        }

        public Criteria andStartmonthEqualTo(Short value) {
            addCriterion("startmonth =", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotEqualTo(Short value) {
            addCriterion("startmonth <>", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthGreaterThan(Short value) {
            addCriterion("startmonth >", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("startmonth >=", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthLessThan(Short value) {
            addCriterion("startmonth <", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthLessThanOrEqualTo(Short value) {
            addCriterion("startmonth <=", value, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthIn(List<Short> values) {
            addCriterion("startmonth in", values, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotIn(List<Short> values) {
            addCriterion("startmonth not in", values, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthBetween(Short value1, Short value2) {
            addCriterion("startmonth between", value1, value2, "startmonth");
            return (Criteria) this;
        }

        public Criteria andStartmonthNotBetween(Short value1, Short value2) {
            addCriterion("startmonth not between", value1, value2, "startmonth");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNull() {
            addCriterion("endyear is null");
            return (Criteria) this;
        }

        public Criteria andEndyearIsNotNull() {
            addCriterion("endyear is not null");
            return (Criteria) this;
        }

        public Criteria andEndyearEqualTo(Short value) {
            addCriterion("endyear =", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotEqualTo(Short value) {
            addCriterion("endyear <>", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThan(Short value) {
            addCriterion("endyear >", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearGreaterThanOrEqualTo(Short value) {
            addCriterion("endyear >=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThan(Short value) {
            addCriterion("endyear <", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearLessThanOrEqualTo(Short value) {
            addCriterion("endyear <=", value, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearIn(List<Short> values) {
            addCriterion("endyear in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotIn(List<Short> values) {
            addCriterion("endyear not in", values, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearBetween(Short value1, Short value2) {
            addCriterion("endyear between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndyearNotBetween(Short value1, Short value2) {
            addCriterion("endyear not between", value1, value2, "endyear");
            return (Criteria) this;
        }

        public Criteria andEndmonthIsNull() {
            addCriterion("endmonth is null");
            return (Criteria) this;
        }

        public Criteria andEndmonthIsNotNull() {
            addCriterion("endmonth is not null");
            return (Criteria) this;
        }

        public Criteria andEndmonthEqualTo(Short value) {
            addCriterion("endmonth =", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotEqualTo(Short value) {
            addCriterion("endmonth <>", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthGreaterThan(Short value) {
            addCriterion("endmonth >", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("endmonth >=", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthLessThan(Short value) {
            addCriterion("endmonth <", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthLessThanOrEqualTo(Short value) {
            addCriterion("endmonth <=", value, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthIn(List<Short> values) {
            addCriterion("endmonth in", values, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotIn(List<Short> values) {
            addCriterion("endmonth not in", values, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthBetween(Short value1, Short value2) {
            addCriterion("endmonth between", value1, value2, "endmonth");
            return (Criteria) this;
        }

        public Criteria andEndmonthNotBetween(Short value1, Short value2) {
            addCriterion("endmonth not between", value1, value2, "endmonth");
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

        public Criteria andJobsIsNull() {
            addCriterion("jobs is null");
            return (Criteria) this;
        }

        public Criteria andJobsIsNotNull() {
            addCriterion("jobs is not null");
            return (Criteria) this;
        }

        public Criteria andJobsEqualTo(String value) {
            addCriterion("jobs =", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotEqualTo(String value) {
            addCriterion("jobs <>", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsGreaterThan(String value) {
            addCriterion("jobs >", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsGreaterThanOrEqualTo(String value) {
            addCriterion("jobs >=", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsLessThan(String value) {
            addCriterion("jobs <", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsLessThanOrEqualTo(String value) {
            addCriterion("jobs <=", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsLike(String value) {
            addCriterion("jobs like", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotLike(String value) {
            addCriterion("jobs not like", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsIn(List<String> values) {
            addCriterion("jobs in", values, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotIn(List<String> values) {
            addCriterion("jobs not in", values, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsBetween(String value1, String value2) {
            addCriterion("jobs between", value1, value2, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotBetween(String value1, String value2) {
            addCriterion("jobs not between", value1, value2, "jobs");
            return (Criteria) this;
        }

        public Criteria andAchievementsIsNull() {
            addCriterion("achievements is null");
            return (Criteria) this;
        }

        public Criteria andAchievementsIsNotNull() {
            addCriterion("achievements is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementsEqualTo(String value) {
            addCriterion("achievements =", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsNotEqualTo(String value) {
            addCriterion("achievements <>", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsGreaterThan(String value) {
            addCriterion("achievements >", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsGreaterThanOrEqualTo(String value) {
            addCriterion("achievements >=", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsLessThan(String value) {
            addCriterion("achievements <", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsLessThanOrEqualTo(String value) {
            addCriterion("achievements <=", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsLike(String value) {
            addCriterion("achievements like", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsNotLike(String value) {
            addCriterion("achievements not like", value, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsIn(List<String> values) {
            addCriterion("achievements in", values, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsNotIn(List<String> values) {
            addCriterion("achievements not in", values, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsBetween(String value1, String value2) {
            addCriterion("achievements between", value1, value2, "achievements");
            return (Criteria) this;
        }

        public Criteria andAchievementsNotBetween(String value1, String value2) {
            addCriterion("achievements not between", value1, value2, "achievements");
            return (Criteria) this;
        }

        public Criteria andTodateIsNull() {
            addCriterion("todate is null");
            return (Criteria) this;
        }

        public Criteria andTodateIsNotNull() {
            addCriterion("todate is not null");
            return (Criteria) this;
        }

        public Criteria andTodateEqualTo(Integer value) {
            addCriterion("todate =", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotEqualTo(Integer value) {
            addCriterion("todate <>", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThan(Integer value) {
            addCriterion("todate >", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateGreaterThanOrEqualTo(Integer value) {
            addCriterion("todate >=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThan(Integer value) {
            addCriterion("todate <", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateLessThanOrEqualTo(Integer value) {
            addCriterion("todate <=", value, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateIn(List<Integer> values) {
            addCriterion("todate in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotIn(List<Integer> values) {
            addCriterion("todate not in", values, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateBetween(Integer value1, Integer value2) {
            addCriterion("todate between", value1, value2, "todate");
            return (Criteria) this;
        }

        public Criteria andTodateNotBetween(Integer value1, Integer value2) {
            addCriterion("todate not between", value1, value2, "todate");
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