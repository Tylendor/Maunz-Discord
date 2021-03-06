package com.vauff.maunzdiscord.commands;

import com.vauff.maunzdiscord.core.ICommand;
import com.vauff.maunzdiscord.core.Util;

import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class Source implements ICommand<MessageReceivedEvent>
{
	@Override
	public void exe(MessageReceivedEvent event) throws Exception
	{
		Util.msg(event.getMessage().getChannel(), "My source is available at https://github.com/Vauff/Maunz-Discord");
	}

	@Override
	public String[] getAliases()
	{
		return new String[] { "*source" };
	}
}