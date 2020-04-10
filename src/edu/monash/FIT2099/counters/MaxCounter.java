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
	
	
}
