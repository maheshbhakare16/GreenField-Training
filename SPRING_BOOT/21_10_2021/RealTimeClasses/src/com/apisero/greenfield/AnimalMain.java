package com.apisero.greenfield;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
	public static void main(String[] args) {
		List<Animal> s = new ArrayList<Animal>();
		s.add(new Animal("Tiger", "Mammals", "Non_Vegeterian"));
		s.add(new Animal("Lion", "Mammals", "Non_Vegeterian"));
		s.add(new Animal("Cow", "Mammals", "Vegeterian"));
		s.add(new Animal("Crocodile", "Raptiles", "Non_Vegeterian"));
		System.out.println(s);
	}
}
