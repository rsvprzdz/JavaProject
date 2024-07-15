package com.kh.ch09_interface;

public abstract class Plant implements GrowingPlant {

	protected String name;
	
	private int nutrients = 0;
	
	public int getNutrients() {
		return nutrients;
	}
	
	public void setNutrients(int nutrients) {
		this.nutrients = nutrients;
	}
}
