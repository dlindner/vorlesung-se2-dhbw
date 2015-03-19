package de.dhbw.tinf12b3.pattern.decorator;

public class Mann extends Handlungsfähig {

	public Mann() {
		super();
	}

	@Override
	public void handle() {
		System.out.println("Saufen. Meckern. Fussball.");
	}
}
