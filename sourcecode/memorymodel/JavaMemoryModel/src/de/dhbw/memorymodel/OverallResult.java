package de.dhbw.memorymodel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OverallResult {
	
	private final Set<RunResult> happened;
	private final Map<RunResult, Integer> count; 
	
	public OverallResult() {
		super();
		this.happened = new HashSet<>();
		this.count = new HashMap<>();
	}
	
	public void consider(RunResult result) {
		this.happened.add(result);
		this.count.put(result, this.count.getOrDefault(result, Integer.valueOf(0)) + 1);
	}
	
	@Override
	public String toString() {
		return this.happened + " --> " + this.count; 
	}
}
