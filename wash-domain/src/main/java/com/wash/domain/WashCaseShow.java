package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_case_show")
public class WashCaseShow implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * wash_service_type的id
     */
    @Column(name = "service_type_id")
    private Long serviceTypeId;

    /**
     * 图片存储地址
     */
    private String url;

    private String name;

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
     * wash_user_id(创建人)
     */
    @Column(name = "create_user")
    private Long createUser;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取wash_service_type的id
     *
     * @return service_type_id - wash_service_type的id
     */
    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * 设置wash_service_type的id
     *
     * @param serviceTypeId wash_service_type的id
     */
    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * 获取图片存储地址
     *
     * @return url - 图片存储地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片存储地址
     *
     * @param url 图片存储地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取wash_user_id(创建人)
     *
     * @return create_user - wash_user_id(创建人)
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 设置wash_user_id(创建人)
     *
     * @param createUser wash_user_id(创建人)
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
        sb.append(", serviceTypeId=").append(serviceTypeId);
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}