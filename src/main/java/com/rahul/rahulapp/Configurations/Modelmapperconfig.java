package com.rahul.rahulapp.Configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Modelmapperconfig {

    //factory method
    //loosly coupled
    //if its a bean dependency injection is compulsory
    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
