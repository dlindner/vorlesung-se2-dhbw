package de.dhbw.memorymodel.scenario1;

import java.util.Arrays;
import java.util.List;

import de.dhbw.memorymodel.Scenario;

public class Scenario4 extends Scenario {
	
	private int x;
	private int y;
	
	public Scenario4() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public List<Thread> prepare() {
		Thread thread1 = new Thread(() -> {
			if (0 != y) {
				x = 1;
			}
			if (x == y) {
				r = 1;
			}
		});
		Thread thread2 = new Thread(() -> {
			if (0 != x) {
				y = 1;
			}
			if (x != y) {
				s = 1;
			}
		});
		return Arrays.asList(thread1, thread2);
	}
}
