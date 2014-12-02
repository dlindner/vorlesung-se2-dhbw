package de.dhbw.tinf12.pattern.singleton;

public class Main {

	public static void main(String[] args) {
		for (GetToKnow each : GetToKnow.values()) {
			System.out.println(each.whatever());
		}
	}
}
