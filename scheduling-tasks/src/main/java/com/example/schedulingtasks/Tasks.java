package com.example.schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

// if we use @Component Spring will automatically detect this class as a bean and initiate this component
// and making it available for dependency injection or other spring features.
// Beans are the objects that spring manages, and they can be injected into other components or services.
@Component
public class Tasks {
    // To show messages in the Log
    private static final Logger LOGGER
            = LoggerFactory.getLogger(Tasks.class);
    private static final SimpleDateFormat timeFormat
            = new SimpleDateFormat("HH:mm:ss");

    // @Scheduled defines which and when a method runs
    // after the method invocation, a 5-second interval is applied before the task is executed.
    @Scheduled(fixedRate = 5000)
    public void whatTheTimeIs() {
        LOGGER.info("The time is now {}", timeFormat.format(new Date()));
    }
}
