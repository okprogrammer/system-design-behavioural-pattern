package com.design.pattern.behavioural.memento;

import java.util.LinkedList;

import com.design.pattern.behavioural.memento.command.AddStepCommand;
import com.design.pattern.behavioural.memento.command.CreateCommand;
import com.design.pattern.behavioural.memento.command.WorkflowCommand;

public class Client {

	public static void main(String[] args) {
		WorkFlowDesigner designer = new WorkFlowDesigner();
		LinkedList<WorkflowCommand> commands = runCommands(designer);
		designer.print();

		undoLastCommand(commands);
		designer.print();

		undoLastCommand(commands);
		designer.print();
	}

	private static void undoLastCommand(LinkedList<WorkflowCommand> commands) {
		if (!commands.isEmpty()) {
			commands.removeLast().undo();
		}

	}

	private static LinkedList<WorkflowCommand> runCommands(WorkFlowDesigner designer) {
		LinkedList<WorkflowCommand> commands = new LinkedList<>();

		WorkflowCommand cmd = new CreateCommand(designer, "Leave Workflow");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Create Leave Application");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Submit Application");
		commands.addLast(cmd);
		cmd.execute();

		cmd = new AddStepCommand(designer, "Application Approved");
		commands.addLast(cmd);
		cmd.execute();

		return commands;
	}

}
