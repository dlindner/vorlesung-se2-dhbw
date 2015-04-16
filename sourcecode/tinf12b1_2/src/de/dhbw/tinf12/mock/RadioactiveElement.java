package de.dhbw.tinf12.mock;

public interface RadioactiveElement {

	public abstract void startDecaying();

	public abstract void addDecayListener(DecayListener l);
}