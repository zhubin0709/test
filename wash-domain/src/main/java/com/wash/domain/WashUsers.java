package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_users")
public class WashUsers implements Serializable {
    /**
     * user id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户真实姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 手机号码,用于绑定
     */
    private String iphone;

    /**
     * 用于邮箱绑定，及修改密码
     */
    private String email;

    /**
     * 盐加密
     */
    private String salt;

    /**
     * 帐号状态 1:生效 0:被冻结
     */
    private Byte status;

    /**
     * 用户类型: 1:后台用户（即管理此系统人员）2:商家用户 3:客户
     */
    @Column(name = "user_type")
    private Byte userType;

    /**
     * 部门id
     */
    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * 最后登陆IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    /**
     * 获取user id
     *
     * @return id - user id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置user id
     *
     * @param id user id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户真实姓名
     *
     * @return user_name - 用户真实姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param userName 用户真实姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取手机号码,用于绑定
     *
     * @return iphone - 手机号码,用于绑定
     */
    public String getIphone() {
        return iphone;
    }

    /**
     * 设置手机号码,用于绑定
     *
     * @param iphone 手机号码,用于绑定
     */
    public void setIphone(String iphone) {
        this.iphone = iphone == null ? null : iphone.trim();
    }

    /**
     * 获取用于邮箱绑定，及修改密码
     *
     * @return email - 用于邮箱绑定，及修改密码
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用于邮箱绑定，及修改密码
     *
     * @param email 用于邮箱绑定，及修改密码
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取盐加密
     *
     * @return salt - 盐加密
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐加密
     *
     * @param salt 盐加密
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取帐号状态 1:生效 0:被冻结
     *
     * @return status - 帐号状态 1:生效 0:被冻结
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置帐号状态 1:生效 0:被冻结
     *
     * @param status 帐号状态 1:生效 0:被冻结
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取用户类型: 1:后台用户（即管理此系统人员）2:商家用户 3:客户
     *
     * @return user_type - 用户类型: 1:后台用户（即管理此系统人员）2:商家用户 3:客户
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * 设置用户类型: 1:后台用户（即管理此系统人员）2:商家用户 3:客户
     *
     * @param userType 用户类型: 1:后台用户（即管理此系统人员）2:商家用户 3:客户
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * 获取部门id
     *
     * @return dept_id - 部门id
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门id
     *
     * @param deptId 部门id
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取最后登陆IP
     *
     * @return login_ip - 最后登陆IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登陆IP
     *
     * @param loginIp 最后登陆IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 获取添加时间
     *
     * @return create_time - 添加时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间
     *
     * @param createTime 添加时间
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
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", iphone=").append(iphone);
        sb.append(", email=").append(email);
        sb.append(", salt=").append(salt);
        sb.append(", status=").append(status);
        sb.append(", userType=").append(userType);
        sb.append(", deptId=").append(deptId);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}