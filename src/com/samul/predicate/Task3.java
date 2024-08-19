package com.samul.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task3 {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList();
		
		cats.add(new Cat("Barsik", 1));
		cats.add(new Cat("Carsik", 2));
		cats.add(new Cat("Carrrsik", 3));
		cats.add(new Cat("Garsik", 4));
		cats.add(new Cat("Zarsik", 5));
		
		for (Cat cat: cats) {
			System.out.println(cat);
		}

		
		Predicate<Cat> predName = cat -> cat.name.charAt(0) == 'C';  
		Predicate<Cat> predAge = cat -> cat.age < 4;  
		Predicate<Cat> predCombo = predAge.and(predName);  
		
		cats.removeIf(predCombo);


		System.out.println("\nResult =============================================");
		for (Cat cat: cats) {
			System.out.println(cat);
		}
		
	}

}

class Cat {
	String name;
	int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[name=" + name + ", age=" + age + "]";
	}
}
