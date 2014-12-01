package com.squidstorm.quotable.domain;

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

    public Quote(String quote) {
        super();
        this.quote = quote;
    }

    public Quote(Author author, String quote) {
        this(quote);
        this.author = author;
    }

    public Quote(String authorName, String quote) {
        this(new Author(authorName), quote);
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
        String authorName = (getAuthor() == null) ? "unknown" : getAuthor().getName();
        return authorName + " - \"" + getQuote() + "\"";
    }
}
