package Core_Java_Assignment8_4; //Package declaration is mandatory
																													
	public class BusReservation implements Runnable{		// BusReservation Class Declared																							
		private int totalSeatsAvailable=12;				    //private variable declared																								
		public void run() {									//method declared to execute Runnable																							
			PassengerThread pt = (PassengerThread) Thread.currentThread();		//new object pt created 																		
			boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());																
			if(ticketsBooked==true){                                                     //checking condition for booked ticket
				System.out.println(Thread.currentThread().getName()+" : The Number of Seats Requested "+pt.getSeatsNeeded()+" are booked ");
			}else{
				System.out.println(Thread.currentThread().getName()+" : The number of seats requested "+pt.getSeatsNeeded()+" are not available");}
		}																																				
		
	   public  synchronized boolean bookTickets(int seats, String name){																				
		  System.out.println("\n             Welcome to Redbus Service \n"+"===========####################################================");			
				  System.out.println(Thread.currentThread().getName()+" : Number of Tickets Available are : "+this.getTotalSeatsAvailable());			
			if (seats>this.getTotalSeatsAvailable()) {																									
				return false;
			} else {
				totalSeatsAvailable = totalSeatsAvailable-seats;
				return true;}
		}

		private int getTotalSeatsAvailable() {																											
			return totalSeatsAvailable;}
	}																																					



