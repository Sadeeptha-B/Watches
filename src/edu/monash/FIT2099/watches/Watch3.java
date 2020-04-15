package edu.monash.FIT2099.watches;

import edu.monash.FIT2099.counters.*;


public class Watch3 extends Watch {

	private Counter seconds;

	public Watch3() {
		Counter hours = new MaxCounter(MAX_HOURS);
		this.addCounter(hours);
		Counter minutes = new LinkedCounter(MAX_MINUTES, hours);
		this.addCounter(minutes);
		seconds = new LinkedCounter(MAX_SECONDS, minutes);
		this.addCounter(seconds);
	}

	public void tick() {
		seconds.increment();
	}
}
