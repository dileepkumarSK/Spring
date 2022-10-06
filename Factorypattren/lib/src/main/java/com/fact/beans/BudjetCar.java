package com.fact.beans;

public class BudjetCar implements Car {

	private Tyre tyre;
	
	
	public BudjetCar(Tyre tyre) {
		
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println(" it is a  budjet car ");
		System.out.println(tyre.grip());	
	}

}
