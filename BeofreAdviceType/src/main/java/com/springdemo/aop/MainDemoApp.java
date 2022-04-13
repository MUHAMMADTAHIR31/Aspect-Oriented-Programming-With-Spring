/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdemo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Dell
 */
public class MainDemoApp {
 
    public static void main(String arg[]){
    
        //read spring config java class
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(DemoConfig.class);
        
        //get The bean from spring Container
        AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
        
        //call the business method
        theAccountDAO.addAccount();
        
        //do it again
        System.out.println("\n let's call it again!\n");
        
        //call the method
        theAccountDAO.addAccount();
        
        //close the context
        context.close();
    }
}
