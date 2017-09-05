package com.level3.exercises;

public class Fibonnacci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int current = 0;
		System.out.println(first);
		System.out.println(second);
		printFib(100000);
	}

	public static void printFib(int n) {
		int first = 0;
		int second = 1;
		int current = 0;
		while (true) {
			current = first + second;
			first = second;
			second = current;
			if (current > n) {
				break;
			}
			System.out.println(current);
		}
	}
}
