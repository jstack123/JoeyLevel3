package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	//Add other methods here
}