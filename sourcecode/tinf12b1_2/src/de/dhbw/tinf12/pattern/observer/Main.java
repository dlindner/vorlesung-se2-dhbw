package de.dhbw.tinf12.pattern.observer;

public class Main {

	public static void main(String[] args) {
		Uran uran = new Uran();
		HappyDecayListener happy = new HappyDecayListener();
		CynicalDecayListener cynical = new CynicalDecayListener();

		uran.addDecayListener(happy);
		uran.addDecayListener(cynical);
		uran.addDecayListener(cynical);

		uran.startDecaying();
	}
}
