package com.apisero.greenfield;

public class SalesMan extends Employee
{
	public double incentive;

	public SalesMan(String id, String name, String address, double salary, double incentive) {
		super(id, name, address, salary);
		this.incentive=incentive;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	 public double calculateSalary()
	 {
		 return this.getSalary()+incentive;
	 }
	
}
