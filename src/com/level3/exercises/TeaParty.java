package com.level3.exercises;

public class TeaParty {

	public String welcome(String name, boolean isFemale, boolean isKnighted) {
		String greeting = "";
		if (isFemale==true && isKnighted==false) {
			greeting = "Hello Ms. " + name;
		} 
		if(isFemale==false && isKnighted==false) {
			greeting = "Hello Mr. " + name;
		} 
		if (isFemale==false && isKnighted==true) {
			greeting = "Hello Sir " + name;
		}
		return greeting; 
		
			

		
	}
	
}