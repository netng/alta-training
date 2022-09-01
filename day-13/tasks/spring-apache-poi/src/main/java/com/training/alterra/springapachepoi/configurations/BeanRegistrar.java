package com.training.alterra.springapachepoi.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegistrar {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
