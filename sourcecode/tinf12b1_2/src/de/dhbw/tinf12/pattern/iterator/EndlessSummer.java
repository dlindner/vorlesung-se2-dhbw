package de.dhbw.tinf12.pattern.iterator;

import java.util.Iterator;

public class EndlessSummer implements Iterator<String> {

	@Override
	public boolean hasNext() {
		return (Math.random() > 0.001D);
	}

	@Override
	public String next() {
		return "Summer";
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
