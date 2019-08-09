package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_description")
public class WashDescription implements Serializable {
    /**
     * 服务说明
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 详情表id
     */
    @Column(name = "details_id")
    private Long detailsId;

    /**
     * 说明id
     */
    @Column(name = "shows_id")
    private Long showsId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    @Column(name = "crete_time")
    private Date creteTime;

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

    /**
     * 获取服务说明
     *
     * @return id - 服务说明
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置服务说明
     *
     * @param id 服务说明
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取详情表id
     *
     * @return details_id - 详情表id
     */
    public Long getDetailsId() {
        return detailsId;
    }

    /**
     * 设置详情表id
     *
     * @param detailsId 详情表id
     */
    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    /**
     * 获取说明id
     *
     * @return shows_id - 说明id
     */
    public Long getShowsId() {
        return showsId;
    }

    /**
     * 设置说明id
     *
     * @param showsId 说明id
     */
    public void setShowsId(Long showsId) {
        this.showsId = showsId;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取创建时间
     *
     * @return crete_time - 创建时间
     */
    public Date getCreteTime() {
        return creteTime;
    }

    /**
     * 设置创建时间
     *
     * @param creteTime 创建时间
     */
    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", detailsId=").append(detailsId);
        sb.append(", showsId=").append(showsId);
        sb.append(", sort=").append(sort);
        sb.append(", creteTime=").append(creteTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}