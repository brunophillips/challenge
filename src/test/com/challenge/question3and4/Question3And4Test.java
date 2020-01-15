package com.challenge.question3and4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class Question3And4Test {
	
	@Test
	void removeDuplicatedCharacters_returnsNoDuplicatedCharacters() {
		Question3And4 question = new Question3And4();
		
		String result = question.removeDuplicatedCharacters("pqqqrraaaff");
		
		assertNotNull(result);
		assertEquals("pqraf", result);
	}
	
	
	@Test
	void removeDuplicatedCharacters_givenDuplicatedNumbers_returnsNoDuplicatedCharacters() {
		Question3And4 question = new Question3And4();
		
		String result = question.removeDuplicatedCharacters("1122334444");
		
		assertNotNull(result);
		assertEquals("1234", result);
	}
	
	
	@Test
	void removeDuplicatedCharacters_givenSpecialCharacters_returnsNoDuplicatedCharacters() {
		Question3And4 question = new Question3And4();
		
		String result = question.removeDuplicatedCharacters("####$$$$");
		
		assertNotNull(result);
		assertEquals("#$", result);
	}
	
	
	@Test
	void removeDuplicatedCharacters_givenNull_returnsNull() {
		Question3And4 question = new Question3And4();
		
		String result = question.removeDuplicatedCharacters(null);
		
		assertNull(result);
	}
	
	
	@Test
	void reverseOrderCharacters_returnsReversedCharactersOrder() {
		Question3And4 question = new Question3And4();
		
		String result = question.reverseOrderCharacters("pqqqrraaaff");
		
		assertNotNull(result);
		assertEquals("ffaaarrqqqp", result);
	}
	
	
	@Test
	void reverseOrderCharacters_givenNumbers_returnsReversedCharactersOrder() {
		Question3And4 question = new Question3And4();
		
		String result = question.reverseOrderCharacters("1122334444");
		
		assertNotNull(result);
		assertEquals("4444332211", result);
	}
	
	
	@Test
	void reverseOrderCharacters_givenSpecialCharacters_returnsReversedCharactersOrder() {
		Question3And4 question = new Question3And4();
		
		String result = question.reverseOrderCharacters("####$$$$");
		
		assertNotNull(result);
		assertEquals("$$$$####", result);
	}
	
	
	@Test
	void reverseOrderCharacters_givenNull_returnsNull() {
		Question3And4 question = new Question3And4();
		
		String result = question.reverseOrderCharacters(null);
		
		assertNull(result);
	}
}