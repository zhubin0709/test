package com.wash.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WashServiceType {
    /**
     * 服务类型id
     */
    private Long id;

    /**
     * 服务名，如（清洗，维保）
     */
    private String name;

}
