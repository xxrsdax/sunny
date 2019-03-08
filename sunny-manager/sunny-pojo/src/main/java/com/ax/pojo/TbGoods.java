package com.ax.pojo;

import java.util.Date;

public class TbGoods {
    private Long id;

    private String name;

    private Long sellerId;

    private Long contentId;

    private Byte typeId;  //类型id

    private Integer number;

    private Integer price;

    private Byte oldDegree; //新旧程度

    private Byte means;  //销售方式

    private Integer status; //商品状态

    private Date createTime;

    private Date updateTime;


    public TbGoods() {
    }

    public TbGoods(Long id, String name, Long sellerId, Long contentId, Byte typeId, Integer number, Integer price, Byte oldDegree, Byte means, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.sellerId = sellerId;
        this.contentId = contentId;
        this.typeId = typeId;
        this.number = number;
        this.price = price;
        this.oldDegree = oldDegree;
        this.means = means;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

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

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Byte getOldDegree() {
        return oldDegree;
    }

    public void setOldDegree(Byte oldDegree) {
        this.oldDegree = oldDegree;
    }

    public Byte getMeans() {
        return means;
    }

    public void setMeans(Byte means) {
        this.means = means;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}