package com.samul.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

	public static void main(String[] args) {
		List<String> strArr = new ArrayList();
		
		strArr.add("fffssg G .asjkn ");
		strArr.add("F sajnxjncjnsdc sdcds");
		strArr.add("Fskdnlcmn");
		strArr.add("sa,mcio8239c sd. c ewlcf");
		strArr.add("jksbacjh");
		strArr.add("FFFFF");
		strArr.add("s>cm,  adfd");
		strArr.add("sadmlvfsmlve fve nrf ek r");
		
		for (String str: strArr) {
			System.out.println(str);
		}
		
		Predicate<String> pred = str -> str.charAt(0) == 'F';
		
		strArr.removeIf(pred);
		
		System.out.println("\nResult =============================================");
		for (String str: strArr) {
			System.out.println(str);
		}
		
	}

}
