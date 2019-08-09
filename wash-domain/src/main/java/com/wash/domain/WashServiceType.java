package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_service_type")
public class WashServiceType implements Serializable {
    /**
     * 服务类型id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 服务名，如（清洗，维保）
     */
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * 获取服务类型id
     *
     * @return id - 服务类型id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置服务类型id
     *
     * @param id 服务类型id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取服务名，如（清洗，维保）
     *
     * @return name - 服务名，如（清洗，维保）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置服务名，如（清洗，维保）
     *
     * @param name 服务名，如（清洗，维保）
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