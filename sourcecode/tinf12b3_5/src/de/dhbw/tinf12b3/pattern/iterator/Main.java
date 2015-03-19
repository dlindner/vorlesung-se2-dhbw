package de.dhbw.tinf12b3.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		final List<Object> things = new ArrayList<>();
		things.add("einen String");
		things.add(100);
		things.add(new Object());
		things.add('c');

		for (Object each : things) {
			System.out.println(each);
		}
	}
}
