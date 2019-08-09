package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "rotary_planting_map")
public class RotaryPlantingMap implements Serializable {
    /**
     * 轮播图id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 0：小程序首页轮播  1:官网首页轮播
     */
    private Byte type;

    /**
     * 图片url
     */
    @Column(name = "imgUrl")
    private String imgurl;

    /**
     * 点击跳转的地方
     */
    @Column(name = "imgLink")
    private String imglink;

    /**
     * 优先级
     */
    private Long priority;

    private static final long serialVersionUID = 1L;

    /**
     * 获取轮播图id
     *
     * @return id - 轮播图id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置轮播图id
     *
     * @param id 轮播图id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取0：小程序首页轮播  1:官网首页轮播
     *
     * @return type - 0：小程序首页轮播  1:官网首页轮播
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置0：小程序首页轮播  1:官网首页轮播
     *
     * @param type 0：小程序首页轮播  1:官网首页轮播
     */
    public void setType(Byte type) {
        this.type = type;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getImglink() {
        return imglink;
    }

    public void setImglink(String imglink) {
        this.imglink = imglink;
    }

    /**
     * 获取优先级
     *
     * @return priority - 优先级
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", imglink=").append(imglink);
        sb.append(", priority=").append(priority);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}