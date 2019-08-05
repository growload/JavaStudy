package com.xinyin.manager.http.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @author: zhangdeen
 * @date: 2019/8/2 14:44
 * @version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {

    private int code; // 响应吗

    private Object info; // 返回信息

    private Integer pageCount;  // 总页数

    private Integer recordCount;    // 总数据量

    private List<Map<Object, Object>> list;

}
