package org.sexedu.bot.api

import cn.hutool.http.HttpUtil
import org.sexedu.bot.utils.HTTP

object User {
    fun register(user: String, password: String,id:String):String {
        var map = HashMap<String,String>()
        map.put("username",user)
        map.put("password",password)
        map.put("id",id)
        return HTTP.sendPost("/user/register", map as Map<String, Any>?)
    }
}