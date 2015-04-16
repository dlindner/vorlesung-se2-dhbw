package de.dhbw.tinf12.pattern.eventbus;

public class Main {

	public static void main(String[] args) {
		EventBus bus = new EventBus();
		NewsReceiver drama = new DramaReceiver();
		NewsReceiver skeptical = new SkepticalReceiver();

		bus.subscribe("dhbw-student", drama);
		bus.subscribe("dhbw-management", skeptical);
		bus.subscribe("politics", skeptical);

		bus.post(new TextNews("First"), "dhbw-*");
		bus.post(new TextNews("Second"), "politics");
	}

}
