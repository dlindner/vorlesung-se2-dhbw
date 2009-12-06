package de.dhbw.tit07.progress.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.dhbw.tit07.progress.internal.ProgressNotifier;
import de.dhbw.tit07.progress.internal.RootProgress;
import de.dhbw.tit07.progress.types.Percent;


public class Task implements ProgressNotifier {

	private final String denotation;
	private final List<Step> steps;
	private final List<ProgressListener> listeners;
	private long totalDuration;

	public Task(String denotation) {
		super();
		this.denotation = denotation;
		this.steps = new ArrayList<Step>();
		this.listeners = new ArrayList<ProgressListener>();
		this.totalDuration = 0L;
	}

	public void addProgressListener(ProgressListener listener) {
		if (null == listener) {
			return;
		}
		this.listeners.add(listener);
	}

	public void removeProgressListener(ProgressListener listener) {
		this.listeners.remove(listener);
	}

	public void addSteps(Step... additionalSteps) {
		Collections.addAll(this.steps, additionalSteps);
	}

	public void perform() throws Exception {
		long start = System.currentTimeMillis();
		RootProgress progress = new RootProgress(this);
		int stepCount = this.steps.size();
		WorkUnit[] subProgresses = progress.createParts(stepCount);
		int index = 0;
		for (Step currentStep : this.steps) {
			currentStep.perform(subProgresses[index]);
			index++;
		}
		progress.finished();
		this.totalDuration = (System.currentTimeMillis() - start);
	}

	@Override
	public void notifyFinished() {
		for (ProgressListener listener : this.listeners) {
			listener.finished();
		}
	}

	@Override
	public void notifyNewProgress(Percent percentage) {
		for (ProgressListener listener : this.listeners) {
			listener.progressing(percentage);
		}
	}

	public void printStatistics() {
		System.out.println("Task " + this.denotation + " took " + this.totalDuration + " milliseconds."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
}
