package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashSubscribe implements Serializable {
    private Long subscribeId;
    private Long userId;
    private String name;
    private String tel;
    private Long categoryIdOne;
    private Long categoryIdTwo;
    private String address;
    private String addressDetailed;
    private String remark;
    private Date createTime=new Date();
    private Date updateTime=new Date();
    private Byte invalid;
}
