package com.xinyin.manager.http.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ResponseBodyForSingleEntity<T> extends ResponseBodyCommon{

    private T entity;
}
