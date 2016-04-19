package de.dhbw.memorymodel.scenario1;

import java.util.Arrays;
import java.util.List;

import de.dhbw.memorymodel.Scenario;

public class Scenario1 extends Scenario {
	
	private final Object lock;
	private int x;
	private int y;
	
	public Scenario1() {
		super();
		this.lock = new Object();
		this.x = 0;
		this.y = 0;
	}
	
	public List<Thread> prepare() {
		Thread thread1 = new Thread(() -> {
			synchronized (lock) {
				x = 1;
				if (0 == y) {
					r = 1;
				}
			}
		});
		Thread thread2 = new Thread(() -> {
			synchronized (lock) {
				y = 1;
				if (0 == x) {
					s = 1;
				}
			}
		});
		return Arrays.asList(thread1, thread2);
	}
}
