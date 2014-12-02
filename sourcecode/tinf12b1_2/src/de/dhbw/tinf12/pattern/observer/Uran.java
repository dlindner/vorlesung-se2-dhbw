package de.dhbw.tinf12.pattern.observer;

public class Uran extends RadioactiveElement {

	public Uran() {
        super();
	}

	public void startDecaying() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (Math.random() < 1E-6) {
                        decay();
                    }
                }
            }
        }.start();
    }

	private void decay() {
		notifyListeners();
	}
}
