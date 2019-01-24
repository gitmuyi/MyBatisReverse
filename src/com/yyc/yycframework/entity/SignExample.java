package com.yyc.yycframework.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SignExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIsNull() {
            addCriterion("sign_in_time is null");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIsNotNull() {
            addCriterion("sign_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignInTimeEqualTo(Date value) {
            addCriterion("sign_in_time =", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotEqualTo(Date value) {
            addCriterion("sign_in_time <>", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeGreaterThan(Date value) {
            addCriterion("sign_in_time >", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_in_time >=", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeLessThan(Date value) {
            addCriterion("sign_in_time <", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_in_time <=", value, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeIn(List<Date> values) {
            addCriterion("sign_in_time in", values, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotIn(List<Date> values) {
            addCriterion("sign_in_time not in", values, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeBetween(Date value1, Date value2) {
            addCriterion("sign_in_time between", value1, value2, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_in_time not between", value1, value2, "signInTime");
            return (Criteria) this;
        }

        public Criteria andSignInStatueIsNull() {
            addCriterion("sign_in_statue is null");
            return (Criteria) this;
        }

        public Criteria andSignInStatueIsNotNull() {
            addCriterion("sign_in_statue is not null");
            return (Criteria) this;
        }

        public Criteria andSignInStatueEqualTo(String value) {
            addCriterion("sign_in_statue =", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueNotEqualTo(String value) {
            addCriterion("sign_in_statue <>", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueGreaterThan(String value) {
            addCriterion("sign_in_statue >", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueGreaterThanOrEqualTo(String value) {
            addCriterion("sign_in_statue >=", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueLessThan(String value) {
            addCriterion("sign_in_statue <", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueLessThanOrEqualTo(String value) {
            addCriterion("sign_in_statue <=", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueLike(String value) {
            addCriterion("sign_in_statue like", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueNotLike(String value) {
            addCriterion("sign_in_statue not like", value, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueIn(List<String> values) {
            addCriterion("sign_in_statue in", values, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueNotIn(List<String> values) {
            addCriterion("sign_in_statue not in", values, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueBetween(String value1, String value2) {
            addCriterion("sign_in_statue between", value1, value2, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignInStatueNotBetween(String value1, String value2) {
            addCriterion("sign_in_statue not between", value1, value2, "signInStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNull() {
            addCriterion("sign_out_time is null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIsNotNull() {
            addCriterion("sign_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeEqualTo(Date value) {
            addCriterion("sign_out_time =", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotEqualTo(Date value) {
            addCriterion("sign_out_time <>", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThan(Date value) {
            addCriterion("sign_out_time >", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_out_time >=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThan(Date value) {
            addCriterion("sign_out_time <", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_out_time <=", value, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeIn(List<Date> values) {
            addCriterion("sign_out_time in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotIn(List<Date> values) {
            addCriterion("sign_out_time not in", values, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeBetween(Date value1, Date value2) {
            addCriterion("sign_out_time between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_out_time not between", value1, value2, "signOutTime");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueIsNull() {
            addCriterion("sign_out_statue is null");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueIsNotNull() {
            addCriterion("sign_out_statue is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueEqualTo(String value) {
            addCriterion("sign_out_statue =", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueNotEqualTo(String value) {
            addCriterion("sign_out_statue <>", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueGreaterThan(String value) {
            addCriterion("sign_out_statue >", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueGreaterThanOrEqualTo(String value) {
            addCriterion("sign_out_statue >=", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueLessThan(String value) {
            addCriterion("sign_out_statue <", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueLessThanOrEqualTo(String value) {
            addCriterion("sign_out_statue <=", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueLike(String value) {
            addCriterion("sign_out_statue like", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueNotLike(String value) {
            addCriterion("sign_out_statue not like", value, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueIn(List<String> values) {
            addCriterion("sign_out_statue in", values, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueNotIn(List<String> values) {
            addCriterion("sign_out_statue not in", values, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueBetween(String value1, String value2) {
            addCriterion("sign_out_statue between", value1, value2, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andSignOutStatueNotBetween(String value1, String value2) {
            addCriterion("sign_out_statue not between", value1, value2, "signOutStatue");
            return (Criteria) this;
        }

        public Criteria andNowDayIsNull() {
            addCriterion("now_day is null");
            return (Criteria) this;
        }

        public Criteria andNowDayIsNotNull() {
            addCriterion("now_day is not null");
            return (Criteria) this;
        }

        public Criteria andNowDayEqualTo(String value) {
            addCriterion("now_day =", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayNotEqualTo(String value) {
            addCriterion("now_day <>", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayGreaterThan(String value) {
            addCriterion("now_day >", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayGreaterThanOrEqualTo(String value) {
            addCriterion("now_day >=", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayLessThan(String value) {
            addCriterion("now_day <", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayLessThanOrEqualTo(String value) {
            addCriterion("now_day <=", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayLike(String value) {
            addCriterion("now_day like", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayNotLike(String value) {
            addCriterion("now_day not like", value, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayIn(List<String> values) {
            addCriterion("now_day in", values, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayNotIn(List<String> values) {
            addCriterion("now_day not in", values, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayBetween(String value1, String value2) {
            addCriterion("now_day between", value1, value2, "nowDay");
            return (Criteria) this;
        }

        public Criteria andNowDayNotBetween(String value1, String value2) {
            addCriterion("now_day not between", value1, value2, "nowDay");
            return (Criteria) this;
        }

        public Criteria andSearchMonthIsNull() {
            addCriterion("search_month is null");
            return (Criteria) this;
        }

        public Criteria andSearchMonthIsNotNull() {
            addCriterion("search_month is not null");
            return (Criteria) this;
        }

        public Criteria andSearchMonthEqualTo(String value) {
            addCriterion("search_month =", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthNotEqualTo(String value) {
            addCriterion("search_month <>", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthGreaterThan(String value) {
            addCriterion("search_month >", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthGreaterThanOrEqualTo(String value) {
            addCriterion("search_month >=", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthLessThan(String value) {
            addCriterion("search_month <", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthLessThanOrEqualTo(String value) {
            addCriterion("search_month <=", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthLike(String value) {
            addCriterion("search_month like", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthNotLike(String value) {
            addCriterion("search_month not like", value, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthIn(List<String> values) {
            addCriterion("search_month in", values, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthNotIn(List<String> values) {
            addCriterion("search_month not in", values, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthBetween(String value1, String value2) {
            addCriterion("search_month between", value1, value2, "searchMonth");
            return (Criteria) this;
        }

        public Criteria andSearchMonthNotBetween(String value1, String value2) {
            addCriterion("search_month not between", value1, value2, "searchMonth");
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