package com.taxi.app;

import java.math.BigDecimal;

public class Taxi {

	int taxiId;
	int taxiNum;
	BigDecimal taxiEarnings;
	char taxiStatus;
	Location taxiLocation;
	int timeforCompletionOfTrip;
	
	public Taxi(int taxiId,int taxiNum,char taxiStatus,Location taxiLocation) {
	     this.taxiId=taxiId;
	     this.taxiNum=taxiNum;
	     this.taxiStatus=taxiStatus;
	     this.taxiLocation=taxiLocation;
	}

	public int getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}

	public int getTaxiNum() {
		return taxiNum;
	}

	public void setTaxiNum(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public BigDecimal getTaxiEarnings() {
		return taxiEarnings;
	}

	public void setTaxiEarnings(BigDecimal taxiEarnings) {
		this.taxiEarnings = taxiEarnings;
	}

	public char getTaxiStatus() {
		return taxiStatus;
	}

	public void setTaxiStatus(char taxiStatus) {
		this.taxiStatus = taxiStatus;
	}

	public Location getTaxiLocation() {
		return taxiLocation;
	}

	public void setTaxiLocation(Location taxiLocation) {
		this.taxiLocation = taxiLocation;
	}

	public int getTimeforCompletionOfTrip() {
		return timeforCompletionOfTrip;
	}

	public void setTimeforCompletionOfTrip(int timeforCompletionOfTrip) {
		this.timeforCompletionOfTrip = timeforCompletionOfTrip;
	}
	
    
	
}
