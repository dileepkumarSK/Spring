package com.fact.beans;

public class HighBudjet implements Car {

	private Tyre tyre;
	
	public void setTyre(Tyre tyre) {
		
		this.tyre = tyre;
	}


	public HighBudjet(Tyre tyre) {
		
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println(" it is a HIGH - budjet car ");
		System.out.println(tyre.grip());

	}

}
