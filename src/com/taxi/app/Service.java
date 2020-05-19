package com.taxi.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	public static void main(String[] ab) {
		Taxi taxi=new Taxi(1,1234,'F',Location.MDU);
		Taxi taxi1=new Taxi(2,2345,'F',Location.MDU);
		Taxi taxi2=new Taxi(3,346,'F',Location.MDU);
		Taxi taxi3=new Taxi(4,4567,'F',Location.MDU);
		Taxi taxi4=new Taxi(5,5678,'F',Location.MDU);
		
		
		List<Taxi> taxiList = new ArrayList<>();
		taxiList.add(taxi);
		taxiList.add(taxi1);
		taxiList.add(taxi2);
		taxiList.add(taxi3);
		taxiList.add(taxi4);
		
		Scanner s=new Scanner(System.in);
		int t=5;		
	    while(t-->0) {
	    	int custId=s.nextInt();
	    	String custName=s.next();
	    	String src=s.next();
	    	String dest=s.next();
	    	int time=s.nextInt();
	    	Customer customer=new Customer(custId, Location.valueOf(src), Location.valueOf(dest), time);
	    	customer.setCustName(custName);
	    	Booking booking=new Booking();
	    	booking.setTaxiList(taxiList);
	    	booking.setCustomer(customer);
	    	booking.allocateTaxi();
	    }
	    s.close();
	}
	
}
