package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashCaseShow implements Serializable {
    private long id;
    private long serviceTypeId;
    private String url;
    private String name;
    private Date createTime;
    private Date updateTime;
    private String createUser;
}
