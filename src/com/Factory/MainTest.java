package com.Factory;

import java.util.Scanner;

public class MainTest {
	
  public static void main(String[] args) {
	  
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter screen..");
	  String booking = scan.next();
	  
	 Booking book= BookingFactory.createBooking(booking);
	
	 System.out.println(book.getScreen());
	 scan.close();
}

}
