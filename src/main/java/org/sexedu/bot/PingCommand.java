package org.sexedu.bot;

import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.dispatching.CommandEvent;

@CommandController
public class PingCommand {

    @Command(value="ping")
    public void onPing(CommandEvent event) {
        event.reply("Pong!");
    }
}
