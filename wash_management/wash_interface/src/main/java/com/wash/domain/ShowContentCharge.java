package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowContentCharge {
    Map<Long, List<WashMaintenanceDao>> showMap;
    Map<Long, List<WashMaintenanceContentDao>> contentMap;
    Map<Long, List<WashCharge>> chargeMap;

    public Map<Long, List<WashMaintenanceDao>> getShowMap() {
        return showMap;
    }

    public void setShowMap(Map<Long, List<WashMaintenanceDao>> showMap) {
        this.showMap = showMap;
    }

    public Map<Long, List<WashMaintenanceContentDao>> getContentMap() {
        return contentMap;
    }

    public void setContentMap(Map<Long, List<WashMaintenanceContentDao>> contentMap) {
        this.contentMap = contentMap;
    }

    public Map<Long, List<WashCharge>> getChargeMap() {
        return chargeMap;
    }

    public void setChargeMap(Map<Long, List<WashCharge>> chargeMap) {
        this.chargeMap = chargeMap;
    }
}