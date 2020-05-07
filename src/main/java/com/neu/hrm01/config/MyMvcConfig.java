package com.neu.hrm01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/login").setViewName("login");

        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/contact-us").setViewName("contact-us");
    }

}
