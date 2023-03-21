package com.design.pattern.behavioural.memento.command;

import com.design.pattern.behavioural.memento.WorkFlowDesigner;

public class AddStepCommand extends AbstractWorkFlowCommand {

	private String step;

	public AddStepCommand(WorkFlowDesigner designer, String step) {
		super(designer);
		this.step = step;
	}

	@Override
	public void execute() {
		this.memento = receiver.getMemento();
		receiver.addStep(step);
	}

}
