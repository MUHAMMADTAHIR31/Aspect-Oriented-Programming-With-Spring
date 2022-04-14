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
public class MembershipDAO {
    
    public void addAccount(){
        System.out.println(getClass()+ ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }

}
