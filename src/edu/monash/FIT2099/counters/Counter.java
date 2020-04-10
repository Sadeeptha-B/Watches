package edu.monash.FIT2099.counters;
public class Counter {

	private int value = 0;
	
	//Command methods..
	public void reset() {
		value = 0;
	}
	
	public void decrement() {
		value--;
	}
	
	public void increment() {
		value++;
	}
	
	// Query method
	public int getValue() {
		return value;
	}
}
