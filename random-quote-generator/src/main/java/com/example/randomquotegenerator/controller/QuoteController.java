package com.example.randomquotegenerator.controller;

import com.example.randomquotegenerator.dto.QuoteDTOAsJSON;
import com.example.randomquotegenerator.entity.Quote;
import com.example.randomquotegenerator.repository.QuoteRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class QuoteController {
    private final static Random RANDOMIZER = new Random();
    private final QuoteRepo quoteRepo;

    public QuoteController(QuoteRepo quoteRepo) {
        this.quoteRepo = quoteRepo;
    }

    @GetMapping("/api")
    public List<QuoteDTOAsJSON> getAll() {

        return quoteRepo.findAll()
                .stream()
                .map(quote -> new QuoteDTOAsJSON("success", quote))
                .collect(Collectors.toList());
    }

    @GetMapping("/api/{id}")
    public QuoteDTOAsJSON getOne(@PathVariable Long id) {

        return quoteRepo.findById(id)
                .map(quote -> new QuoteDTOAsJSON("success", quote))
                .orElse(new QuoteDTOAsJSON("fail", new Quote("quote id: " + id + " does not exist")));
    }

    @GetMapping("/api/random")
    public QuoteDTOAsJSON getRandom() {
        return getOne(nextLong(1, quoteRepo.count()+1));
    }

    private long nextLong(long l, long h) {
        return (long) (RANDOMIZER.nextDouble() * (h - l)) + l;
    }
}
