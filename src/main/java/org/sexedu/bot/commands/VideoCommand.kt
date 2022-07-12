package org.sexedu.bot.commands

import com.github.kaktushose.jda.commands.annotations.Command
import com.github.kaktushose.jda.commands.annotations.CommandController
import com.github.kaktushose.jda.commands.dispatching.CommandEvent

@CommandController
class VideoCommand {
    @Command(name = "video", desc = "获取视频")
    fun video(event:CommandEvent) {
    }
}