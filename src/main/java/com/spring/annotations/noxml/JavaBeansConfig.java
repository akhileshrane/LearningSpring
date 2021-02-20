package com.spring.annotations.noxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.annotations")
@PropertySource("classpath:props.txt")
public class JavaBeansConfig {

}
