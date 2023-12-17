package com.example.randomquotegenerator.repository;

import com.example.randomquotegenerator.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepo extends JpaRepository<Quote, Long> {
}
