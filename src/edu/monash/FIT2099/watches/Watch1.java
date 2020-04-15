package edu.monash.FIT2099.watches;
import edu.monash.FIT2099.counters.Counter;

public class Watch1 extends Watch {
	
  //Declaration is not enough.
  //Constructor creates...
	Counter minutes;
	Counter hours;
	
   //Constructor
   //No return value, same name as class
	public Watch1() {
		hours = new Counter();
		this.addCounter(hours);
		minutes = new Counter();
		this.addCounter(minutes);
	}
	
	//Definition line: Signature
	public void tick() {
		minutes.increment();
		if (minutes.getValue() == Watch.MAX_MINUTES) {
			minutes.reset();
			hours.increment();
			if (hours.getValue() == Watch.MAX_HOURS) {
				hours.reset();
			}
		}
	}
}
