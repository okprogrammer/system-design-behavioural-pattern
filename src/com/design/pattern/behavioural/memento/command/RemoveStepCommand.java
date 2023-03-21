package com.design.pattern.behavioural.memento.command;

import com.design.pattern.behavioural.memento.WorkFlowDesigner;

public class RemoveStepCommand extends AbstractWorkFlowCommand {

	private String step;

	public RemoveStepCommand(WorkFlowDesigner designer, String step) {
		super(designer);
		this.step = step;
	}

	@Override
	public void execute() {
		memento = receiver.getMemento();
		receiver.removeStep(step);
	}

}
