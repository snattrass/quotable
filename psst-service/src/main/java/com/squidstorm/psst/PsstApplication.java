package com.squidstorm.psst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * The main entry point for PSST.
 *
 * @author Simon Nattrass
 */
@EnableAutoConfiguration
public class PsstApplication
{
    public static void main (String[] args) throws Exception
    {
        SpringApplication.run(PsstApplication.class, args);
    }

    @Bean
    public WebMvcConfigurerAdapter mvcViewConfigurer()
    {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/client").setViewName("client");
            }
        };
    }
}
