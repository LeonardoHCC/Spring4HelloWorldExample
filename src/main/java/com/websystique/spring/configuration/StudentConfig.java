/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.configuration;

import com.websystique.spring.domain.Student;
import com.websystique.spring.domain.StudentImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 *
 * @author w209116758
 */
@Configuration
public class StudentConfig {
    

        
        @Bean(name="hellostudent")
	@Description("This is a sample student Bean")
	public Student hello() {
		return new StudentImpl();
	}
    
}
    

