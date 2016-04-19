package de.dhbw.memorymodel;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public abstract class Scenario {
	
	protected int r;
	protected int s;
	
	public Scenario() {
		super();
		this.r = 0;
		this.s = 0;
	}
	
	public abstract List<Thread> prepare(); 
	
	private final RunResult run(Iterable<Thread> threads) {
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
	
	public static OverallResult runFor(int iterations, Supplier<? extends Scenario> scenario) {
		OverallResult result = new OverallResult();
		for (int i = 0; i < iterations; i++) {
			Scenario run = scenario.get();
			List<Thread> threads = run.prepare();
			Collections.shuffle(threads);
			RunResult localResult = run.run(threads);
			result.consider(localResult);
			if (0 == i % (iterations / 10)) {
				System.out.print(".");
			}
		}
		return result;
	}
}
