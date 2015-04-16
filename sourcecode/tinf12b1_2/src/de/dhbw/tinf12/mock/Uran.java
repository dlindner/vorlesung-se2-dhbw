package de.dhbw.tinf12.mock;

public class Uran implements RadioactiveElement {

    private DecayListener listener;

	public Uran() {
        super();
        this.listener = new DecayListener() {
			@Override
			public void isDecayed() {
				// does nothing
			}
		};
	}

    @Override
	public void startDecaying() {
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (Math.random() < 1E-44) {
                        decay();
                    }
                }
            }
        }.start();
    }

	private void decay() {
		this.listener.isDecayed();
	}

    @Override
	public void addDecayListener(DecayListener l) {
		this.listener = l;
    }
}
