package de.dhbw.tinf12.pattern.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class RadioactiveElement {

	private List<DecayListener> listeners;

	public RadioactiveElement() {
		super();
		this.listeners = new LinkedList<>();
	}

	protected void notifyListeners() {
		for (final DecayListener each : new LinkedList<>(listeners)) {
			notify(each);
		}
	}

	protected void notify(final DecayListener listener) {
		//createNotifierFor(listener).run();
		createNotifierFor(listener).start();
	}

	protected Thread createNotifierFor(final DecayListener listener) {
		return new Thread() {
			public void run() {
				try {
					listener.notifyOfDecay();
				} catch (Exception e) {
					e.printStackTrace();
					RadioactiveElement.this.listeners.remove(listener);
				}
			}
		};
	}

	public void addDecayListener(DecayListener l) {
		this.listeners.add(l);
	}

	public void removeDecayListener(DecayListener l) {
		this.listeners.remove(l);
	}
}