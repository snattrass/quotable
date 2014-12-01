package com.squidstorm.quotable;

import org.springframework.boot.SpringApplication;


/**
 * The main entry point for Quotable.
 *
 * @author Simon Nattrass
 */
public class Quotable
{
    public static void main (String[] args) throws Exception
    {
        SpringApplication.run(AppConfig.class, args);
    }
}
