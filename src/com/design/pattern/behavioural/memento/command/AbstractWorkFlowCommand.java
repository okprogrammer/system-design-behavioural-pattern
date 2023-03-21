package com.design.pattern.behavioural.memento.command;

import com.design.pattern.behavioural.memento.WorkFlowDesigner;
import com.design.pattern.behavioural.memento.WorkFlowDesigner.Memento;

public abstract class AbstractWorkFlowCommand implements WorkflowCommand {

	protected Memento memento;

	protected WorkFlowDesigner receiver;

	public AbstractWorkFlowCommand(WorkFlowDesigner designer) {
		this.receiver = designer;
	}

	@Override
	public void undo() {
		receiver.setMemento(memento);
	}
}
