package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.joda.time.LocalTime;

public class Person {
	private final long id;
	private final String name;
	private int age;
	private final boolean sex;

	public Person(long id, String name, boolean sex) {
		this.id = id;
		this.name = name;
		this.sex = true;
		new GrowthList();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public long getId() {
		return id;
	}

	public String say(String word) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		return word;
	}
}
