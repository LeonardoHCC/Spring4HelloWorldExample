/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.domain;

import com.websystique.spring.domain.CustomerDAO;

/**
 *
 * @author w209116758
 */
public class StudentImpl implements Student {
    public String getName (String name)
    {
        //System.out.println("Hello" + name);
        return name;
    }
    
    CustomerDAO customerDAO;
    
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    
    @Override
    public String toString(){
        return "Customer Service [customerDAO=" + customerDAO + "]";
    }
}
