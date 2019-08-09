package com.wash.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class WashSubscribeDetails implements  Serializable{
    private Long categoryIdOne;
    private Long categoryIdTwo;
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

    public WashSubscribeDetails(Long categoryIdOne, Long categoryIdTwo) {
        this.categoryIdOne = categoryIdOne;
        this.categoryIdTwo = categoryIdTwo;
    }

    public WashSubscribeDetails() {
    }
}
