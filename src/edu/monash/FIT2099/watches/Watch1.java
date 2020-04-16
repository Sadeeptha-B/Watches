package edu.monash.FIT2099.watches;

public class Watch1 extends Watch {
	
	private Watch2 myWatch2;
	
	public Watch1() {
		myWatch2 = new Watch2();
	}
	
	public void tick() {
		myWatch2.tick();
	}
	
	@Override
	public void display() {
		myWatch2.display();
	}
	
}
