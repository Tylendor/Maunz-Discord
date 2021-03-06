package com.vauff.maunzdiscord.commands;

import com.vauff.maunzdiscord.core.ICommand;
import com.vauff.maunzdiscord.core.Util;

import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class Trello implements ICommand<MessageReceivedEvent>
{
	@Override
	public void exe(MessageReceivedEvent event) throws Exception
	{
		Util.msg(event.getMessage().getChannel(), "My Trello board is located at https://trello.com/b/9W7PmTvX/maunz");
	}

	@Override
	public String[] getAliases()
	{
		return new String[] { "*trello" };
	}
}