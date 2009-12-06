package de.dhbw.tit07.progress.internal;

import de.dhbw.tit07.progress.types.Percent;

public interface ProgressNotifier {

	public void notifyNewProgress(Percent percentage);

	public void notifyFinished();
}
