package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashSubscribeAndWashServiceType implements Serializable {
    private Long subscribeId;
    private String name;
}
