package com.samul.predicate;

import java.util.function.IntPredicate;

public class Task5 {

	public static void main(String[] args) {
		int num = 1234;

		IntPredicate iPred = Task5::isOdd;

		System.out.println("Result = " + iPred.test(num));
		
	}

	static boolean isOdd(int i) {
		int sum = 0;

		while (i >= 1) {
			sum += i % 10;
			i = i / 10;
		}

		if ((sum % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

}
