package de.dhbw.memorymodel;

import de.dhbw.memorymodel.scenario.Scenario1;
import de.dhbw.memorymodel.scenario.Scenario2;
import de.dhbw.memorymodel.scenario.Scenario3;
import de.dhbw.memorymodel.scenario.Scenario4;
import de.dhbw.memorymodel.scenario.Scenario5;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Scenario.runFor((int) 1E4, Scenario1::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario2::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario3::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario4::new));
		System.out.println(Scenario.runFor((int) 1E5, Scenario5::new));
	}
}
