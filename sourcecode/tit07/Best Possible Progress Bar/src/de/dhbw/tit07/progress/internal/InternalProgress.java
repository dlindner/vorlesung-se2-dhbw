package de.dhbw.tit07.progress.internal;

import java.util.ArrayList;
import java.util.List;

import de.dhbw.tit07.progress.model.WorkUnit;

public abstract class InternalProgress implements WorkUnit {

	private final List<InternalProgress> children;
	private double completionPercentage;

	public InternalProgress() {
		super();
		this.children = new ArrayList<InternalProgress>();
		this.completionPercentage = 0.0d;
	}

	@Override
	public WorkUnit[] createParts(int partCount) {
		WorkUnit[] result = new WorkUnit[partCount];
		for (int i = 0; i < result.length; i++) {
			result[i] = addChild();
		}
		return result;
	}

	protected InternalProgress addChild() {
		InternalProgress newChild = createChildProgress();
		this.children.add(newChild);
		return newChild;
	}

	protected List<InternalProgress> getChildren() {
		return this.children;
	}

	protected double getChildFactor() {
		return (1.0d / this.children.size());
	}

	protected abstract InternalProgress createChildProgress();

	protected void addAsCompleted() {
		this.completionPercentage += getChildFactor();
	}

	protected abstract void reportPartialCompletion(double percentage);

	protected double getCompletionPercentage() {
		return this.completionPercentage;
	}
}
