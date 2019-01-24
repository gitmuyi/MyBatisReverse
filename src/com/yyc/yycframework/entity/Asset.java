package com.yyc.yycframework.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Asset {
    private String id;

    private String assetCode;

    private String assetName;

    private String assetType;

    private String beforeDept;

    private String beforeUser;

    private Date buyDate;

    private String content;

    private Date enterDate;

    private String nowDept;

    private String nowUser;

    private Integer num;

    private BigDecimal price;

    private String specification;

    private String unit;

    private String partner;

    private String partnerTel;

    private Date moveDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode == null ? null : assetCode.trim();
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType == null ? null : assetType.trim();
    }

    public String getBeforeDept() {
        return beforeDept;
    }

    public void setBeforeDept(String beforeDept) {
        this.beforeDept = beforeDept == null ? null : beforeDept.trim();
    }

    public String getBeforeUser() {
        return beforeUser;
    }

    public void setBeforeUser(String beforeUser) {
        this.beforeUser = beforeUser == null ? null : beforeUser.trim();
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public String getNowDept() {
        return nowDept;
    }

    public void setNowDept(String nowDept) {
        this.nowDept = nowDept == null ? null : nowDept.trim();
    }

    public String getNowUser() {
        return nowUser;
    }

    public void setNowUser(String nowUser) {
        this.nowUser = nowUser == null ? null : nowUser.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getPartnerTel() {
        return partnerTel;
    }

    public void setPartnerTel(String partnerTel) {
        this.partnerTel = partnerTel == null ? null : partnerTel.trim();
    }

    public Date getMoveDate() {
        return moveDate;
    }

    public void setMoveDate(Date moveDate) {
        this.moveDate = moveDate;
    }
}