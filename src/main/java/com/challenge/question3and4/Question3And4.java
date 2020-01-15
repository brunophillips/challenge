package com.challenge.question3and4;

public class Question3And4 {
	
	/**
	 * Remove duplicated characters present in the String
	 *
	 * @param input characters to remove duplicates
	 * @return String without duplicated characters
	 */
	public String removeDuplicatedCharacters(String input) {
		if (input == null) {
			return null;
		}
		
		StringBuilder output = new StringBuilder();
		input.chars().distinct().forEach(c -> output.append((char) c));
		
		return output.toString();
	}
	
	
	/**
	 * Reverse the order of characters in the String
	 *
	 * @param input characters to reverse order
	 * @return String without duplicated characters
	 */
	public String reverseOrderCharacters(String input) {
		if (input == null) {
			return null;
		}
		
		StringBuilder output = new StringBuilder(input);
		output.reverse();
		
		return output.toString();
	}
}
