package de.dhbw.tinf12b3.weather;

public class Weatherman {

	public Weatherman() {
		super();
	}

	public void talkAbout(SkyObject something) {
		System.out.println("I'm not quite sure about this thing here");
	}

	public void talkAbout(Cloud cloud) {
		System.out.println("The cloud is the next big thing in IT");
	}

	public void talkAbout(Sun sun) {
		System.out.println("A great market heater");
	}

}
