package org.sexedu.bot;


import com.github.kaktushose.jda.commands.JDACommands;
import com.github.kaktushose.jda.commands.interactions.commands.CommandRegistrationPolicy;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static final String TOKEN = "OTk1OTYxMDM0NDYyNDYyMDcz.GGuTDy.vxZWS1aidpRvbg7Nyt_bnOz-DgfjNVWZ9kcNq4";

    public static void main(String[] args) throws LoginException, InterruptedException {
        long guildId = 995978812271628348L; //Discord4J's server ID.
        JDA jda = JDABuilder.createDefault(TOKEN).build();
        //JDACommands.start(jda, PingCommand.class);
        JDACommands.slash(jda, Main.class).registrationPolicy(CommandRegistrationPolicy.MIGRATING).guilds(guildId).startGuild();
    }
}