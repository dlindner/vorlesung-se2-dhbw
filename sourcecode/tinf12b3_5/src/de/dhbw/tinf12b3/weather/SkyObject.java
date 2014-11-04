package de.dhbw.tinf12b3.weather;

public abstract class SkyObject extends Object {

	public SkyObject() {
		super();
	}

	public void appear() {
		System.out.println("I am the new thing in the sky");
	}

	public void vanish() {
		System.out.println("That's all, folks");
	}
}
