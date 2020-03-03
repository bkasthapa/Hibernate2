package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.repository.CustomerRepository;

public class Main {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerRepository crs = (CustomerRepository) act.getBean("customerRepository");

		CustomerEntity cen = new CustomerEntity();

		cen.setName("Shawn Mendes");
		cen.setAddress("Fairfax, Virginia");
		cen.setPhoneno("2345678908");
		cen.setAppointmentno("12345");
		cen.setEmailaddress("shawn@mendes.yahoo.com");
	
	crs.AutoCustomer(cen);
	}

}
