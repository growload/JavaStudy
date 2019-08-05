package com.xinyin.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private Long id;

    private String proId;

    private String name;

    private String orderId;

    private String serialNumber;

    private Date beginTime;

    private Date endTime;

    private String buildUnit;

    private Long userId;

    private Double contractMoney;

    private Double judgeMoney;

    private Double manageMoney;

    private Double taxes;

    private Double buildMoney;

    private Double returnMoney;

    private Double profit;

    private String remark;

}