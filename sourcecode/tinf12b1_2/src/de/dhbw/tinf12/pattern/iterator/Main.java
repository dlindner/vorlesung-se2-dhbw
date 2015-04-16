package de.dhbw.tinf12.pattern.iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		final String[] array = new String[] {
				"Frühjahr",
				"Sommer",
				"Herbst",
				"Winter",
				"Weihnachten",
				"Ostern",
				"Klausurwoche",
				"Fasching",
				"Geburtstag",
				"The day after the party",
		};
		Iterator<String> all = new EndlessSummer();
//		Iterator<String> all = new RandomOrderArrayIterator<>(array);
		while (all.hasNext()) {
			System.out.println(all.next());
		}
	}

}
