package de.dhbw.tit07.progress.model;


public interface WorkUnit {

	public WorkUnit[] createParts(int partCount);

	public void finished();
}
