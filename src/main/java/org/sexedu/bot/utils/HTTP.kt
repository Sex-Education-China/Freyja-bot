package org.sexedu.bot.utils

import cn.hutool.http.HttpUtil

object HTTP {
    const val SERVER = "http://localhost:6000/"
    fun sendPost(url: String, paramMap: HashMap<String, String>): String {
        return HttpUtil.post(SERVER + url, paramMap as Map<String, Any>?)
    }
}