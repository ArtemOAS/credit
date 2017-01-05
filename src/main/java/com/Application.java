package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@SpringBootApplication
public class Application extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
