package com.xinyin.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material {
    private Long id;

    private String name;

    private String type;

    private String count;

    private Double price;

    private Long projectId;
}