package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;


@Table(name = "d")
@Data
public class WashMaintenanceDao implements Serializable {
    @Column(name = "sort")
    private Integer sort;
    @Column(name = "name")
    private String name;
}
