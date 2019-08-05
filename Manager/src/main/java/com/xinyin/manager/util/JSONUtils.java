package com.xinyin.manager.util;

import com.google.gson.Gson;

/**
 * @author: zhangdeen
 * @date: 2019/8/2 9:54
 * @version: v1.0
 */
public class JSONUtils {

    private static final Gson GSON = new Gson();
    private JSONUtils(){}

    public static Gson gson() {
        return GSON;
    }
}
