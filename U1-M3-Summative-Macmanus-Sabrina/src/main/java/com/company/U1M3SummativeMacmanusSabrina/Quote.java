package com.company.U1M3SummativeMacmanusSabrina;

public class Quote {
    private String quote;
    private String author;

    public Quote(){}
    public Quote(String quote, String author){
        this.quote = quote;
        this.author = author;
    }

    public String getQuote(){return this.quote;}
    public void setQuote(String quote){this.quote = quote;}
    public String getAuthor(){return this.author;}
    public void setAuthor(String author){this.author = author;}
}
