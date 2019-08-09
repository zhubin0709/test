package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_details")
public class WashDetails implements Serializable {
    /**
     * 详情表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 一级分类id
     */
    @Column(name = "category_id_one")
    private Long categoryIdOne;

    /**
     * 二级分类id
     */
    @Column(name = "category_id_two")
    private Long categoryIdTwo;

    /**
     * 服务类型id（清洗和维保）
     */
    @Column(name = "service_type_id")
    private Long serviceTypeId;

    /**
     * 是否有服务说明(1:有，0:没有，默认1)
     */
    @Column(name = "is_description")
    private Byte isDescription;

    /**
     * 是否有收费说明(1:有，0:没有，默认1)
     */
    @Column(name = "is_charge")
    private Byte isCharge;

    /**
     * 是否有服务内容(1:有，0:没有，默认1)
     */
    @Column(name = "is_content")
    private Byte isContent;

    private static final long serialVersionUID = 1L;

    /**
     * 获取详情表
     *
     * @return id - 详情表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置详情表
     *
     * @param id 详情表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取一级分类id
     *
     * @return category_id_one - 一级分类id
     */
    public Long getCategoryIdOne() {
        return categoryIdOne;
    }

    /**
     * 设置一级分类id
     *
     * @param categoryIdOne 一级分类id
     */
    public void setCategoryIdOne(Long categoryIdOne) {
        this.categoryIdOne = categoryIdOne;
    }

    /**
     * 获取二级分类id
     *
     * @return category_id_two - 二级分类id
     */
    public Long getCategoryIdTwo() {
        return categoryIdTwo;
    }

    /**
     * 设置二级分类id
     *
     * @param categoryIdTwo 二级分类id
     */
    public void setCategoryIdTwo(Long categoryIdTwo) {
        this.categoryIdTwo = categoryIdTwo;
    }

    /**
     * 获取服务类型id（清洗和维保）
     *
     * @return service_type_id - 服务类型id（清洗和维保）
     */
    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * 设置服务类型id（清洗和维保）
     *
     * @param serviceTypeId 服务类型id（清洗和维保）
     */
    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * 获取是否有服务说明(1:有，0:没有，默认1)
     *
     * @return is_description - 是否有服务说明(1:有，0:没有，默认1)
     */
    public Byte getIsDescription() {
        return isDescription;
    }

    /**
     * 设置是否有服务说明(1:有，0:没有，默认1)
     *
     * @param isDescription 是否有服务说明(1:有，0:没有，默认1)
     */
    public void setIsDescription(Byte isDescription) {
        this.isDescription = isDescription;
    }

    /**
     * 获取是否有收费说明(1:有，0:没有，默认1)
     *
     * @return is_charge - 是否有收费说明(1:有，0:没有，默认1)
     */
    public Byte getIsCharge() {
        return isCharge;
    }

    /**
     * 设置是否有收费说明(1:有，0:没有，默认1)
     *
     * @param isCharge 是否有收费说明(1:有，0:没有，默认1)
     */
    public void setIsCharge(Byte isCharge) {
        this.isCharge = isCharge;
    }

    /**
     * 获取是否有服务内容(1:有，0:没有，默认1)
     *
     * @return is_content - 是否有服务内容(1:有，0:没有，默认1)
     */
    public Byte getIsContent() {
        return isContent;
    }

    /**
     * 设置是否有服务内容(1:有，0:没有，默认1)
     *
     * @param isContent 是否有服务内容(1:有，0:没有，默认1)
     */
    public void setIsContent(Byte isContent) {
        this.isContent = isContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryIdOne=").append(categoryIdOne);
        sb.append(", categoryIdTwo=").append(categoryIdTwo);
        sb.append(", serviceTypeId=").append(serviceTypeId);
        sb.append(", isDescription=").append(isDescription);
        sb.append(", isCharge=").append(isCharge);
        sb.append(", isContent=").append(isContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}