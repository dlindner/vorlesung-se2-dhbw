package de.dhbw.tinf12b3.pattern.decorator;

public abstract class Charakterzug extends Handlungsfähig {

	private final Handlungsfähig nächstes;

	public Charakterzug(Handlungsfähig nachfolger) {
		super();
		this.nächstes = nachfolger;
	}

	@Override
	public final void handle() {
		handleVorher();
		this.nächstes.handle();
		handleDanach();
	}

	protected void handleDanach() {
		// leer
	}

	protected void handleVorher() {
		// leer
	}
}
