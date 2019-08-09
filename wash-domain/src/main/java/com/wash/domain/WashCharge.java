package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_charge")
public class WashCharge implements Serializable {
    /**
     * 收费说明表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 详情id
     */
    @Column(name = "details_id")
    private Long detailsId;

    /**
     * 项目名id
     */
    @Column(name = "project_name")
    private String projectName;
    /**
     * 普通洗价格
     */
    @Column(name = "ordinary_price")
    private Double ordinaryPrice;
    /**
     * 精洗价格
     */
    @Column(name = "essence_price")
    private Double essencePrice;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Long createUser;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getOrdinaryPrice() {
        return ordinaryPrice;
    }

    public void setOrdinaryPrice(Double ordinaryPrice) {
        this.ordinaryPrice = ordinaryPrice;
    }

    public Double getEssencePrice() {
        return essencePrice;
    }

    public void setEssencePrice(Double essencePrice) {
        this.essencePrice = essencePrice;
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

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        return "WashCharge{" +
                "id=" + id +
                ", detailsId=" + detailsId +
                ", projectName='" + projectName + '\'' +
                ", ordinaryPrice=" + ordinaryPrice +
                ", essencePrice=" + essencePrice +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUser=" + createUser +
                '}';
    }
}