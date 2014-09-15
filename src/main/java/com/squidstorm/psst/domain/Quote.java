package com.squidstorm.psst.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quotes")
public class Quote implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String author;

    @Lob
    @Column(nullable = false)
    private String quote;

    protected Quote() {
    }

    public Quote(String author, String quote) {
        super();
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return getAuthor() + " - \"" + getQuote() + "\"";
    }
}
