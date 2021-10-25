package com.apisero.greenfield;

import java.util.ArrayList;
import java.util.List;

public class MobileMain {
	public static void main(String[] args) {
		List<Mobile> l = new ArrayList<Mobile>();
		l.add(new Mobile("Samsung", "Note10", "12-10-2018", 6, 128, "Snapdragon 855+"));
		l.add(new Mobile("Xiaomi", "POCO F1", "22-09-2017", 6, 128, "Snapdragon 845"));
		l.add(new Mobile("One+", "Nord", "07-08-2020", 8, 256, "Snapdragon 760"));
		System.out.println(l);
	}
}
