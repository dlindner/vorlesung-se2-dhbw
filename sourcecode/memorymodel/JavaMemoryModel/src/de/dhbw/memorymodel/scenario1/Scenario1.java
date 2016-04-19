package de.dhbw.memorymodel.scenario1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import de.dhbw.memorymodel.OverallResult;
import de.dhbw.memorymodel.RunResult;

public class Scenario1 {
	
	private final Object lock;
	private int x;
	private int y;
	private int r;
	private int s;
	
	public Scenario1() {
		super();
		this.lock = new Object();
		this.x = 0;
		this.y = 0;
		this.r = 0;
		this.s = 0;
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
	
	public RunResult run(Iterable<Thread> threads) {
		for (Thread each : threads) {
			each.start();
		}
		for (Thread each : threads) {
			try {
				each.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return new RunResult(this.r, this.s);
	}
	
	public static void main(String[] args) {
		OverallResult result = new OverallResult();
		for (int i = 0; i < (int) 1E4; i++) {
			Scenario1 run = new Scenario1();
			List<Thread> threads = run.prepare();
			Collections.shuffle(threads);
			RunResult localResult = run.run(threads);
			result.consider(localResult);
			if (0 == i % 1000) {
				System.out.print(".");
			}
		}
		System.out.println(result);
	}
}
