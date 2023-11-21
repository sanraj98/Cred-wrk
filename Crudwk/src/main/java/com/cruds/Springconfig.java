package com.cruds;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.cruds")
public class Springconfig {
	@Bean
	 public ViewResolver view() {
		 InternalResourceViewResolver ir=new InternalResourceViewResolver();
	 return ir;
	 }
}
