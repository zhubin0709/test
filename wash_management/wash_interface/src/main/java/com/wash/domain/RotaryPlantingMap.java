package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RotaryPlantingMap implements Serializable {
    private long id;
    private Byte type;
    private String imgurl;
    private String imglink;
    private long priority;
}
