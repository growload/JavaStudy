package com.xinyin.manager.http.response.entity;

import com.xinyin.manager.entity.Project;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取项目详情以及用料详情响应体
 *
 * @author: zhangdeen
 * @date: 2019/8/2 14:54
 * @version: v1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResponseBodyForProject extends Project {

    /**
     * 材料名称
     */
    private String materialName;

    /**
     * 材料类型
     */
    private String materialType;

    /**
     * 材料用量
     */
    private String materialCount;

    /**
     * 材料总价
     */
    private Double materialPrice;

}
