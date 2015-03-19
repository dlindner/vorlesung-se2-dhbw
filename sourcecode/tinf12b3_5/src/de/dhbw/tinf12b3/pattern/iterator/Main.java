package de.dhbw.tinf12b3.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final List<Object> things = new ArrayList<>();
		things.add("einen String");
		things.add(100);
		things.add(new Object());
		things.add('c');

//		final Iterator<Object> iterator = new EndlessIterator();
//		//final Iterator<Object> iterator = new RandomIterator<>(things);
//		while (iterator.hasNext()) {
//			Object each = iterator.next();
//			System.out.println(each);
//		}
		for (Object each : new EndlessIterator()) {
			System.out.println(each);
		}
	}
}
