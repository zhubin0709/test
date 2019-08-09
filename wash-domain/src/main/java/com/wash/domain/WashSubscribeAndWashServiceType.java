package com.wash.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
@Table(name = "b")
@Data
public class WashSubscribeAndWashServiceType implements Serializable {
        @Column(name = "subscribe_id")
        private Long subscribeId;
        @Column(name = "name")
        private String name;

}
