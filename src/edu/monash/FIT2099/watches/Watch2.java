package edu.monash.FIT2099.watches;
import edu.monash.FIT2099.counters.MaxCounter;

public class Watch2 extends Watch {

	private MaxCounter minutes;
	private MaxCounter hours;

	public Watch2() {
		minutes = new MaxCounter(60);
		hours = new MaxCounter(24);
	}

	public void tick() {
		minutes.increment();
		if (minutes.getValue() == 0) {
			hours.increment();
		}
	}

//	public void display() {
//		System.out.println(
//				String.format("%02d", hours.getValue())
//				+ ":"
//				+ String.format("%02d", minutes.getValue())
//		);
//	}
	
}
