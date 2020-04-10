package edu.monash.FIT2099.counters;


public class LinkedCounter extends MaxCounter {
	private Counter neighbour;
	
	public LinkedCounter(int maxValue, Counter linkedNeighbour) {
		super(maxValue);
		this.neighbour = linkedNeighbour;
	}

	public void increment() {
		super.increment();
		
		if (this.getValue() == 0) {
			neighbour.increment();
		}
	}
}
