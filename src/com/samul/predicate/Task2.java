package com.samul.predicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Task2 {

	public static void main(String[] args) {
		List<String> strArr = new ArrayList();
		
		strArr.add("Affssg G .asjkn ");
		strArr.add("F sajnxjncjnsdc sdcds");
		strArr.add("Fskdnlcmn");
		strArr.add("sa,mcio8239c sd. c ewlcf");
		strArr.add("jksbacjh");
		strArr.add("FFFFF");
		strArr.add("g>cm,  adfd");
		strArr.add("sadmlvfsmlve fve nrf ek r");
		
		Set<Character> symbolsToDelete = new HashSet();
		symbolsToDelete.add('F');
		symbolsToDelete.add('A');
		symbolsToDelete.add('g');
		
		for (String str: strArr) {
			System.out.println(str);
		}
		
		Predicate<String> pred = str -> symbolsToDelete.contains(str.charAt(0));
		
		strArr.removeIf(pred);
		
		System.out.println("\nResult =============================================");
		for (String str: strArr) {
			System.out.println(str);
		}

	}

}
