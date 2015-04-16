package de.dhbw.tinf12.pattern.observer;

public class HappyDecayListener implements DecayListener {

	@Override
	public void notifyOfDecay() {
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Yay! energy!");
		//throw new HappyException();
	}
}
