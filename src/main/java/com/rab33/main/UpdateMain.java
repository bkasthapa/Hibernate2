package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.repository.CustomerRepository;

public class UpdateMain {
	public static void main(String[] args) {
		ApplicationContext atc = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerRepository csr = (CustomerRepository) atc.getBean("customerRepository");

		CustomerEntity cen = csr.getCustomerById(3);
		System.out.println("Customer is changing the name");
		
		
		cen.setName("kalumanchey");
		
		csr.update(cen);

	}
}