package com.xinyin.manager.http.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 响应可分页的实体
 *
 * @param <E> 数据库实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResponseBodyForPageableEntity<E> extends ResponseBodyCommon {

    private Integer pageCount;    // 总页数

    private Integer recordCount;  // 总数据量

    private List<E> list;         // 实体列表
}
