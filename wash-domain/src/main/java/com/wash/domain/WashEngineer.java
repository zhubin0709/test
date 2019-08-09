package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_engineer")
public class WashEngineer implements Serializable {
    /**
     * 工程师表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 昵称
     */
    @Column(name = "nic_name")
    private String nicName;

    /**
     * 图片
     */
    private String url;

    /**
     * 描述
     */
    private String description;

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
     * 获取工程师表
     *
     * @return id - 工程师表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置工程师表
     *
     * @param id 工程师表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取昵称
     *
     * @return nic_name - 昵称
     */
    public String getNicName() {
        return nicName;
    }

    /**
     * 设置昵称
     *
     * @param nicName 昵称
     */
    public void setNicName(String nicName) {
        this.nicName = nicName == null ? null : nicName.trim();
    }

    /**
     * 获取图片
     *
     * @return url - 图片
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片
     *
     * @param url 图片
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        sb.append(", name=").append(name);
        sb.append(", nicName=").append(nicName);
        sb.append(", url=").append(url);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}