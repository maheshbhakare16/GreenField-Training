package com.apisero.greenfield;

public class Calculator {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		System.out.println(Calculator.add(12, 13));
		System.out.println(Calculator.add(12, 13, 14));
	}
}
