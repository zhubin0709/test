package com.wash.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class WashSubscribeDao implements Serializable {
    private Long subscribeId;
    private String name;
    private String tel;
    private String category;
    private String address;
    List<WashSubscribeAndWashServiceType> washSubscribeDtailedTypes;
    private String addressDetailed;
    private String remark;
    public Long getSubscribeId() {
        return subscribeId;
    }

    public void setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<WashSubscribeAndWashServiceType> getWashSubscribeDtailedTypes() {
        return washSubscribeDtailedTypes;
    }

    public void setWashSubscribeDtailedTypes(List<WashSubscribeAndWashServiceType> washSubscribeDtailedTypes) {
        this.washSubscribeDtailedTypes = washSubscribeDtailedTypes;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
