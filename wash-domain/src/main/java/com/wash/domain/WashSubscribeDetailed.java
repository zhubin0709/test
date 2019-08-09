package com.wash.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wash_subscribe_detailed")
public class WashSubscribeDetailed implements Serializable {
    /**
     * 我要预约详情表id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 预约表id
     */
    @Column(name = "subscribe_id")
    private Long subscribeId;

    /**
     * 服务表id
     */
    @Column(name = "service_type_id")
    private Long serviceTypeId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取我要预约详情表id
     *
     * @return id - 我要预约详情表id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置我要预约详情表id
     *
     * @param id 我要预约详情表id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取预约表id
     *
     * @return subscribe_id - 预约表id
     */
    public Long getSubscribeId() {
        return subscribeId;
    }

    /**
     * 设置预约表id
     *
     * @param subscribeId 预约表id
     */
    public void setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
    }

    /**
     * 获取服务表id
     *
     * @return service_type_id - 服务表id
     */
    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * 设置服务表id
     *
     * @param serviceTypeId 服务表id
     */
    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subscribeId=").append(subscribeId);
        sb.append(", serviceTypeId=").append(serviceTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}