package com.example.Docker_lekciq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ServiceClass bean1(){
        return new ServiceClass();
    }

    @Bean
    public ServiceClass bean2(){
        return new ServiceClass();
    }
}
