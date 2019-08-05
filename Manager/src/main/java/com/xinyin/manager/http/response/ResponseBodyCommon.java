package com.xinyin.manager.http.response;


import lombok.Data;

import java.util.Map;

@Data
public class ResponseBodyCommon {

    private Integer code;               // 响应码
    private String info;                // 响应信息
    private Map<String, Object> data;   // 响应数据
}
