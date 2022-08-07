package org.sexedu.bot;


import cn.hutool.core.codec.Base64;
import com.github.kaktushose.jda.commands.JDACommands;
import com.github.kaktushose.jda.commands.interactions.commands.CommandRegistrationPolicy;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static final String TOKEN = Base64.decodeStr("T1RrMU9UWXhNRE0wTkRZeU5EWXlNRGN6LkdHdVREeS52eFpXUzFhaWRwUnZiZzdOeXRfYm5Pei1EZ2ZqTlZXWjlrY05xNA==");

    public static void main(String[] args) throws LoginException {
        long guildId = 995978812271628348L;
        JDA jda = JDABuilder.createDefault(TOKEN).build();
        jda.addEventListener(new OnMessage());
        //JDACommands.start(jda, PingCommand.class);
        jda.upsertCommand("pang", "Calculate ping of the bot");
        JDACommands.slash(jda, Main.class).registrationPolicy(CommandRegistrationPolicy.MIGRATING).guilds(guildId).startGuild();
    }
}
