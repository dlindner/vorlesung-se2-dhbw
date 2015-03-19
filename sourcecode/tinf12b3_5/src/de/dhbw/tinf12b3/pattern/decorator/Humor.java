package de.dhbw.tinf12b3.pattern.decorator;

public class Humor extends Charakterzug {

	public Humor(Handlungsfähig nachfolger) {
		super(nachfolger);
	}

	@Override
	public void handle() {
		System.out.println("*grins*");
		super.handle();
		System.out.println("*lach*");
	}

}
