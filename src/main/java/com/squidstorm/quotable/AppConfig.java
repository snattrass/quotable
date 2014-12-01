package com.squidstorm.quotable;

import org.h2.server.web.WebServlet;
import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.sql.SQLException;


/**
 * Configuration for the application
 *
 * @author Simon Nattrass
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AppConfig
{
    Logger logger = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    public WebMvcConfigurerAdapter mvcViewConfigurer()
    {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                // static content
                // see http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-config-view-controller
                //registry.addViewController("/client").setViewName("client");
            }
        };
    }

    @Bean
    public ServletRegistrationBean h2Console() throws SQLException
    {
        logger.info("starting H2 Console" );
        ServletRegistrationBean reg = new ServletRegistrationBean(new WebServlet(), "/console/*");
        reg.setLoadOnStartup(1);
        return reg;
    }

    @Bean
    public Server h2TcpServer() throws SQLException
    {
        logger.info("starting H2 TCP Server");
        return Server.createTcpServer().start();
    }
}
