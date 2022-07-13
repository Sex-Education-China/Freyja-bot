package org.sexedu.bot.commands

import cn.hutool.core.swing.clipboard.ClipboardUtil
import com.github.kaktushose.jda.commands.annotations.Command
import com.github.kaktushose.jda.commands.annotations.CommandController
import com.github.kaktushose.jda.commands.dispatching.CommandEvent
import com.google.gson.Gson
import org.sexedu.bot.utils.HTTP
import org.sexedu.bot.utils.VideoBean
import java.util.*

@CommandController
class VideoCommand {
    @Command(value =["ping"] ,desc="获取视频")
    fun video(event:CommandEvent) {
        val map = HashMap<String,String>()
        var str = HTTP.sendPost("admin/randomVideo", map as Map<String, Any>?)
        str = str.substring(0, str.length - 1)
        var gson = Gson()
            .newBuilder()
            .setLenient()
            .create()
        //str = gson.toJson(str)
        println(str)
        //ClipboardUtil.setStr(str)
        val b: VideoBean = gson.fromJson(str, VideoBean::class.java)
        event.reply(b.toString())
    }
}