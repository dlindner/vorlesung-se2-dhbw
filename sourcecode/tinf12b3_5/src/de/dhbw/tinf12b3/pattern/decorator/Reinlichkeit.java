package de.dhbw.tinf12b3.pattern.decorator;

public class Reinlichkeit extends Charakterzug {

	public Reinlichkeit(Handlungsfähig nachfolger) {
		super(nachfolger);
	}

	@Override
	protected void handleDanach() {
		System.out.println("Alles ist sauber und abgespült.");
	}
}
