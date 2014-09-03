package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.joda.time.LocalTime;

public class Person {
	private final long id;
	private final String name;
	private int age;
	private final boolean sex;

	public Person(final long i, final String n, final boolean s) {
		this.id = i;
		this.name = n;
		this.sex = s;
		new GrowthList();
	}

	public final String getName() {
		return name;
	}

	public final int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public final boolean isSex() {
		return sex;
	}

	public final long getId() {
		return id;
	}

	public final String say(final String word) {
		LocalTime currentTime = new LocalTime();
		System.out.print("The current local time is: " + currentTime);
		return word;
	}
}
