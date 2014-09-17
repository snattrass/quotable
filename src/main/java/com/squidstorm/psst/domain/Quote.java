package com.squidstorm.psst.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quotes")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Quote implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="AUTHOR_ID")
    private Author author;

    @Lob
    @Column(nullable = false)
    private String quote;

    protected Quote() {
    }

    public Quote(Author author, String quote) {
        super();
        this.author = author;
        this.quote = quote;
    }

    public Quote(String authorName, String quote) {
        super();
        this.author = new Author(authorName);
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return getAuthor() + " - \"" + getQuote() + "\"";
    }
}
