package com.xinyin.manager.http.request;

import lombok.Data;

/**
 * ID数组请求体模型
 *
 * @author: zhangdeen
 * @date: 2019/8/2 16:27
 * @version: v1.0
 */
@Data
public class RequestBodyForIds {

    private Long[] ids;
}
