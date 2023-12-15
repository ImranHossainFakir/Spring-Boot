package com.example.restservice.control;

import com.example.restservice.json.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController // as a controller where every method returns a domain object instead of a view
public class GreetingController { // This class is both Controller and ResponseBody.
                                  // Handle the HTTP request.
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong(); // Incrementing the counter in per request

    @GetMapping("/greeting") // Mapping get request to the greeting() method.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) { // It returns a Greeting object.
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
