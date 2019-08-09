package com.wash.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wash_applet_user")
public class WashAppletUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 小程序用户的openid
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 用户头像
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户头像
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 性别  0-男、1-女
     */
    private Boolean gender;

    /**
     * 所在国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 语种
     */
    private String language;

    /**
     * 创建/注册时间
     */
    private Date ctime;

    /**
     * 手机号码
     */
    private String mobile;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取小程序用户的openid
     *
     * @return open_id - 小程序用户的openid
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置小程序用户的openid
     *
     * @param openId 小程序用户的openid
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取用户头像
     *
     * @return nick_name - 用户头像
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户头像
     *
     * @param nickName 用户头像
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 获取用户头像
     *
     * @return avatar_url - 用户头像
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置用户头像
     *
     * @param avatarUrl 用户头像
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * 获取性别  0-男、1-女
     *
     * @return gender - 性别  0-男、1-女
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置性别  0-男、1-女
     *
     * @param gender 性别  0-男、1-女
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取所在国家
     *
     * @return country - 所在国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置所在国家
     *
     * @param country 所在国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取语种
     *
     * @return language - 语种
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置语种
     *
     * @param language 语种
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * 获取创建/注册时间
     *
     * @return ctime - 创建/注册时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建/注册时间
     *
     * @param ctime 创建/注册时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", nickName=").append(nickName);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", gender=").append(gender);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", language=").append(language);
        sb.append(", ctime=").append(ctime);
        sb.append(", mobile=").append(mobile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}