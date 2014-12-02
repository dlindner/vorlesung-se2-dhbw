package de.dhbw.tinf12.pattern.eventbus;

public class TextNews implements News {

	private final String message;

	public TextNews(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}
}
