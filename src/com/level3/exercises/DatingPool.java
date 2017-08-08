package com.level3.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class DatingPool {

	public static void main(String[] args) {
		HashMap<String, String> eligibleBachelors = new HashMap<String, String>();
		ArrayList<String> eligible = new ArrayList<String>();
		String name;
		eligibleBachelors.put("Max", "Conservative");
		eligibleBachelors.put("Bob", "conservative");
		eligibleBachelors.put("Diego ", "libertarian");
		eligibleBachelors.put("Felix", "Independant");
		eligibleBachelors.put("William", " Republican");
		eligibleBachelors.put("Chuck", " Republican");
		eligibleBachelors.put("Matthew ", "liberal");
		eligibleBachelors.put("Jose ", "Democrat");
		eligibleBachelors.put("Elizabeth ", "liberal");

		for (Entry e : eligibleBachelors.entrySet()) {
			if (e.getValue() == "liberal") {
				eligible.add((String) e.getKey());
			}
		}
		System.out.println(eligible);

	}

}
