package de.dhbw.tinf12b3.weather;

public class Cloud extends SkyObject {

	public Cloud() {
		super();
	}

	@Override
	public void appear() {
		System.out.println("Ich bin eine Wolke!");
	}

	@Override
	public void vanish() {
		System.out.println("This was your data...");
	}
}
