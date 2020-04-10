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
		minutes = new Counter();
	}
	
	//Definition line: Signature
	public void tick() {
		minutes.increment();
		if (minutes.getValue() == 60) {
			minutes.reset();
			hours.increment();
			if (hours.getValue() == 24) {
				hours.reset();
			}
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
