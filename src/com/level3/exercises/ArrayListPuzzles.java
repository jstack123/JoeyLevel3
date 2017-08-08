package com.level3.exercises;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles implements KeyListener {
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("Steak/pork");
		food.add("Salads");
		food.add("fruits and veggies");
		food.add("Hamburgers/Hot Dogs");
		food.add("Pizza");
		food.add("Pasta");
		food.add("Chicken/fish");
		food.add("Beans and rice");
		Random random = new Random();

		int r = random.nextInt(food.size());

		System.out.println("You should eat " + food.get(r) + " tonight.");

		ArrayList<String> jokes = new ArrayList<String>();
		ArrayList<String> punchlines = new ArrayList<String>();

		jokes.add("Where do animals go when their tail falls off?");
		jokes.add("What do you call a cow with no legs?");
		jokes.add("What did the buffalo say to his son when he left for college?");
		jokes.add("Why can't you hear a pterodactyl?");
		punchlines.add("The retail store.");
		punchlines.add("Ground beef.");
		punchlines.add("Bison.");
		punchlines.add("Because the 'p' is silent.");
		Random randomJokes = new Random();
		Random randomPunchlines = new Random();

		int rJ = random.nextInt(jokes.size());
		int rP = random.nextInt(punchlines.size());

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// if (e.VK_SPACE) {

		// }

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
