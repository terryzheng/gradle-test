package org.gradle;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(method = RequestMethod.GET, value = "/greeting")
	public Person greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		Person person = new Person(counter.incrementAndGet(), name, true);
		person.say("hello");
		return person;
	}
}
