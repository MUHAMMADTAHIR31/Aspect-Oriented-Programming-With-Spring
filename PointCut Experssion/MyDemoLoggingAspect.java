/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dell
 */
@Aspect
@Component
public class MyDemoLoggingAspect {
 
    @Before("execution(public void add*())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n===============> Executing @Before advice on method");
    }
    
}
