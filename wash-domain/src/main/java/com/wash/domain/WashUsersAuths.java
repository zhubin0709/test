package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_users_auths")
public class WashUsersAuths implements Serializable {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户表对应的主键
     */
    @Column(name = "users_id")
    private Long usersId;

    /**
     * 登录类别，如：1.注册用户、2.手机，3.或者第三方的QQ、4.微信
     */
    private Byte type;

    /**
     * 身份唯一标识，如：登录账号、手机验证码、QQ号码、微信号
     */
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * 站内账号是密码、第三方登录是Token；
     */
    private String password;

    /**
     * 授权账号是否被验证；0:否 1:是
     */
    @Column(name = "is_verified")
    private Byte isVerified;

    /**
     * 头像路径
     */
    private String avatar;

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
     * 获取用户表对应的主键
     *
     * @return users_id - 用户表对应的主键
     */
    public Long getUsersId() {
        return usersId;
    }

    /**
     * 设置用户表对应的主键
     *
     * @param usersId 用户表对应的主键
     */
    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    /**
     * 获取登录类别，如：1.注册用户、2.手机，3.或者第三方的QQ、4.微信
     *
     * @return type - 登录类别，如：1.注册用户、2.手机，3.或者第三方的QQ、4.微信
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置登录类别，如：1.注册用户、2.手机，3.或者第三方的QQ、4.微信
     *
     * @param type 登录类别，如：1.注册用户、2.手机，3.或者第三方的QQ、4.微信
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取身份唯一标识，如：登录账号、手机验证码、QQ号码、微信号
     *
     * @return account_number - 身份唯一标识，如：登录账号、手机验证码、QQ号码、微信号
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置身份唯一标识，如：登录账号、手机验证码、QQ号码、微信号
     *
     * @param accountNumber 身份唯一标识，如：登录账号、手机验证码、QQ号码、微信号
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    /**
     * 获取站内账号是密码、第三方登录是Token；
     *
     * @return password - 站内账号是密码、第三方登录是Token；
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置站内账号是密码、第三方登录是Token；
     *
     * @param password 站内账号是密码、第三方登录是Token；
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取授权账号是否被验证；0:否 1:是
     *
     * @return is_verified - 授权账号是否被验证；0:否 1:是
     */
    public Byte getIsVerified() {
        return isVerified;
    }

    /**
     * 设置授权账号是否被验证；0:否 1:是
     *
     * @param isVerified 授权账号是否被验证；0:否 1:是
     */
    public void setIsVerified(Byte isVerified) {
        this.isVerified = isVerified;
    }

    /**
     * 获取头像路径
     *
     * @return avatar - 头像路径
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像路径
     *
     * @param avatar 头像路径
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usersId=").append(usersId);
        sb.append(", type=").append(type);
        sb.append(", accountNumber=").append(accountNumber);
        sb.append(", password=").append(password);
        sb.append(", isVerified=").append(isVerified);
        sb.append(", avatar=").append(avatar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}