package com.apisero.greenfield;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(1, "XYZ", 87.45));
		al.add(new Student(2, "ABC", 85.46));
		al.add(new Student(3, "PQR", 86.47));
		System.out.println();
		System.out.println(al);
		System.out.println();
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
