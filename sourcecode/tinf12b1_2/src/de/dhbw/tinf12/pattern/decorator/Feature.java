package de.dhbw.tinf12.pattern.decorator;

public abstract class Feature implements Staatseigentum {

	private final Staatseigentum nächste;

	public Feature(Staatseigentum nächste) {
		super();
		this.nächste = nächste;
	}

	@Override
	public void herrsche() {
		this.nächste.herrsche();
	}
}
