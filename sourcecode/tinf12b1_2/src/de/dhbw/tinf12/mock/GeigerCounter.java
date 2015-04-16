package de.dhbw.tinf12.mock;

public class GeigerCounter {

	private int counts;

	public GeigerCounter() {
		super();
		this.counts = 0;
	}

	public void observe(RadioactiveElement stuff) {
		stuff.addDecayListener(new DecayListener() {
			@Override
			public void isDecayed() {
				System.out.println("Impuls!");
				counts++;
			}
		});
	}

	public int getCounts() {
		return counts;
	}
}
