package com.samul.predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Task4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();

		map.put(1, "d");
		map.put(2, "as");
		map.put(3, "asd");
		map.put(4, "asdf");
		map.put(5, "a");
		map.put(6, "dfrfrfrddddd");
		map.put(7, "dlkjfhjdvfsdjvivksd");

		for (Integer key : map.keySet()) {
			System.out.println("{" + key + ", " + map.get(key) + "}");
		}

		BiPredicate<Integer, String> biPred = (i, s) -> s.length() == i;

		List<Integer> toBeDelete = new ArrayList();
		
		for (Integer key : map.keySet()) {
			if (biPred.test(key, map.get(key))) {
				toBeDelete.add(key);
			}
		}

		for (Integer key: toBeDelete) {
			map.remove(key);
		}
		
		System.out.println("\nResult =============================================");
		for (Integer key : map.keySet()) {
			System.out.println("{" + key + ", " + map.get(key) + "}");
		}

	}

}
