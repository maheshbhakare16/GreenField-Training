package com.apisero.greenfield;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "C");
		hm.put(2, "C++");
		hm.put(3, "JAVA");
		for(Map.Entry<Integer, String> e : hm.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}

	}

}
