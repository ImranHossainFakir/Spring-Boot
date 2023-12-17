package com.example.randomquotegenerator.dto;

import com.example.randomquotegenerator.entity.Quote;

import java.util.Objects;

// This class is responsible for showing the output to client side.
public class QuoteDTOAsJSON {
    private String status;
    private Quote quote;

    public QuoteDTOAsJSON(String status, Quote quote) {
        this.status = status;
        this.quote = quote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuoteDTOAsJSON that = (QuoteDTOAsJSON) o;
        return Objects.equals(status, that.status) && Objects.equals(quote, that.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, quote);
    }

    @Override
    public String toString() {
        return "QuoteDTOAsJSON{" +
                "status='" + status + '\'' +
                ", quote=" + quote +
                '}';
    }
}
