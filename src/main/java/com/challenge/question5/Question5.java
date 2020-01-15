package com.challenge.question5;

import java.util.stream.IntStream;

public class Question5 {
	
	public static final String PRIME = "prime";
	public static final String NOT_A_PRIME = "not a prime";
	
	
	/**
	 * Check if the given number is a prime
	 *
	 * @param number number to be checked
	 * @return "prime" if the given number is prime or "not a prime" in case it is not
	 */
	public String checkPrime(int number) {
		if (isPrime(number)) {
			return PRIME;
		} else {
			return NOT_A_PRIME;
		}
	}
	
	
	/**
	 * Check if the given number is a prime
	 *
	 * @param number number to be checked
	 * @return if the given number is prime or not
	 */
	private boolean isPrime(int number) {
		return number > 2 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
	}
}
