package com.challenge.question5;

import org.junit.jupiter.api.Test;

import static com.challenge.question5.Question5.NOT_A_PRIME;
import static com.challenge.question5.Question5.PRIME;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Question5Test {
	
	@Test
	void checkPrime_givenPrimeNumber_returnsPrime() {
		Question5 question5 = new Question5();
		
		String result = question5.checkPrime(17);
		
		assertEquals(PRIME, result);
	}
	
	
	@Test
	void checkPrime_givenNotPrimeNumber_returnsNotAPrime() {
		Question5 question5 = new Question5();
		
		String result = question5.checkPrime(45);
		
		assertEquals(NOT_A_PRIME, result);
	}
	
	
	@Test
	void checkPrime_givenTwo_returnsNotAPrime() {
		Question5 question5 = new Question5();
		
		String result = question5.checkPrime(2);
		
		assertEquals(NOT_A_PRIME, result);
	}
}