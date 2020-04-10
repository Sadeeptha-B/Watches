package edu.monash.FIT2099.watches;
import edu.monash.FIT2099.counters.LinkedCounter;
import edu.monash.FIT2099.counters.MaxCounter;

public class Watch3 extends Watch {

	private MaxCounter hours;
	private LinkedCounter minutes;
	private LinkedCounter seconds;		//Ease in scaling
	
	public Watch3() {
		hours = new MaxCounter(24);
		minutes = new LinkedCounter(60, hours);
		seconds = new LinkedCounter(60, minutes);   //Ease in scaling  
	}

	public void tick() {
		seconds.increment();
	}
	
//	public void display() {
//		System.out.println(
//				String.format("%02d", hours.getValue())
//				+ ":"
//				+ String.format("%02d", minutes.getValue())
//				+ ":"
//				+ String.format("%02d", seconds.getValue())
//		);
//	}
	

}
