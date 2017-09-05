package IntroToJUnitTest;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				eggs.indexOf(i);
				return i;
			}

		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int total;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				total = i + 1;
				return total;
			}
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double greatest = 1;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > greatest) {
				greatest = peeps.get(i);
				return greatest;
			}
		}
		return -1;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
				return longest;
			}
		}
		return "";
	}

	/*
	 * public static boolean containsSOS(List<String> message) { for (int i = 0; i < message.size(); i++) { if
	 * (message.get(i).contains("...---...")) {
	 * 
	 * } } }
	 */
}
