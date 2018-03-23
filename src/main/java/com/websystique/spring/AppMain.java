package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.HelloWorldConfig;
import com.websystique.spring.domain.HelloWorld;

import com.websystique.spring.configuration.StudentConfig;
import com.websystique.spring.domain.Student;
import com.websystique.spring.domain.CustomerDAO;
// Test
public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");
                
		AbstractApplicationContext context2 = new AnnotationConfigApplicationContext(StudentConfig.class);
                Student bean2 = (Student) context2.getBean("hellostudent");
                System.out.println(bean2.getName(" Tom"));
                
                
                context.close();
                

	}

}
