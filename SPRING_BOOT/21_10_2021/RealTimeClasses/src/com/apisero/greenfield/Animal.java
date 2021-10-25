package com.apisero.greenfield;

public class Animal {
	private String animal_name;
	private String catagory;
	private String eating_habit;
	
		
	public Animal(String animal_name, String catagory, String eating_habit) {
		super();
		this.animal_name = animal_name;
		this.catagory = catagory;
		this.eating_habit = eating_habit;
	}
	
	public String getAnimal_name() {
		return animal_name;
	}
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public String getEating_habit() {
		return eating_habit;
	}
	public void setEating_habit(String eating_habit) {
		this.eating_habit = eating_habit;
	}

	@Override
	public String toString() {
		return "Animal [animal_name=" + animal_name + ", catagory=" + catagory + ", eating_habit=" + eating_habit + "]";
	}
	
}
