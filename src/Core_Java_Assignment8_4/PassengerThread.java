package Core_Java_Assignment8_4; //Package declaration is mandatory
													
public class PassengerThread extends Thread{		// PassengerThread Class Declared					
	private int seatsNeeded;											
	public PassengerThread(int seats, Runnable target, String name) {	
		super(target,name);												
		this.seatsNeeded = seats;}										
	public int getSeatsNeeded() {			// get input as required number of seat							
		return seatsNeeded;}
}																		