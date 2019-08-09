package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WashDetails implements Serializable {
    private Long id;
    private Long categoryIdOne;
    private Long categoryIdTwo;
    private Long serviceTypeId;
    private Byte isDescription;
    private Byte isCharge;
    private Byte isContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public Byte getIsDescription() {
        return isDescription;
    }

    public void setIsDescription(Byte isDescription) {
        this.isDescription = isDescription;
    }

    public Byte getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(Byte isCharge) {
        this.isCharge = isCharge;
    }

    public Byte getIsContent() {
        return isContent;
    }

    public void setIsContent(Byte isContent) {
        this.isContent = isContent;
    }
}
