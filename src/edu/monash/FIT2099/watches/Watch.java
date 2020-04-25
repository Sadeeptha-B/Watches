package edu.monash.FIT2099.watches;
import java.util.ArrayList;
import edu.monash.FIT2099.counters.*;

public abstract class Watch {
	
    public static final int MAX_HOURS = 24;
	public static final int MAX_SECONDS = 60;
	public static final int MAX_MINUTES = 60;
	public static final int MAX_MILLISECONDS = 1000;
	
	private ArrayList<MaxCounter> counters;
	
    protected Watch() {
    	counters = new ArrayList<MaxCounter>();
    }
    
	public void display() {
		String prefix = "";
		for (MaxCounter thisCounter: counters) {
//			double fieldWidth = Math.ceil(Math.log10(thisCounter.getMax()));
//			String fieldFormat = "%0" + String.format("%.0f", fieldWidth) + "d";
//			System.out.print(prefix);
//			System.out.print(String.format(fieldFormat, thisCounter.getValue()));
			System.out.print(prefix + thisCounter);
			prefix = ":";
		}
		System.out.println();
	}
	
	protected void addCounter(MaxCounter newCounter) {
		counters.add(newCounter);
	}
	
	public abstract void tick();
	
	public void testWatch(int numTicks) {
		for (int i = 0; i < numTicks; i++) {
			display();
			tick();
		}	
	}
}





