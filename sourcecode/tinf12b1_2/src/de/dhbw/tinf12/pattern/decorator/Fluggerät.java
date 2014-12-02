package de.dhbw.tinf12.pattern.decorator;

public class Fluggerät extends Feature {

	public Fluggerät(Staatseigentum sockel) {
		super(sockel);
	}

	@Override
	public void herrsche() {
		System.out.print("Im Flug... ");
		super.herrsche();
	}
}
