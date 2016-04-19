package de.dhbw.memorymodel;

public class RunResult {
	
	private int r;
	private int s;

	public RunResult(int r, int s) {
		super();
		this.r = r;
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "r:" + this.r + " s:" + this.s;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		result = prime * result + s;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RunResult other = (RunResult) obj;
		if (r != other.r)
			return false;
		if (s != other.s)
			return false;
		return true;
	}
}
