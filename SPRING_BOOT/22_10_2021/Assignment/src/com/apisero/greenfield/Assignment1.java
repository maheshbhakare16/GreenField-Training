package com.apisero.greenfield;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("String: ");
		String s1 = new String("Good Bye");
		String s2 = new String("Good Bye");
		System.out.println("Length of s1: " + s1.length());
		System.out.println("Char at 3rd index in s1 : " + s1.charAt(3));
		System.out.println("Substring od s1: " + s1.substring(5, 7));
		System.out.println("Should s1 contains Bye: " + s1.contains("Bye"));
		System.out.println("Is s1 equals to s2: " + s1.equals(s2));
		System.out.println("Replace y by i in s1: " + s1.replace('y', 'i'));
		System.out.println("Concat s1 and s2: " + s1.concat(s2));
		System.out.println("Upper case of s1: " + s1.toUpperCase());
		System.out.println("Lower case of s1: " + s1.toLowerCase());
		System.out.println("index of d in s1: " + s1.indexOf('d'));
		System.out.println("Original string s1: " + s1);
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("String Buffer: ");
		StringBuffer s3 = new StringBuffer(s1);
		s3.append(" Hii");
		System.out.println("s3 after appending hii: " + s3);
		s3.insert(8, " Guys ");
		System.out.println("after inserting Guys in s3: " + s3);
		System.out.println("Capacity of s3: " + s3.capacity());
		s3.delete(8, 13);
		System.out.println("After deleting between index 8 to 13: " + s3);

		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		System.out.println("String Builder: ");

		StringBuilder s4 = new StringBuilder(s1);
		System.out.println("String created with String Builder: " + s4);

	}

}
