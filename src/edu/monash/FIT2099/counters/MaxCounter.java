package edu.monash.FIT2099.counters;

public class MaxCounter extends Counter {
	private int max;
	
	public MaxCounter(int maxValue) {
		max = maxValue;
	}

	public void increment() {
		//Increment the counter
		super.increment();
		if (this.getValue() == max) {
			this.reset();
		}
	}
	
	public int getMax() {
		return max;
	}
	
	@Override
	public String toString() {
		double fieldWidth = Math.ceil(Math.log10(this.getMax()));
		String fieldFormat = "%0" + String.format("%.0f", fieldWidth) + "d";
		return String.format(fieldFormat, this.getValue());
	}
	
}
