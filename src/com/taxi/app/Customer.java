package com.taxi.app;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	int custId;
	String custName;
	Location sourceLocation;
	Location destinationLocation;
	int currentTime;
	
	public Customer(int custId,Location sourceLocation,Location destinationLocation,int currentTime) {
		this.custId=custId;
		this.sourceLocation=sourceLocation;
		this.destinationLocation=destinationLocation;
		this.currentTime=currentTime;
		}

	

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Location getSourceLocation() {
		return sourceLocation;
	}

	public void setSourceLocation(Location sourceLocation) {
		this.sourceLocation = sourceLocation;
	}

	public Location getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}


	
}
