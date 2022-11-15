package com.Factory;

public class BookingFactory {
	
	public static Booking createBooking(String input) {
	
	if(input.equalsIgnoreCase("first")) {
		return new FirstScreen();
		
	}else if(input.equalsIgnoreCase("second")) {
		return new SecondScreen();
		
	}else if(input.equalsIgnoreCase("third")) {
		return new ThirdScreen();
		
	}
	throw new IllegalArgumentException("invalid input..");
			
			
			
			
	}
}
