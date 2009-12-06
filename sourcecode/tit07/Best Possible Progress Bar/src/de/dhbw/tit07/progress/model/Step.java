package de.dhbw.tit07.progress.model;

public interface Step {

	public void perform(WorkUnit work) throws Exception;
}
