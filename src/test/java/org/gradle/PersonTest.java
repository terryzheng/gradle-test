package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person(0, "Larry", false);
        assertEquals("Larry", person.say("Larry"));
    }
}
