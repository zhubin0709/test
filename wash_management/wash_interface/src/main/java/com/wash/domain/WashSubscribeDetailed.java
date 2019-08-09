package com.wash.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashSubscribeDetailed implements Serializable {
    private Long id;
    private Long subscribeId;
    private Long serviceTypeId;
}
