package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashEngineer implements Serializable {
    private String name;
    private String nicName;
    private String url;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Long createUser;
}
