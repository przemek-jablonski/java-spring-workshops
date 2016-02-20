package com.szparag.springworkshops;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Ciemek on 20/02/16.
 */
@ComponentScan(value = "com.szparag.springworkshops")
@EnableAutoConfiguration
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocation(new ClassPathResource("app.properties"));
        return propertySourcesPlaceholderConfigurer;
    }

    @Bean
    public CounterBean counter() {
        return new CounterBean();
    }
}
