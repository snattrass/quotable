package com.squidstorm.psst.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Quote> quotes;

    protected Author() { }

    public Author(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    @Override
    public String toString() {
        return getName();
    }
}
