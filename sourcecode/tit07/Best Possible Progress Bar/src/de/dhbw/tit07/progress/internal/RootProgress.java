package de.dhbw.tit07.progress.internal;

import de.dhbw.tit07.progress.types.Percent;

public class RootProgress extends InternalProgress {

	private final ProgressNotifier notifier;

	public RootProgress(ProgressNotifier notifier) {
		super();
		this.notifier = notifier;
	}

	@Override
	protected InternalProgress createChildProgress() {
		return new DivideableProgress(this);
	}

	@Override
	public void finished() {
		this.notifier.notifyFinished();
	}

	@Override
	protected void addAsCompleted(InternalProgress child) {
		super.addAsCompleted(child);
		this.notifier.notifyNewProgress(
				Percent.createFromFactor(getCompletionPercentage()));
	}

	@Override
	protected void reportPartialCompletion(double percentage) {
		this.notifier.notifyNewProgress(
				Percent.createFromFactor(getCompletionPercentage() + (percentage * getChildFactor())));
	}
}
