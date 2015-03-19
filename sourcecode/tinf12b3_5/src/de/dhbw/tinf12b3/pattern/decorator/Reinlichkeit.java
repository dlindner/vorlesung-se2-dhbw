package de.dhbw.tinf12b3.pattern.decorator;

public class Reinlichkeit extends Charakterzug {

	public Reinlichkeit(Handlungsfähig nachfolger) {
		super(nachfolger);
	}

	@Override
	public void handle() {
		super.handle();
		System.out.println("Alles ist sauber und abgespült.");
	}
}
