package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_price_name")
public class WashPriceName implements Serializable {
    /**
     * 价格名称表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 获取价格名称表
     *
     * @return id - 价格名称表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置价格名称表
     *
     * @param id 价格名称表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名
     *
     * @return name - 名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名
     *
     * @param name 名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}