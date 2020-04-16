package edu.monash.FIT2099.watches;

import edu.monash.FIT2099.counters.*;


public class Watch3 extends Watch {

	private MaxCounter milliseconds;

	public Watch3() {
		MaxCounter hours = new MaxCounter(Watch.MAX_HOURS);
		this.addCounter(hours);
		MaxCounter minutes = new LinkedCounter(Watch.MAX_MINUTES, hours);
		this.addCounter(minutes);
		MaxCounter seconds = new LinkedCounter(Watch.MAX_SECONDS, minutes);
		this.addCounter(seconds);
		milliseconds = new LinkedCounter(Watch.MAX_MILLISECONDS, seconds);
		this.addCounter(milliseconds);
	}

	public void tick() {
		milliseconds.increment();
	}
}
