package com.wash.domain;

/**
 * 用于接收前台传过来的数据类型
 */
public class WashSubscribeId {
private Long wash;
private Long Security;
    public WashSubscribeId(){}
    public WashSubscribeId(Long wash, Long security) {
        this.wash = wash;
        Security = security;
    }

    public Long getWash() {
        return wash;
    }

    public void setWash(Long wash) {
        this.wash = wash;
    }

    public Long getSecurity() {
        return Security;
    }

    public void setSecurity(Long security) {
        Security = security;
    }
}
