package de.dhbw.memorymodel;

import de.dhbw.memorymodel.scenario1.Scenario1;
import de.dhbw.memorymodel.scenario1.Scenario2;
import de.dhbw.memorymodel.scenario1.Scenario3;
import de.dhbw.memorymodel.scenario1.Scenario4;
import de.dhbw.memorymodel.scenario1.Scenario5;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Scenario.runFor((int) 1E4, Scenario1::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario2::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario3::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario4::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario5::new));
	}
}
