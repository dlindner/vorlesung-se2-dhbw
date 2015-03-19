package de.dhbw.tinf12b3.pattern.decorator;

public class Humor extends Charakterzug {

	public Humor(Handlungsfähig nachfolger) {
		super(nachfolger);
	}

	@Override
	protected void handleVorher() {
		System.out.println("*grins*");
	}

	@Override
	protected void handleDanach() {
		System.out.println("*lach*");
	}
}
