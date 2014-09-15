package com.squidstorm.psst;

import org.h2.server.web.WebServlet;
import org.h2.tools.Server;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.sql.SQLException;


/**
 * Configuration for the Psst application
 *
 * @author Simon Nattrass
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AppConfig
{
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

    @Bean
    public ServletRegistrationBean h2Console() throws SQLException
    {
        ServletRegistrationBean reg = new ServletRegistrationBean(new WebServlet(), "/console/*");
        reg.setLoadOnStartup(1);
        return reg;
    }

    @Bean
    public Server h2TcpServer() throws SQLException
    {
        return Server.createTcpServer().start();
    }
}
