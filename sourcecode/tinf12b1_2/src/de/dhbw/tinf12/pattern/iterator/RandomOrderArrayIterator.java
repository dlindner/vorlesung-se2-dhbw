package de.dhbw.tinf12.pattern.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomOrderArrayIterator<E> implements Iterator<E> {

	private final List<E> aggregat;

	public RandomOrderArrayIterator(E[] aggregat) {
		super();
		final List<E> remaining = new LinkedList<E>();
		Collections.addAll(remaining, aggregat);
		this.aggregat = remaining;
	}

	@Override
	public boolean hasNext() {
		return (!this.aggregat.isEmpty());
	}

	@Override
	public E next() {
		if (hasNext()) {
			final int index = new Random().nextInt(this.aggregat.size());
			return this.aggregat.remove(index);
		}
		throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("fu** you");
	}
}
