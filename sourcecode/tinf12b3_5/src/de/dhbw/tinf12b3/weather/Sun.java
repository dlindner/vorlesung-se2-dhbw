package de.dhbw.tinf12b3.weather;

public class Sun extends SkyObject {

	public Sun() {
		super();
	}

	@Override
	public void appear() {
		System.out.println("It's a beautiful day");
	}

	@Override
	public void vanish() {
		System.out.println("We are now called Oracle");
	}

	public void burn() {
		System.out.println("You are burnt!");
	}
}
