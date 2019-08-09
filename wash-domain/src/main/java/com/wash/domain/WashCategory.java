package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_category")
public class WashCategory implements Serializable {
    /**
     * 类目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 父类目id,顶级类目填0
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 是否为父节点，0为否，1为是
     */
    @Column(name = "is_parent")
    private Boolean isParent;

    /**
     * 排序
     */
    private Integer sort;

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

    private static final long serialVersionUID = 1L;

    /**
     * 获取类目id
     *
     * @return id - 类目id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置类目id
     *
     * @param id 类目id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取类目名称
     *
     * @return name - 类目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类目名称
     *
     * @param name 类目名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取父类目id,顶级类目填0
     *
     * @return parent_id - 父类目id,顶级类目填0
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父类目id,顶级类目填0
     *
     * @param parentId 父类目id,顶级类目填0
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取是否为父节点，0为否，1为是
     *
     * @return is_parent - 是否为父节点，0为否，1为是
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * 设置是否为父节点，0为否，1为是
     *
     * @param isParent 是否为父节点，0为否，1为是
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", isParent=").append(isParent);
        sb.append(", sort=").append(sort);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}