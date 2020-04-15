package edu.monash.FIT2099.watches;
import java.util.ArrayList;
import edu.monash.FIT2099.counters.*;

public abstract class Watch {
	
    public static final int MAX_HOURS = 24;
	public static final int MAX_SECONDS = 60;
	public static final int MAX_MINUTES = 60;
	public static final int MAX_MILLISECONDS = 1000;
	
	private ArrayList<Counter> counters;
	
    protected Watch() {
    	counters = new ArrayList<Counter>();
    }
    
	public void display() {
		String prefix = "";
		for (Counter thisCounter: counters) {
			System.out.print(prefix);
			System.out.print(String.format("%02d", thisCounter.getValue()));
			prefix = ":";
		}
		System.out.println();
	}
	
	protected void addCounter(Counter newCounter) {
		counters.add(newCounter);
	}
	
	public abstract void tick();
	
	public void testWatch(int numTicks) {
		for (int i = 0; i < numTicks; i++) {
			display();
			
			//Method call does not specify message receiver
		    //Hence, method call is attached to the instance
			tick();
		}	
	}
}





