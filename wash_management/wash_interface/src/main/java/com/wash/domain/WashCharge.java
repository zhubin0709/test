package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashCharge implements Serializable {
    private Long detailsId;
    private String projectName;
    private Double ordinaryPrice;
    private Double essencePrice;

    public Long getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Long detailsId) {
        this.detailsId = detailsId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getOrdinaryPrice() {
        return ordinaryPrice;
    }

    public void setOrdinaryPrice(Double ordinaryPrice) {
        this.ordinaryPrice = ordinaryPrice;
    }

    public Double getEssencePrice() {
        return essencePrice;
    }

    public void setEssencePrice(Double essencePrice) {
        this.essencePrice = essencePrice;
    }
}
