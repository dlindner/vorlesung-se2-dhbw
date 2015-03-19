package de.dhbw.tinf12b3.pattern.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RandomIterator<TYP> implements Iterator<TYP> {

	private final List<TYP> daten;
	private int position;

	public RandomIterator(List<TYP> daten) {
		super();
		final List<TYP> kopie = new ArrayList<>(daten);
		Collections.shuffle(kopie);
		this.daten = kopie;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		return (this.position < this.daten.size());
	}

	@Override
	public TYP next() {
		final TYP result = this.daten.get(this.position);
		this.position++;
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("fuck off");
	}
}
