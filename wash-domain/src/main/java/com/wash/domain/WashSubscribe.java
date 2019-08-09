package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Table(name = "wash_subscribe")
public class WashSubscribe implements Serializable {
    /**
     * 预约表id(此id需要雪花算法)，不会自增长
     */
    @Id
    @Column(name = "subscribe_id")
    private Long subscribeId;

    /**
     * 可判断有没有登陆，没登陆，保存报错
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 联系人手机号码
     */
    private String tel;

    /**
     * 家电类型一级id
     */
    @Column(name = "category_id_one")
    private Long categoryIdOne;

    /**
     * 家电类型二级id
     */
    @Column(name = "category_id_two")
    private Long categoryIdTwo;

    /**
     * 地址（省级，市，区，街道）
     */
    private String address;

    /**
     * 详细地址（楼盘信息）
     */
    @Column(name = "address_detailed")
    private String addressDetailed;

    /**
     * 客户备注信息
     */
    private String remark;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 逻辑删除（0:未删除，1:已删除）
     */
    private Byte invalid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取预约表id(此id需要雪花算法)，不会自增长
     *
     * @return subscribe_id - 预约表id(此id需要雪花算法)，不会自增长
     */
    public Long getSubscribeId() {
        return subscribeId;
    }

    /**
     * 设置预约表id(此id需要雪花算法)，不会自增长
     *
     * @param subscribeId 预约表id(此id需要雪花算法)，不会自增长
     */
    public void setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
    }

    /**
     * 获取可判断有没有登陆，没登陆，保存报错
     *
     * @return user_id - 可判断有没有登陆，没登陆，保存报错
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置可判断有没有登陆，没登陆，保存报错
     *
     * @param userId 可判断有没有登陆，没登陆，保存报错
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取联系人姓名
     *
     * @return name - 联系人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置联系人姓名
     *
     * @param name 联系人姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取联系人手机号码
     *
     * @return tel - 联系人手机号码
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置联系人手机号码
     *
     * @param tel 联系人手机号码
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取家电类型一级id
     *
     * @return category_id_one - 家电类型一级id
     */
    public Long getCategoryIdOne() {
        return categoryIdOne;
    }

    /**
     * 设置家电类型一级id
     *
     * @param categoryIdOne 家电类型一级id
     */
    public void setCategoryIdOne(Long categoryIdOne) {
        this.categoryIdOne = categoryIdOne;
    }

    /**
     * 获取家电类型二级id
     *
     * @return category_id_two - 家电类型二级id
     */
    public Long getCategoryIdTwo() {
        return categoryIdTwo;
    }

    /**
     * 设置家电类型二级id
     *
     * @param categoryIdTwo 家电类型二级id
     */
    public void setCategoryIdTwo(Long categoryIdTwo) {
        this.categoryIdTwo = categoryIdTwo;
    }

    /**
     * 获取地址（省级，市，区，街道）
     *
     * @return address - 地址（省级，市，区，街道）
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址（省级，市，区，街道）
     *
     * @param address 地址（省级，市，区，街道）
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取详细地址（楼盘信息）
     *
     * @return address_detailed - 详细地址（楼盘信息）
     */
    public String getAddressDetailed() {
        return addressDetailed;
    }

    /**
     * 设置详细地址（楼盘信息）
     *
     * @param addressDetailed 详细地址（楼盘信息）
     */
    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed == null ? null : addressDetailed.trim();
    }

    /**
     * 获取客户备注信息
     *
     * @return remark - 客户备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置客户备注信息
     *
     * @param remark 客户备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
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
     * 获取逻辑删除（0:未删除，1:已删除）
     *
     * @return invalid - 逻辑删除（0:未删除，1:已删除）
     */
    public Byte getInvalid() {
        return invalid;
    }

    /**
     * 设置逻辑删除（0:未删除，1:已删除）
     *
     * @param invalid 逻辑删除（0:未删除，1:已删除）
     */
    public void setInvalid(Byte invalid) {
        this.invalid = invalid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", subscribeId=").append(subscribeId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", tel=").append(tel);
        sb.append(", categoryIdOne=").append(categoryIdOne);
        sb.append(", categoryIdTwo=").append(categoryIdTwo);
        sb.append(", address=").append(address);
        sb.append(", addressDetailed=").append(addressDetailed);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", invalid=").append(invalid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}