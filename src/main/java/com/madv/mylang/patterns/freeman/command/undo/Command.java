package com.madv.mylang.patterns.freeman.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
