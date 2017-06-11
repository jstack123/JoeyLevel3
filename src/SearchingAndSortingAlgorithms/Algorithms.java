package SearchingAndSortingAlgorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				return i;
			}
		}
		return 0;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}

		}
		return longest;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size() - 1; i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(i) > results.get(j)) {
					double temp = results.get(i);
					results.set(i, results.get(j));
					results.set(j, temp);
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = i + 1; j < unsortedSequences.size(); j++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(j).length()) {
					String temp = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(j));
					unsortedSequences.set(j, temp);
				}
			}
		}
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words){
		for (int i = 0; i < words.size(); i++) {
			for (int j = i+1; j < words.size(); j++) {
				if(words.get(i).compareTo(words.get(j))>0) {
					String temp = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}
	// Add other methods here
}