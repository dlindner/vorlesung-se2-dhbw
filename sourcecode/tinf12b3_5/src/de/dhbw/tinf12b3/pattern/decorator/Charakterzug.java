package de.dhbw.tinf12b3.pattern.decorator;

public abstract class Charakterzug extends Handlungsfähig {

	private final Handlungsfähig nächstes;

	public Charakterzug(Handlungsfähig nachfolger) {
		super();
		this.nächstes = nachfolger;
	}

	@Override
	public void handle() {
		this.nächstes.handle();
	}
}
