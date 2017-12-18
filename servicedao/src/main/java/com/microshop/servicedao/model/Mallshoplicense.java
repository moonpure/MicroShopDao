package com.microshop.servicedao.model;

import java.util.Date;

public class Mallshoplicense {
    private Long id;

    private Long shopid;

    private Integer licensetype;

    private String licenseurl;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Integer getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(Integer licensetype) {
        this.licensetype = licensetype;
    }

    public String getLicenseurl() {
        return licenseurl;
    }

    public void setLicenseurl(String licenseurl) {
        this.licenseurl = licenseurl == null ? null : licenseurl.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}