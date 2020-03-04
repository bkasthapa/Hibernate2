package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.repository.CustomerRepository;

public class Main {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerRepository crs = (CustomerRepository) act.getBean("customerRepository");

		System.out.println("Select by id = 2");				
																			//update method
		CustomerEntity c1 = crs.getCustomerById(2);

		c1.setName("Diamond");

		crs.update(c1);
	}

}
