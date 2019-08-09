package com.wash.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "d")
@Data
public class WashMaintenanceContentDao implements Serializable {
    @Column(name = "sort")
    private Integer sort;
    @Column(name = "name")
    private String name;
    @Column(name = "url")
    private String url;
}
