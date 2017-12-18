package com.microshop.servicedao.model;

import java.util.Date;

public class Mallorderpaylog {
    private Long id;

    private Long orderid;

    private Long shopid;

    private Long userid;

    private Integer paytype;

    private String flownumber;

    private Date createtime;

    private Integer success;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getFlownumber() {
        return flownumber;
    }

    public void setFlownumber(String flownumber) {
        this.flownumber = flownumber == null ? null : flownumber.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }
}