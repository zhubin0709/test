package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_shows")
public class WashShows implements Serializable {
    /**
     * 说明表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * (服务说明和服务内容中的文字)
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 获取说明表
     *
     * @return id - 说明表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置说明表
     *
     * @param id 说明表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取(服务说明和服务内容中的文字)
     *
     * @return name - (服务说明和服务内容中的文字)
     */
    public String getName() {
        return name;
    }

    /**
     * 设置(服务说明和服务内容中的文字)
     *
     * @param name (服务说明和服务内容中的文字)
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