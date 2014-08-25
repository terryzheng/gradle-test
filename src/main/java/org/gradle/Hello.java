package org.gradle;

public class Hello {
	public static void main(String[] args) {
		Person person = new Person("Han");
		System.out.println(person.say("Hello"));
	}
}