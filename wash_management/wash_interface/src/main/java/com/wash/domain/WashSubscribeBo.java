package com.wash.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class WashSubscribeBo implements Serializable {
    private String name;
    private String tel;
    private Long washSubscribe;
    private Long categoryIdOne;
    private Long categoryIdTwo;
    private String address;
    private String addressDetailed;
    List<WashSubscribeDetailed> washSubscribeDetaileds;

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

    public Long getWashSubscribe() {
        return washSubscribe;
    }

    public void setWashSubscribe(Long washSubscribe) {
        this.washSubscribe = washSubscribe;
    }

    public Long getCategoryIdOne() {
        return categoryIdOne;
    }

    public void setCategoryIdOne(Long categoryIdOne) {
        this.categoryIdOne = categoryIdOne;
    }

    public Long getCategoryIdTwo() {
        return categoryIdTwo;
    }

    public void setCategoryIdTwo(Long categoryIdTwo) {
        this.categoryIdTwo = categoryIdTwo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

    public List<WashSubscribeDetailed> getWashSubscribeDetaileds() {
        return washSubscribeDetaileds;
    }

    public void setWashSubscribeDetaileds(List<WashSubscribeDetailed> washSubscribeDetaileds) {
        this.washSubscribeDetaileds = washSubscribeDetaileds;
    }
}
