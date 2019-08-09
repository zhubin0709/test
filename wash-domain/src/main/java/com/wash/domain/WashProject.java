package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_project")
public class WashProject implements Serializable {
    /**
     * 项目名表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名字
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 获取项目名表
     *
     * @return id - 项目名表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置项目名表
     *
     * @param id 项目名表
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