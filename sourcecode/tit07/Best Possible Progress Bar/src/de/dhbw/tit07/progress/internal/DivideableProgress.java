package de.dhbw.tit07.progress.internal;

public class DivideableProgress extends InternalProgress {

	private final InternalProgress parent;

	public DivideableProgress(InternalProgress parent) {
		super();
		this.parent = parent;
	}

	@Override
	protected InternalProgress createChildProgress() {
		return new DivideableProgress(this);
	}

	@Override
	public void finished() {
		this.parent.addAsCompleted();
	}

	@Override
	protected void addAsCompleted() {
		super.addAsCompleted();
		this.parent.reportPartialCompletion(getCompletionPercentage());
	}

	@Override
	protected void reportPartialCompletion(double percentage) {
		this.parent.reportPartialCompletion(getCompletionPercentage() + (percentage * getChildFactor()));
	}
}
