package Core_Java_Assignment8_4;         //Package declaration is mandatory


																		
public class RedbusService {																	// RedbusService Class Declared
	public static void main(String[] args){										    			
		BusReservation busReservation = new BusReservation();									// new object initialized 
		PassengerThread passengerThread1 = new PassengerThread(6,busReservation,"Amit");		// passengerThread1 object initialized and parameters are passed
		PassengerThread passengerThread2 = new PassengerThread(4, busReservation, "Naveen");	// passengerThread2 object initialized and parameters are passed
		PassengerThread passengerThread3 = new PassengerThread(5, busReservation, "Prabin");	// passengerThread2 object initialized and parameters are passed
		passengerThread1.start();																// Call start() method to start executing the thread object. 
		passengerThread2.start();																// Call start() method to start executing the thread object.
		passengerThread3.start();																// Call start() method to start executing the thread object.
	}																							// main method closed
}																								// class RedbusService closed
