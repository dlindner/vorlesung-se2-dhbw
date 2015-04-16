package de.dhbw.tinf12.pattern.eventbus;

public class DramaReceiver implements NewsReceiver {

	public DramaReceiver() {
		super();
	}

	@Override
	public void receive(News news) {
		System.err.println("OH MY GOD! I just heard of " + news);
	}
}
