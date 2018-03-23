/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.domain;

/**
 *
 * @author w209116758
 */
public class CustomerService {
    CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
    
}
