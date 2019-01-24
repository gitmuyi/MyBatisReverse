package com.yyc.yycframework.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIsNull() {
            addCriterion("asset_code is null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIsNotNull() {
            addCriterion("asset_code is not null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeEqualTo(String value) {
            addCriterion("asset_code =", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotEqualTo(String value) {
            addCriterion("asset_code <>", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThan(String value) {
            addCriterion("asset_code >", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_code >=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThan(String value) {
            addCriterion("asset_code <", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThanOrEqualTo(String value) {
            addCriterion("asset_code <=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLike(String value) {
            addCriterion("asset_code like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotLike(String value) {
            addCriterion("asset_code not like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIn(List<String> values) {
            addCriterion("asset_code in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotIn(List<String> values) {
            addCriterion("asset_code not in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeBetween(String value1, String value2) {
            addCriterion("asset_code between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotBetween(String value1, String value2) {
            addCriterion("asset_code not between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("asset_name is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("asset_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("asset_name =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("asset_name <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("asset_name >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("asset_name >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("asset_name <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("asset_name <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("asset_name like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("asset_name not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("asset_name in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("asset_name not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("asset_name between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("asset_name not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNull() {
            addCriterion("asset_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNotNull() {
            addCriterion("asset_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeEqualTo(String value) {
            addCriterion("asset_type =", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotEqualTo(String value) {
            addCriterion("asset_type <>", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThan(String value) {
            addCriterion("asset_type >", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_type >=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThan(String value) {
            addCriterion("asset_type <", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThanOrEqualTo(String value) {
            addCriterion("asset_type <=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLike(String value) {
            addCriterion("asset_type like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotLike(String value) {
            addCriterion("asset_type not like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIn(List<String> values) {
            addCriterion("asset_type in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotIn(List<String> values) {
            addCriterion("asset_type not in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeBetween(String value1, String value2) {
            addCriterion("asset_type between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotBetween(String value1, String value2) {
            addCriterion("asset_type not between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptIsNull() {
            addCriterion("before_dept is null");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptIsNotNull() {
            addCriterion("before_dept is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptEqualTo(String value) {
            addCriterion("before_dept =", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptNotEqualTo(String value) {
            addCriterion("before_dept <>", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptGreaterThan(String value) {
            addCriterion("before_dept >", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptGreaterThanOrEqualTo(String value) {
            addCriterion("before_dept >=", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptLessThan(String value) {
            addCriterion("before_dept <", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptLessThanOrEqualTo(String value) {
            addCriterion("before_dept <=", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptLike(String value) {
            addCriterion("before_dept like", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptNotLike(String value) {
            addCriterion("before_dept not like", value, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptIn(List<String> values) {
            addCriterion("before_dept in", values, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptNotIn(List<String> values) {
            addCriterion("before_dept not in", values, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptBetween(String value1, String value2) {
            addCriterion("before_dept between", value1, value2, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeDeptNotBetween(String value1, String value2) {
            addCriterion("before_dept not between", value1, value2, "beforeDept");
            return (Criteria) this;
        }

        public Criteria andBeforeUserIsNull() {
            addCriterion("before_user is null");
            return (Criteria) this;
        }

        public Criteria andBeforeUserIsNotNull() {
            addCriterion("before_user is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeUserEqualTo(String value) {
            addCriterion("before_user =", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserNotEqualTo(String value) {
            addCriterion("before_user <>", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserGreaterThan(String value) {
            addCriterion("before_user >", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserGreaterThanOrEqualTo(String value) {
            addCriterion("before_user >=", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserLessThan(String value) {
            addCriterion("before_user <", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserLessThanOrEqualTo(String value) {
            addCriterion("before_user <=", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserLike(String value) {
            addCriterion("before_user like", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserNotLike(String value) {
            addCriterion("before_user not like", value, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserIn(List<String> values) {
            addCriterion("before_user in", values, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserNotIn(List<String> values) {
            addCriterion("before_user not in", values, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserBetween(String value1, String value2) {
            addCriterion("before_user between", value1, value2, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBeforeUserNotBetween(String value1, String value2) {
            addCriterion("before_user not between", value1, value2, "beforeUser");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterion("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterion("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterion("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterion("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterion("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterion("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterion("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(Date value) {
            addCriterion("enter_date =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(Date value) {
            addCriterion("enter_date <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(Date value) {
            addCriterion("enter_date >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_date >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(Date value) {
            addCriterion("enter_date <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(Date value) {
            addCriterion("enter_date <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<Date> values) {
            addCriterion("enter_date in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<Date> values) {
            addCriterion("enter_date not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(Date value1, Date value2) {
            addCriterion("enter_date between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(Date value1, Date value2) {
            addCriterion("enter_date not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andNowDeptIsNull() {
            addCriterion("now_dept is null");
            return (Criteria) this;
        }

        public Criteria andNowDeptIsNotNull() {
            addCriterion("now_dept is not null");
            return (Criteria) this;
        }

        public Criteria andNowDeptEqualTo(String value) {
            addCriterion("now_dept =", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptNotEqualTo(String value) {
            addCriterion("now_dept <>", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptGreaterThan(String value) {
            addCriterion("now_dept >", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptGreaterThanOrEqualTo(String value) {
            addCriterion("now_dept >=", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptLessThan(String value) {
            addCriterion("now_dept <", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptLessThanOrEqualTo(String value) {
            addCriterion("now_dept <=", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptLike(String value) {
            addCriterion("now_dept like", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptNotLike(String value) {
            addCriterion("now_dept not like", value, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptIn(List<String> values) {
            addCriterion("now_dept in", values, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptNotIn(List<String> values) {
            addCriterion("now_dept not in", values, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptBetween(String value1, String value2) {
            addCriterion("now_dept between", value1, value2, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowDeptNotBetween(String value1, String value2) {
            addCriterion("now_dept not between", value1, value2, "nowDept");
            return (Criteria) this;
        }

        public Criteria andNowUserIsNull() {
            addCriterion("now_user is null");
            return (Criteria) this;
        }

        public Criteria andNowUserIsNotNull() {
            addCriterion("now_user is not null");
            return (Criteria) this;
        }

        public Criteria andNowUserEqualTo(String value) {
            addCriterion("now_user =", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserNotEqualTo(String value) {
            addCriterion("now_user <>", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserGreaterThan(String value) {
            addCriterion("now_user >", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserGreaterThanOrEqualTo(String value) {
            addCriterion("now_user >=", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserLessThan(String value) {
            addCriterion("now_user <", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserLessThanOrEqualTo(String value) {
            addCriterion("now_user <=", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserLike(String value) {
            addCriterion("now_user like", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserNotLike(String value) {
            addCriterion("now_user not like", value, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserIn(List<String> values) {
            addCriterion("now_user in", values, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserNotIn(List<String> values) {
            addCriterion("now_user not in", values, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserBetween(String value1, String value2) {
            addCriterion("now_user between", value1, value2, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNowUserNotBetween(String value1, String value2) {
            addCriterion("now_user not between", value1, value2, "nowUser");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerTelIsNull() {
            addCriterion("partner_tel is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTelIsNotNull() {
            addCriterion("partner_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTelEqualTo(String value) {
            addCriterion("partner_tel =", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelNotEqualTo(String value) {
            addCriterion("partner_tel <>", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelGreaterThan(String value) {
            addCriterion("partner_tel >", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelGreaterThanOrEqualTo(String value) {
            addCriterion("partner_tel >=", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelLessThan(String value) {
            addCriterion("partner_tel <", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelLessThanOrEqualTo(String value) {
            addCriterion("partner_tel <=", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelLike(String value) {
            addCriterion("partner_tel like", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelNotLike(String value) {
            addCriterion("partner_tel not like", value, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelIn(List<String> values) {
            addCriterion("partner_tel in", values, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelNotIn(List<String> values) {
            addCriterion("partner_tel not in", values, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelBetween(String value1, String value2) {
            addCriterion("partner_tel between", value1, value2, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andPartnerTelNotBetween(String value1, String value2) {
            addCriterion("partner_tel not between", value1, value2, "partnerTel");
            return (Criteria) this;
        }

        public Criteria andMoveDateIsNull() {
            addCriterion("move_date is null");
            return (Criteria) this;
        }

        public Criteria andMoveDateIsNotNull() {
            addCriterion("move_date is not null");
            return (Criteria) this;
        }

        public Criteria andMoveDateEqualTo(Date value) {
            addCriterion("move_date =", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateNotEqualTo(Date value) {
            addCriterion("move_date <>", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateGreaterThan(Date value) {
            addCriterion("move_date >", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("move_date >=", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateLessThan(Date value) {
            addCriterion("move_date <", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateLessThanOrEqualTo(Date value) {
            addCriterion("move_date <=", value, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateIn(List<Date> values) {
            addCriterion("move_date in", values, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateNotIn(List<Date> values) {
            addCriterion("move_date not in", values, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateBetween(Date value1, Date value2) {
            addCriterion("move_date between", value1, value2, "moveDate");
            return (Criteria) this;
        }

        public Criteria andMoveDateNotBetween(Date value1, Date value2) {
            addCriterion("move_date not between", value1, value2, "moveDate");
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