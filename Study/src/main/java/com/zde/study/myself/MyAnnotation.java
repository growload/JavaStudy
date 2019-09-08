package com.zde.study.myself;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/9/5 19:30
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String[] value();
}
