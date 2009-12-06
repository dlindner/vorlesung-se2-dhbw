package de.dhbw.tit07.progress.model;

import de.dhbw.tit07.progress.types.Percent;

public interface ProgressListener {

	public void progressing(Percent percentage);

	public void finished();
}
