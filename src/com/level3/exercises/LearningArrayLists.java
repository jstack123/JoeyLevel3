package com.level3.exercises;

import java.util.ArrayList;

public class LearningArrayLists {
	public static ArrayList<String> createArrayList() {
		return null;
	}

	public static ArrayList<String> addToArrayList(ArrayList<String> testList, String testString) {
		testList.add(testString);
		return testList;
	}

	public static int getNumberOfItems(ArrayList<Integer> testList) {
		return testList.size();
	}

	public static String getItem(ArrayList<String> testList, int i) {
		return testList.get(i);
	}

	public static String iterateOver(ArrayList<String> testList) {
		String test = "";
		for (int i = 0; i < testList.size(); i++) {
			// test = testList.get(i);
			test = test.concat(testList.get(i));
			System.out.println(testList.get(i));
		}
		return test;
	}

	public static Object findItemOnList(ArrayList<Integer> testList, String string) {
		return testList.indexOf(string);
	}

	public static void replaceItem(ArrayList<String> testList, int i, String string) {
		testList.set(1, string);
	}

	public static void insertItem(ArrayList<String> testList, int i, String string) {
		testList.add(1, string);
	}

}