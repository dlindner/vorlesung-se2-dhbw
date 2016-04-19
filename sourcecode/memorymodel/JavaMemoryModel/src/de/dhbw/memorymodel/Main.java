package de.dhbw.memorymodel;

import de.dhbw.memorymodel.scenario1.Scenario1;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Scenario.runFor((int) 1E4, Scenario1::new));
	}

}
