package com.taxi.app;


import java.math.BigDecimal;
import java.util.List;



public class Booking {
	
	int min=Integer.MAX_VALUE;
	int taxiAllocated;
	List<Taxi> taxiList=getTaxiList();
	Customer customer=getCustomer();
	int taxiIndex = 0;
	public List<Taxi> getTaxiList() {
		return taxiList;
	}
	public void setTaxiList(List<Taxi> taxiList) {
		this.taxiList = taxiList;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	//Checking available Taxi at given time
	private int checkAvailabilty() {
		int n=taxiList.size();
		for(int i=0;i<n;i++) {
			if(taxiList.get(i).getTaxiStatus()=='F') {
				taxiAllocated=checkMinDistance(i);
			}
			
		}
		return taxiAllocated;
	}
	
	//Allocation of taxi
	public void allocateTaxi() {
		taxiAllocated=checkAvailabilty();
		Taxi allocatedTaxi=taxiList.get(taxiAllocated);
		
		Location custLoc=customer.getSourceLocation();
		int custLocation=getLocationInInt(custLoc);
		Location custDestLoc=customer.getDestinationLocation();
		int custDestLocation=getLocationInInt(custDestLoc);
		
		int distanceOfJourney=Math.abs(custDestLocation-custLocation);

	     int timeForCompletion =customer.getCurrentTime()+(distanceOfJourney/100);
	     if(customer.getCurrentTime()<timeForCompletion) {
	    	 taxiList.get(taxiAllocated).setTaxiStatus('N');
	    	 allocatedTaxi.setTaxiStatus('N');
	    	 System.out.println("Taxi"+ allocatedTaxi.getTaxiId()+" "+"is allocated");
	    	 allocatedTaxi.setTaxiEarnings(new BigDecimal(5).multiply(new BigDecimal(distanceOfJourney)));
	    	 taxiList.get(taxiAllocated).setTaxiEarnings(new BigDecimal(5).multiply(new BigDecimal(distanceOfJourney)));
	    	 System.out.println("Amount Earned"+allocatedTaxi.getTaxiEarnings());
	     }
	     else {
	    	 allocatedTaxi.setTaxiStatus('F');
	    	 taxiList.get(taxiAllocated).setTaxiStatus('N');
	     }
		
	}
	
	//Getting the location in integer.
	private int getLocationInInt(Location location) {
		Location loc=location;
		int res=0;
		switch(loc) {
		case MDU:
			res= 100;
			break;
		case DGL:
			res=200;
			break;
		case TRCHY:
			res= 300;
			break;
		case CHN:
			res= 400;
			break;
		default:
			break;
		}
		return res;
		
	}
	
	//Finding the nearby taxi
	private int checkMinDistance(int index) {
		
		Location taxiloc=taxiList.get(index).getTaxiLocation();
		int taxilocation=getLocationInInt(taxiloc);
		Location custLoc=customer.getSourceLocation();
		int custLocation=getLocationInInt(custLoc);
		
		
		int diffInLoc=Math.abs(taxilocation-custLocation);
		if(diffInLoc<min) {
			min=diffInLoc;
			 taxiIndex=index;
		}
		return taxiIndex;		
	}
}
