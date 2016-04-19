package de.dhbw.memorymodel;

import java.util.HashSet;
import java.util.Set;

public class OverallResult {
	
	private final Set<RunResult> happened;
	
	public OverallResult() {
		super();
		this.happened = new HashSet<>();
	}
	
	public void consider(RunResult result) {
		this.happened.add(result);
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.happened);
	}
}
