package com.microshop.servicedao.model;

import java.util.Date;

public class Mallgoods {
    private Long id;

    private String name;

    private String brandname;

    private Integer firstcategory;

    private Integer secondcategory;

    private Integer thirdcategory;

    private String title;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private String keywords;

    private String logourl;

    private String describe;

    private Integer state;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public Integer getFirstcategory() {
        return firstcategory;
    }

    public void setFirstcategory(Integer firstcategory) {
        this.firstcategory = firstcategory;
    }

    public Integer getSecondcategory() {
        return secondcategory;
    }

    public void setSecondcategory(Integer secondcategory) {
        this.secondcategory = secondcategory;
    }

    public Integer getThirdcategory() {
        return thirdcategory;
    }

    public void setThirdcategory(Integer thirdcategory) {
        this.thirdcategory = thirdcategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStandardprice() {
        return standardprice;
    }

    public void setStandardprice(Integer standardprice) {
        this.standardprice = standardprice;
    }

    public Integer getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(Integer saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getCostprice() {
        return costprice;
    }

    public void setCostprice(Integer costprice) {
        this.costprice = costprice;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}