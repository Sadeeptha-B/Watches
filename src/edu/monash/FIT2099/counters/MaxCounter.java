package edu.monash.FIT2099.counters;

public class MaxCounter extends Counter {
	private int max;
	private final double fieldWidth;
	private final String fieldFormat;
	
	public MaxCounter(int maxValue) {
		max = maxValue;
		fieldWidth = Math.ceil(Math.log10(max));
		fieldFormat = "%0" + String.format("%.0f", fieldWidth) + "d";
	}

	public void increment() {
		//Increment the counter
		super.increment();
		if (this.getValue() == max) {
			this.reset();
		}
	}
	

	
	@Override
	public String toString() {
		return String.format(fieldFormat, this.getValue());
	}
	
}
