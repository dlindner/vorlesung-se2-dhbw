package de.dhbw.tinf12b3.pattern.decorator;

public class Kontostand extends Charakterzug {

	public Kontostand(Handlungsfähig nachfolger) {
		super(nachfolger);
	}

	@Override
	protected void handleVorher() {
		System.out.println("Bezahle Rechnungen.");
	}
}
