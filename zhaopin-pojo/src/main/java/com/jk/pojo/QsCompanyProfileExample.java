package com.jk.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QsCompanyProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QsCompanyProfileExample() {
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

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Short value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Short value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Short value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Short value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Short value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Short value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Short> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Short> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Short value1, Short value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Short value1, Short value2) {
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

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(Short value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(Short value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(Short value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(Short value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(Short value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(Short value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<Short> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<Short> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(Short value1, Short value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(Short value1, Short value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetCnIsNull() {
            addCriterion("street_cn is null");
            return (Criteria) this;
        }

        public Criteria andStreetCnIsNotNull() {
            addCriterion("street_cn is not null");
            return (Criteria) this;
        }

        public Criteria andStreetCnEqualTo(String value) {
            addCriterion("street_cn =", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnNotEqualTo(String value) {
            addCriterion("street_cn <>", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnGreaterThan(String value) {
            addCriterion("street_cn >", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnGreaterThanOrEqualTo(String value) {
            addCriterion("street_cn >=", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnLessThan(String value) {
            addCriterion("street_cn <", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnLessThanOrEqualTo(String value) {
            addCriterion("street_cn <=", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnLike(String value) {
            addCriterion("street_cn like", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnNotLike(String value) {
            addCriterion("street_cn not like", value, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnIn(List<String> values) {
            addCriterion("street_cn in", values, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnNotIn(List<String> values) {
            addCriterion("street_cn not in", values, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnBetween(String value1, String value2) {
            addCriterion("street_cn between", value1, value2, "streetCn");
            return (Criteria) this;
        }

        public Criteria andStreetCnNotBetween(String value1, String value2) {
            addCriterion("street_cn not between", value1, value2, "streetCn");
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

        public Criteria andRegisteredIsNull() {
            addCriterion("registered is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("registered is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(String value) {
            addCriterion("registered =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(String value) {
            addCriterion("registered <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(String value) {
            addCriterion("registered >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("registered >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(String value) {
            addCriterion("registered <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(String value) {
            addCriterion("registered <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLike(String value) {
            addCriterion("registered like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotLike(String value) {
            addCriterion("registered not like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<String> values) {
            addCriterion("registered in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<String> values) {
            addCriterion("registered not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(String value1, String value2) {
            addCriterion("registered between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(String value1, String value2) {
            addCriterion("registered not between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andLandlineTelIsNull() {
            addCriterion("landline_tel is null");
            return (Criteria) this;
        }

        public Criteria andLandlineTelIsNotNull() {
            addCriterion("landline_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLandlineTelEqualTo(String value) {
            addCriterion("landline_tel =", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelNotEqualTo(String value) {
            addCriterion("landline_tel <>", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelGreaterThan(String value) {
            addCriterion("landline_tel >", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelGreaterThanOrEqualTo(String value) {
            addCriterion("landline_tel >=", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelLessThan(String value) {
            addCriterion("landline_tel <", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelLessThanOrEqualTo(String value) {
            addCriterion("landline_tel <=", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelLike(String value) {
            addCriterion("landline_tel like", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelNotLike(String value) {
            addCriterion("landline_tel not like", value, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelIn(List<String> values) {
            addCriterion("landline_tel in", values, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelNotIn(List<String> values) {
            addCriterion("landline_tel not in", values, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelBetween(String value1, String value2) {
            addCriterion("landline_tel between", value1, value2, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andLandlineTelNotBetween(String value1, String value2) {
            addCriterion("landline_tel not between", value1, value2, "landlineTel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andCertificateImgIsNull() {
            addCriterion("certificate_img is null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgIsNotNull() {
            addCriterion("certificate_img is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateImgEqualTo(String value) {
            addCriterion("certificate_img =", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgNotEqualTo(String value) {
            addCriterion("certificate_img <>", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgGreaterThan(String value) {
            addCriterion("certificate_img >", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_img >=", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgLessThan(String value) {
            addCriterion("certificate_img <", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgLessThanOrEqualTo(String value) {
            addCriterion("certificate_img <=", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgLike(String value) {
            addCriterion("certificate_img like", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgNotLike(String value) {
            addCriterion("certificate_img not like", value, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgIn(List<String> values) {
            addCriterion("certificate_img in", values, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgNotIn(List<String> values) {
            addCriterion("certificate_img not in", values, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgBetween(String value1, String value2) {
            addCriterion("certificate_img between", value1, value2, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andCertificateImgNotBetween(String value1, String value2) {
            addCriterion("certificate_img not between", value1, value2, "certificateImg");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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

        public Criteria andAuditEqualTo(Byte value) {
            addCriterion("audit =", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotEqualTo(Byte value) {
            addCriterion("audit <>", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThan(Byte value) {
            addCriterion("audit >", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit >=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThan(Byte value) {
            addCriterion("audit <", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditLessThanOrEqualTo(Byte value) {
            addCriterion("audit <=", value, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditIn(List<Byte> values) {
            addCriterion("audit in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotIn(List<Byte> values) {
            addCriterion("audit not in", values, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditBetween(Byte value1, Byte value2) {
            addCriterion("audit between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andAuditNotBetween(Byte value1, Byte value2) {
            addCriterion("audit not between", value1, value2, "audit");
            return (Criteria) this;
        }

        public Criteria andMapOpenIsNull() {
            addCriterion("map_open is null");
            return (Criteria) this;
        }

        public Criteria andMapOpenIsNotNull() {
            addCriterion("map_open is not null");
            return (Criteria) this;
        }

        public Criteria andMapOpenEqualTo(Byte value) {
            addCriterion("map_open =", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenNotEqualTo(Byte value) {
            addCriterion("map_open <>", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenGreaterThan(Byte value) {
            addCriterion("map_open >", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenGreaterThanOrEqualTo(Byte value) {
            addCriterion("map_open >=", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenLessThan(Byte value) {
            addCriterion("map_open <", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenLessThanOrEqualTo(Byte value) {
            addCriterion("map_open <=", value, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenIn(List<Byte> values) {
            addCriterion("map_open in", values, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenNotIn(List<Byte> values) {
            addCriterion("map_open not in", values, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenBetween(Byte value1, Byte value2) {
            addCriterion("map_open between", value1, value2, "mapOpen");
            return (Criteria) this;
        }

        public Criteria andMapOpenNotBetween(Byte value1, Byte value2) {
            addCriterion("map_open not between", value1, value2, "mapOpen");
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

        public Criteria andUserStatusEqualTo(Byte value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Byte value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Byte value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Byte value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Byte value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Byte> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Byte> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Byte value1, Byte value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andContactShowIsNull() {
            addCriterion("contact_show is null");
            return (Criteria) this;
        }

        public Criteria andContactShowIsNotNull() {
            addCriterion("contact_show is not null");
            return (Criteria) this;
        }

        public Criteria andContactShowEqualTo(Boolean value) {
            addCriterion("contact_show =", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowNotEqualTo(Boolean value) {
            addCriterion("contact_show <>", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowGreaterThan(Boolean value) {
            addCriterion("contact_show >", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("contact_show >=", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowLessThan(Boolean value) {
            addCriterion("contact_show <", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowLessThanOrEqualTo(Boolean value) {
            addCriterion("contact_show <=", value, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowIn(List<Boolean> values) {
            addCriterion("contact_show in", values, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowNotIn(List<Boolean> values) {
            addCriterion("contact_show not in", values, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowBetween(Boolean value1, Boolean value2) {
            addCriterion("contact_show between", value1, value2, "contactShow");
            return (Criteria) this;
        }

        public Criteria andContactShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("contact_show not between", value1, value2, "contactShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowIsNull() {
            addCriterion("telephone_show is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowIsNotNull() {
            addCriterion("telephone_show is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowEqualTo(Boolean value) {
            addCriterion("telephone_show =", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowNotEqualTo(Boolean value) {
            addCriterion("telephone_show <>", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowGreaterThan(Boolean value) {
            addCriterion("telephone_show >", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("telephone_show >=", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowLessThan(Boolean value) {
            addCriterion("telephone_show <", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowLessThanOrEqualTo(Boolean value) {
            addCriterion("telephone_show <=", value, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowIn(List<Boolean> values) {
            addCriterion("telephone_show in", values, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowNotIn(List<Boolean> values) {
            addCriterion("telephone_show not in", values, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowBetween(Boolean value1, Boolean value2) {
            addCriterion("telephone_show between", value1, value2, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andTelephoneShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("telephone_show not between", value1, value2, "telephoneShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowIsNull() {
            addCriterion("email_show is null");
            return (Criteria) this;
        }

        public Criteria andEmailShowIsNotNull() {
            addCriterion("email_show is not null");
            return (Criteria) this;
        }

        public Criteria andEmailShowEqualTo(Boolean value) {
            addCriterion("email_show =", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowNotEqualTo(Boolean value) {
            addCriterion("email_show <>", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowGreaterThan(Boolean value) {
            addCriterion("email_show >", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_show >=", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowLessThan(Boolean value) {
            addCriterion("email_show <", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowLessThanOrEqualTo(Boolean value) {
            addCriterion("email_show <=", value, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowIn(List<Boolean> values) {
            addCriterion("email_show in", values, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowNotIn(List<Boolean> values) {
            addCriterion("email_show not in", values, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowBetween(Boolean value1, Boolean value2) {
            addCriterion("email_show between", value1, value2, "emailShow");
            return (Criteria) this;
        }

        public Criteria andEmailShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_show not between", value1, value2, "emailShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowIsNull() {
            addCriterion("landline_tel_show is null");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowIsNotNull() {
            addCriterion("landline_tel_show is not null");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowEqualTo(Boolean value) {
            addCriterion("landline_tel_show =", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowNotEqualTo(Boolean value) {
            addCriterion("landline_tel_show <>", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowGreaterThan(Boolean value) {
            addCriterion("landline_tel_show >", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("landline_tel_show >=", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowLessThan(Boolean value) {
            addCriterion("landline_tel_show <", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowLessThanOrEqualTo(Boolean value) {
            addCriterion("landline_tel_show <=", value, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowIn(List<Boolean> values) {
            addCriterion("landline_tel_show in", values, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowNotIn(List<Boolean> values) {
            addCriterion("landline_tel_show not in", values, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowBetween(Boolean value1, Boolean value2) {
            addCriterion("landline_tel_show between", value1, value2, "landlineTelShow");
            return (Criteria) this;
        }

        public Criteria andLandlineTelShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("landline_tel_show not between", value1, value2, "landlineTelShow");
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

        public Criteria andRobotEqualTo(Byte value) {
            addCriterion("robot =", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotEqualTo(Byte value) {
            addCriterion("robot <>", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThan(Byte value) {
            addCriterion("robot >", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotGreaterThanOrEqualTo(Byte value) {
            addCriterion("robot >=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThan(Byte value) {
            addCriterion("robot <", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotLessThanOrEqualTo(Byte value) {
            addCriterion("robot <=", value, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotIn(List<Byte> values) {
            addCriterion("robot in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotIn(List<Byte> values) {
            addCriterion("robot not in", values, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotBetween(Byte value1, Byte value2) {
            addCriterion("robot between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andRobotNotBetween(Byte value1, Byte value2) {
            addCriterion("robot not between", value1, value2, "robot");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(Integer value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(Integer value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(Integer value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(Integer value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(Integer value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<Integer> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<Integer> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(Integer value1, Integer value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingIsNull() {
            addCriterion("resume_processing is null");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingIsNotNull() {
            addCriterion("resume_processing is not null");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingEqualTo(Byte value) {
            addCriterion("resume_processing =", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingNotEqualTo(Byte value) {
            addCriterion("resume_processing <>", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingGreaterThan(Byte value) {
            addCriterion("resume_processing >", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingGreaterThanOrEqualTo(Byte value) {
            addCriterion("resume_processing >=", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingLessThan(Byte value) {
            addCriterion("resume_processing <", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingLessThanOrEqualTo(Byte value) {
            addCriterion("resume_processing <=", value, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingIn(List<Byte> values) {
            addCriterion("resume_processing in", values, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingNotIn(List<Byte> values) {
            addCriterion("resume_processing not in", values, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingBetween(Byte value1, Byte value2) {
            addCriterion("resume_processing between", value1, value2, "resumeProcessing");
            return (Criteria) this;
        }

        public Criteria andResumeProcessingNotBetween(Byte value1, Byte value2) {
            addCriterion("resume_processing not between", value1, value2, "resumeProcessing");
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

        public Criteria andWzpTplIsNull() {
            addCriterion("wzp_tpl is null");
            return (Criteria) this;
        }

        public Criteria andWzpTplIsNotNull() {
            addCriterion("wzp_tpl is not null");
            return (Criteria) this;
        }

        public Criteria andWzpTplEqualTo(Boolean value) {
            addCriterion("wzp_tpl =", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplNotEqualTo(Boolean value) {
            addCriterion("wzp_tpl <>", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplGreaterThan(Boolean value) {
            addCriterion("wzp_tpl >", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wzp_tpl >=", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplLessThan(Boolean value) {
            addCriterion("wzp_tpl <", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplLessThanOrEqualTo(Boolean value) {
            addCriterion("wzp_tpl <=", value, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplIn(List<Boolean> values) {
            addCriterion("wzp_tpl in", values, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplNotIn(List<Boolean> values) {
            addCriterion("wzp_tpl not in", values, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplBetween(Boolean value1, Boolean value2) {
            addCriterion("wzp_tpl between", value1, value2, "wzpTpl");
            return (Criteria) this;
        }

        public Criteria andWzpTplNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wzp_tpl not between", value1, value2, "wzpTpl");
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

        public Criteria andJobsEqualTo(Integer value) {
            addCriterion("jobs =", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotEqualTo(Integer value) {
            addCriterion("jobs <>", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsGreaterThan(Integer value) {
            addCriterion("jobs >", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobs >=", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsLessThan(Integer value) {
            addCriterion("jobs <", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsLessThanOrEqualTo(Integer value) {
            addCriterion("jobs <=", value, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsIn(List<Integer> values) {
            addCriterion("jobs in", values, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotIn(List<Integer> values) {
            addCriterion("jobs not in", values, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsBetween(Integer value1, Integer value2) {
            addCriterion("jobs between", value1, value2, "jobs");
            return (Criteria) this;
        }

        public Criteria andJobsNotBetween(Integer value1, Integer value2) {
            addCriterion("jobs not between", value1, value2, "jobs");
            return (Criteria) this;
        }

        public Criteria andReplysIsNull() {
            addCriterion("replys is null");
            return (Criteria) this;
        }

        public Criteria andReplysIsNotNull() {
            addCriterion("replys is not null");
            return (Criteria) this;
        }

        public Criteria andReplysEqualTo(Integer value) {
            addCriterion("replys =", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysNotEqualTo(Integer value) {
            addCriterion("replys <>", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysGreaterThan(Integer value) {
            addCriterion("replys >", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysGreaterThanOrEqualTo(Integer value) {
            addCriterion("replys >=", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysLessThan(Integer value) {
            addCriterion("replys <", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysLessThanOrEqualTo(Integer value) {
            addCriterion("replys <=", value, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysIn(List<Integer> values) {
            addCriterion("replys in", values, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysNotIn(List<Integer> values) {
            addCriterion("replys not in", values, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysBetween(Integer value1, Integer value2) {
            addCriterion("replys between", value1, value2, "replys");
            return (Criteria) this;
        }

        public Criteria andReplysNotBetween(Integer value1, Integer value2) {
            addCriterion("replys not between", value1, value2, "replys");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortDescIsNull() {
            addCriterion("short_desc is null");
            return (Criteria) this;
        }

        public Criteria andShortDescIsNotNull() {
            addCriterion("short_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShortDescEqualTo(String value) {
            addCriterion("short_desc =", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotEqualTo(String value) {
            addCriterion("short_desc <>", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescGreaterThan(String value) {
            addCriterion("short_desc >", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescGreaterThanOrEqualTo(String value) {
            addCriterion("short_desc >=", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLessThan(String value) {
            addCriterion("short_desc <", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLessThanOrEqualTo(String value) {
            addCriterion("short_desc <=", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLike(String value) {
            addCriterion("short_desc like", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotLike(String value) {
            addCriterion("short_desc not like", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescIn(List<String> values) {
            addCriterion("short_desc in", values, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotIn(List<String> values) {
            addCriterion("short_desc not in", values, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescBetween(String value1, String value2) {
            addCriterion("short_desc between", value1, value2, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotBetween(String value1, String value2) {
            addCriterion("short_desc not between", value1, value2, "shortDesc");
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