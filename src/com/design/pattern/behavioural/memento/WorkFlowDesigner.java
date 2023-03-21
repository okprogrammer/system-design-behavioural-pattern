package com.design.pattern.behavioural.memento;

//originator
public class WorkFlowDesigner {
	private WorkFlow workFlow;

	public void createWorkFlow(String nama) {
		workFlow = new WorkFlow(nama);
	}

	public WorkFlow getWorkFlow() {
		return this.workFlow;
	}

	public Memento getMemento() {
		if (workFlow == null) {
			return new Memento();
		}
		return new Memento(workFlow.getSteps(), workFlow.getName());
	}

	public void setMemento(Memento memento) {
		if (memento.isEmpty()) {
			this.workFlow = null;
		} else {
			this.workFlow = new WorkFlow(memento.getName(), memento.getSteps());
		}
	}

	public void addStep(String step) {
		workFlow.addStep(step);
	}

	public void removeStep(String step) {
		workFlow.removeStep(step);
	}

	public void print() {
		System.out.println(workFlow);
	}

	// Memento
	public class Memento {
		private String[] steps;
		private String name;

		private Memento() {

		}

		private Memento(String[] steps, String name) {
			this.steps = steps;
			this.name = name;
		}

		private String[] getSteps() {
			return steps;
		}

		private String getName() {
			return name;
		}

		private boolean isEmpty() {
			return this.getSteps() == null && this.getName() == null;
		}
	}

}
