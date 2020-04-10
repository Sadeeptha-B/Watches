package edu.monash.FIT2099.watches;
import java.util.ArrayList;
import edu.monash.FIT2099.counters.*;

public abstract class Watch {
	
    private ArrayList<Counter> counters;
	
    protected Watch() {
    	counters = new ArrayList<Counter>();
    }
    
	public void display() {
		for (Counter thisCounter: counters) {
			System.out.println(String.format("%02d", thisCounter.getValue()));
		}
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





