package com.yyc.yycframework.entity;

import java.util.Date;

public class Sign {
    private String id;

    private String userId;

    private Date signInTime;

    private String signInStatue;

    private Date signOutTime;

    private String signOutStatue;

    private String nowDay;

    private String searchMonth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(Date signInTime) {
        this.signInTime = signInTime;
    }

    public String getSignInStatue() {
        return signInStatue;
    }

    public void setSignInStatue(String signInStatue) {
        this.signInStatue = signInStatue == null ? null : signInStatue.trim();
    }

    public Date getSignOutTime() {
        return signOutTime;
    }

    public void setSignOutTime(Date signOutTime) {
        this.signOutTime = signOutTime;
    }

    public String getSignOutStatue() {
        return signOutStatue;
    }

    public void setSignOutStatue(String signOutStatue) {
        this.signOutStatue = signOutStatue == null ? null : signOutStatue.trim();
    }

    public String getNowDay() {
        return nowDay;
    }

    public void setNowDay(String nowDay) {
        this.nowDay = nowDay == null ? null : nowDay.trim();
    }

    public String getSearchMonth() {
        return searchMonth;
    }

    public void setSearchMonth(String searchMonth) {
        this.searchMonth = searchMonth == null ? null : searchMonth.trim();
    }
}