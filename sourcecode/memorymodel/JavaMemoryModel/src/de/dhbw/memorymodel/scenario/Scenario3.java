package de.dhbw.memorymodel.scenario;

import java.util.Arrays;
import java.util.List;

import de.dhbw.memorymodel.Scenario;

public class Scenario3 extends Scenario {
	
	private volatile int x;
	private volatile int y;
	
	public Scenario3() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public List<Thread> prepare() {
		Thread thread1 = new Thread(() -> {
			x = 1;
			if (0 == y) {
				r = 1;
			}
		});
		Thread thread2 = new Thread(() -> {
			y = 1;
			if (0 == x) {
				s = 1;
			}
		});
		return Arrays.asList(thread1, thread2);
	}
}
