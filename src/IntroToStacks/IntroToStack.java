package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> numbers = new Stack<Double>();
		Random random = new Random();
		int size;
		double low;
		double high;
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the
		// Stack.
		for (int i = 0; i < 100; i++) {
			numbers.push(random.nextDouble() * 100);

		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String firstEnteredNumber = JOptionPane
				.showInputDialog("Enter one random number in between 0 and 100 in the space below.");
		String secondEnteredNumber = JOptionPane
				.showInputDialog("Enter a last random number between 0 and 100 in the space below.");
		// 4. Pop all the elements off of the Stack. Every time a double is
		// popped that is
		// between the two numbers entered by the user, print it to the screen.
		double d1 = Double.parseDouble(firstEnteredNumber);
		double d2 = Double.parseDouble(secondEnteredNumber);
		if (d1 > d2) {
			high = d1;
			low = d2;
		} else {
			high = d2;
			low = d1;
		}
		size = numbers.size();
		
		System.out.println("Popping elements off stack...");
		System.out.println("Elements between " + low + " and " +  high + ":");
		for (int i = 0; i < size ; i++) {
			double top = numbers.pop();
			if(top > low && top < high) {
				System.out.println(top);
			}
		}
		
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
