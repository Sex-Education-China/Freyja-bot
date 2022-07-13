package org.sexedu.bot;

import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.dispatching.CommandEvent;

@CommandController
public class PingCommand {

    //@Command(value ="ping" ,desc="获取视频")
    public void onPing(CommandEvent event) {
        event.reply("Pong!");
    }
}
