package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> food = new ArrayList<String>();
		//2. Add five Strings to your list
		food.add("steak");
		food.add("pizza");
		food.add("hamburger");
		food.add("beans");
		food.add("salad");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < food.size(); i++) {
			String f = food.get(i);
			//System.out.println(f);
		}
		//4. Print all the Strings using a for-each loop
		for (String f : food) {
			//System.out.println(f);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < food.size(); i++) {
			String f = food.get(i++);
			//System.out.println(f);
		}
		//6. Print all the Strings in reverse order.
		for (int i = food.size()-1; i > -1; i--) {
			String f = food.get(i);
			//System.out.println(f);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String f : food) {
			if(f.contains("e")) {
				System.out.println(f);
			}
		}
	}
}
