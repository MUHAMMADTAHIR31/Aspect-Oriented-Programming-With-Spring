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
        
        //get the membership from container
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
        
        //call the business method
        theAccountDAO.addAccount();
        
        //call the Membership ethod
        theMembershipDAO.addAccount();
        
        //close the context
        context.close();
    }
}
