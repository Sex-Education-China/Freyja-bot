package org.sexedu.bot.utils;

import cn.hutool.http.HttpUtil;

import java.util.Map;

public class HTTP {
    public static final String SERVER = "http://localhost:8080/";
    public static String sendPost(String url, Map<String, Object> paramMap) {
        return HttpUtil.post(SERVER + url, paramMap);
    }
}
