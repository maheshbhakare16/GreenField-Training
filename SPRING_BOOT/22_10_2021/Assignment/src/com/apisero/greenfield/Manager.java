package com.apisero.greenfield;

public class Manager extends Employee {
	private double bonus;

	public Manager(String id, String name,int age, String address, double salary, double bonus) {
		super(id, name, age, address, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double calculateSalary() {
		return this.getSalary() + bonus;
	}

	@Override
	public String toString() {
		return "Manager ["+super.toString()+"bonus=" + bonus + "]";
	}

}