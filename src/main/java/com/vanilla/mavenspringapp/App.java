package com.vanilla.mavenspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vanilla.mavenspringapp.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// This loads the configured bean using configuration metadata into IoC container of spring
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	// This is how, we can get the Bean from the ApplicationContext 
        HelloWorld helloObj = (HelloWorld) context.getBean(HelloWorld.class);
        
        helloObj.getMessage();   
    }
}
