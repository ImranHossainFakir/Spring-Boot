package com.example.randomquotegenerator.database;

import com.example.randomquotegenerator.entity.Quote;
import com.example.randomquotegenerator.repository.QuoteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyDatabase {

    @Bean
    CommandLineRunner init(QuoteRepo quoteRepo) {
        return args -> {
            quoteRepo.save(new Quote("Working with Spring Boot is like pair-programming with the Spring developers."));
            quoteRepo.save(new Quote("With Boot you deploy everywhere you can find a JVM basically."));
            quoteRepo.save(new Quote("Spring has come quite a ways in addressing developer enjoyment and "
                    + "ease of use since the last time I built an application using it."));
            quoteRepo.save(new Quote(
                    "Previous to Spring Boot, I remember XML hell, confusing set up, and " + "many hours of frustration."));
            quoteRepo.save(new Quote("Spring Boot solves this problem. It gets rid of XML and wires up "
                    + "common components for me, so I don't have to spend hours scratching my "
                    + "head just to figure out how it's all pieced together."));
            quoteRepo.save(new Quote("It embraces " + "convention over configuration, providing an experience on par with "
                    + "frameworks that excel at early stage development, such as Ruby on " + "Rails."));
            quoteRepo.save(new Quote("The real benefit of Boot, however, is that it's just Spring. That "
                    + "means any direction the code takes, regardless of complexity, I know " + "it's a safe bet."));
            quoteRepo.save(new Quote("I don't worry about my code scaling. Boot allows the "
                    + "developer to peel back the layers and customize when it's appropriate "
                    + "while keeping the conventions that just work."));
            quoteRepo.save(new Quote("So easy it is to switch container in #springboot."));
            quoteRepo.save(new Quote("Really loving Spring Boot, makes stand alone Spring apps easy."));
            quoteRepo.save(new Quote("I have two hours today to build an app from scratch. @springboot to the rescue!"));
            quoteRepo.save(new Quote("@springboot with @springframework is pure productivity! Who said in #java one has "
                    + "to write double the code than in other langs? #newFavLib"));
        };
    }
}
