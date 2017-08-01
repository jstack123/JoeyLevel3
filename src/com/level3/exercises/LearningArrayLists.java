package com.level3.exercises;

import java.util.ArrayList;

public class LearningArrayLists {
	public static ArrayList<String> createArrayList() {
		ArrayList<String> testList = new ArrayList<String>();
		return testList;
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

	public static String iterateOver1(ArrayList<String> testList) {
		String test = "";
		for (int i = 0; i < testList.size(); i++) {
			// test = testList.get(i);
			test = test.concat(testList.get(i));
			System.out.println(testList.get(i));
		}
		return test;
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

	public static ArrayList<Integer> createTypedArrayList() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		return testList;
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		int j = 0;
		for (Integer i : testList) {
			 j = i+j;
		} 
		return j;
	}

	public static ArrayList<String> createStringTypedArrayList() {
		ArrayList<String> testList = new ArrayList<String>();
		
		return testList;
	}

	public static String addAllString(ArrayList<String> testList) {
		String k = "";
		for (String s : testList) {
			k=k.concat(s);
		}
		return k;
	}

}