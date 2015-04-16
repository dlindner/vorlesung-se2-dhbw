package de.dhbw.tinf12.pattern.singleton;

public enum GetToKnow {

	FIRST(132) {
		@Override
		public String whatever() {
			return "I am first";
		}
	},
	SECOND(42) {
		@Override
		public String whatever() {
			return "I am late";
		}
	},
	THIRD(17) {
		@Override
		public String whatever() {
			return "I am Groot";
		}
	};

	private int value;

	private GetToKnow(int parameter) {
		this.value = parameter;
	}

	public int functionality() {
		return this.value;
	}

	public abstract String whatever();
}
