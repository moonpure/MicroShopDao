package com.microshop.servicedao.model;

import java.util.Date;

public class Mallorder extends MallorderKey {
    private Long userid;

    private Long targetid;

    private String targetname;

    private String targetphone;

    private Integer standardprice;

    private Integer saleprice;

    private Integer costprice;

    private Integer trafficprice;

    private Integer payprice;

    private Integer state;

    private Date createtime;

    private Date uptime;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getTargetid() {
        return targetid;
    }

    public void setTargetid(Long targetid) {
        this.targetid = targetid;
    }

    public String getTargetname() {
        return targetname;
    }

    public void setTargetname(String targetname) {
        this.targetname = targetname == null ? null : targetname.trim();
    }

    public String getTargetphone() {
        return targetphone;
    }

    public void setTargetphone(String targetphone) {
        this.targetphone = targetphone == null ? null : targetphone.trim();
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

    public Integer getTrafficprice() {
        return trafficprice;
    }

    public void setTrafficprice(Integer trafficprice) {
        this.trafficprice = trafficprice;
    }

    public Integer getPayprice() {
        return payprice;
    }

    public void setPayprice(Integer payprice) {
        this.payprice = payprice;
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

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
}