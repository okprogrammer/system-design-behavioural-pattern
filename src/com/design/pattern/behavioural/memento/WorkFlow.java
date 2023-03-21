package com.design.pattern.behavioural.memento;

import java.util.Arrays;
import java.util.LinkedList;

//Caretaker
public class WorkFlow {

	private LinkedList<String> steps;

	private String name;

	public WorkFlow(String name) {
		this.name = name;
		this.steps = new LinkedList<>();
	}

	public WorkFlow(String name, String... steps) {
		this.name = name;
		this.steps = new LinkedList<>();
		if (steps != null && steps.length > 0) {
			Arrays.stream(steps).forEach(s -> this.steps.add(s));
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Workflow [name=");
		builder.append(name).append("]\nBEGIN->");
		for (String step : steps) {
			builder.append(step).append("->");
		}
		builder.append("END");
		return builder.toString();
	}

	public void addStep(String step) {
		steps.add(step);
	}

	public boolean removeStep(String step) {
		return steps.remove(step);
	}

	public String[] getSteps() {
		return steps.toArray(new String[steps.size()]);
	}

	public String getName() {
		return name;
	}

}
