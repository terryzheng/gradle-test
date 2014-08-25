package org.gradle;

import org.apache.commons.collections.list.GrowthList;
import org.joda.time.LocalTime;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
    
    public String say(String word){
    	LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        return word;
    }
}
