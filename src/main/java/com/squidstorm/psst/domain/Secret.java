package com.squidstorm.psst.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Secret implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String owner;

    @Column(nullable = false)
    private String recipient;

    @Lob
    @Column(nullable = false)
    private String secret;

    protected Secret() {
    }

    public Secret(String owner, String recipient, String secret) {
        super();
        this.owner = owner;
        this.recipient = recipient;
        this.secret = secret;
    }

    public String getOwner() {
        return owner;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return getOwner() + ":" + getRecipient() + ":" + getSecret();
    }
}
