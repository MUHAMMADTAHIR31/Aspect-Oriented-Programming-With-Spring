/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springdemo.aop;

import org.springframework.stereotype.Component;

/**
 *
 * @author Dell
 */
@Component
public class AccountDAO {
    
    public void addAccount(){
        System.out.println(getClass()+ ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}
