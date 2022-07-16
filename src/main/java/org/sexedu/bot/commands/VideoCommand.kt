package org.sexedu.bot.commands

import cn.hutool.core.swing.clipboard.ClipboardUtil
import com.github.kaktushose.jda.commands.annotations.Command
import com.github.kaktushose.jda.commands.annotations.CommandController
import com.github.kaktushose.jda.commands.dispatching.CommandEvent
import com.google.gson.Gson
import net.dv8tion.jda.api.EmbedBuilder
import org.sexedu.bot.utils.HTTP
import org.sexedu.bot.utils.VideoBean
import java.util.*

@CommandController
class VideoCommand {
    @Command(value =["ping"] ,desc="获取视频")
    fun video(event:CommandEvent) {
        try {
            val map = HashMap<String,String>()
            var str = HTTP.sendPost("admin/randomVideo", map as Map<String, Any>?)
            ClipboardUtil.setStr(str)
            var gson = Gson()
                .newBuilder()
                .setLenient()
                .create()
            val enums: Array<VideoBean> = gson.fromJson(str, Array<VideoBean>::class.java)
            //str = gson.toJson(str)


            var embed = EmbedBuilder()
                .addField("标题", enums[0].title + "\n", false)
                .addField("标签", enums[0].tag.toString(), false)
                .setImage(enums[0].preview)
                .setColor(0x00ff00)

            event.reply(embed)
            println("called")
        } catch (InvocationTargetException: Exception) {
            println("error")
        }
    }
}