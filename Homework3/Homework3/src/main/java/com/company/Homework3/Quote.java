package com.company.Homework3;

public class Quote {
    private String author;
    private String quote;


    public Quote() {

    }

    public Quote(String quote, String author) {
        this.author = author;
        this.quote = quote;

    }





    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
