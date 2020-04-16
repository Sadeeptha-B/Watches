package edu.monash.FIT2099.watches;
import edu.monash.FIT2099.counters.MaxCounter;

public class Watch2 extends Watch {

	private MaxCounter minutes;
	private MaxCounter hours;

	public Watch2() {
		hours = new MaxCounter(Watch.MAX_HOURS);
		this.addCounter(hours);
		minutes = new MaxCounter(Watch.MAX_MINUTES);
		this.addCounter(minutes);
	}

	public void tick() {
		minutes.increment();
		if (minutes.getValue() == 0) {
			hours.increment();
		}
	}
}
