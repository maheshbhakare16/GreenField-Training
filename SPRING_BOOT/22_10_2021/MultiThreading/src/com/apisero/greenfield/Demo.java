package com.apisero.greenfield;

public class Demo extends Thread {

		public void run()
		{
			System.out.println("Runnung");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.start();
		d.setName("T1");
		System.out.println(d.getName());
	}

}
