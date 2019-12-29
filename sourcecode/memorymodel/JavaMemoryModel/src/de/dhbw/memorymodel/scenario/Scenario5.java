package de.dhbw.memorymodel.scenario;

import java.util.Arrays;
import java.util.List;

import de.dhbw.memorymodel.Scenario;

public class Scenario5 extends Scenario {
	
	private volatile int x;
	private volatile int y;
	
	public Scenario5() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public List<Thread> prepare() {
		Thread thread1 = new Thread(() -> {
			x = 1;
		});
		Thread thread2 = new Thread(() -> {
			if (1 == x && 0 == y) {
				r = 1;
			}
		});
		Thread thread3 = new Thread(() -> {
			if (0 == x && 1 == y) {
				s = 1;
			}
		});
		Thread thread4 = new Thread(() -> {
			y = 1;
		});
		return Arrays.asList(thread1, thread2, thread3, thread4);
	}
}
