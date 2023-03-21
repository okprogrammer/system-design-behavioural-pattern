package com.design.pattern.behavioural.memento.command;

import com.design.pattern.behavioural.memento.WorkFlowDesigner;

public class CreateCommand extends AbstractWorkFlowCommand {

	public CreateCommand(WorkFlowDesigner designer, String name) {
		super(designer);
		this.name = name;
	}

	private String name;

	@Override
	public void execute() {
		this.memento = receiver.getMemento();
		receiver.createWorkFlow(name);

	}

}
