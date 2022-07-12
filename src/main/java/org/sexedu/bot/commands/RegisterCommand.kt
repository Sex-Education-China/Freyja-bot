package org.sexedu.bot.commands

import com.github.kaktushose.jda.commands.annotations.Command
import com.github.kaktushose.jda.commands.annotations.CommandController
import com.github.kaktushose.jda.commands.dispatching.CommandEvent
import org.sexedu.bot.api.User
import org.sexedu.bot.database.DatabaseMain

@CommandController
class RegisterCommand {
    @Command(value = ["register"] , desc = "注册一个账号，在后期网站完成建设后您仍可使用该账号登录")
    fun onRegister(event: CommandEvent,username:String,password:String) {
        if (DatabaseMain.isExits(event.user.id)) {
            event.reply("You are already registered!")
            return
        }
        User.register(username,password,event.user.id)
        event.reply("注册成功!")
    }
}