package de.dhbw.tinf12.mock;

public class Main {

	public static void main(String[] args) {
		RadioactiveElement uran = new Uran();
		GeigerCounter counter = new GeigerCounter();
		counter.observe(uran);
		uran.startDecaying();
		while (true) {
			System.out.println(counter.getCounts());
		}
	}
}
