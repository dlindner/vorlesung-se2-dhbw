package de.dhbw.tinf12.pattern.eventbus;

public class SkepticalReceiver implements NewsReceiver {

	public SkepticalReceiver() {
		super();
	}

	@Override
	public void receive(News news) {
		System.out.println("I can't believe the news today: " +  news);
	}
}
