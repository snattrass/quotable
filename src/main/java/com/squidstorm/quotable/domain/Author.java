package com.squidstorm.quotable.domain;

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

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String surname;

    @OneToMany(mappedBy = "author")
    private List<Quote> quotes;

    protected Author() { }

    public Author(String firstname, String surname) {
        super();
        this.firstname = firstname;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFirstname()).append(" ").append(getSurname());
        return sb.toString();
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
