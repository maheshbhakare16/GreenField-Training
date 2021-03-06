package com.apisero.greenfield;

public class BankAccount {
	private static String bank_name;
	private String account_no;
	private String account_holder_name;
	private String ifsc_code;
	private String bank_branch;
	private float balance;
	public BankAccount(String account_no, String account_holder_name, String ifsc_code, String bank_branch,
			float balance) {
		super();
		this.account_no = account_no;
		this.account_holder_name = account_holder_name;
		this.ifsc_code = ifsc_code;
		this.bank_branch = bank_branch;
		this.balance = balance;
	}
	public static String getBank_name() {
		return bank_name;
	}
	public static void setBank_name(String bank_name) {
		BankAccount.bank_name = bank_name;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void withdraw(float amount)
	{
		if((this.balance-amount)<0)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			this.balance-=amount;
		}
	}
	public void diposit(float amount)
	{
		this.balance+=amount;
	}
	@Override
	public String toString() {
		return "BankAccount [getAccount_no()=" + getAccount_no() + ", getAccount_holder_name()="
				+ getAccount_holder_name() + ", getIfsc_code()=" + getIfsc_code() + ", getBank_branch()="
				+ getBank_branch() + ", getBalance()=" + getBalance() + "]";
	}
	
}
