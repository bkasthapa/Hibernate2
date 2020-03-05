package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.entity.OrderStatusEntity;
import com.rab33.repository.CustomerRepository;
import com.rab33.repository.OrderStatusRepository;

public class GetCustomer {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");

		CustomerRepository crs = (CustomerRepository) act.getBean("customerRepository");

		OrderStatusRepository ors = (OrderStatusRepository) act.getBean("orderStatusRepository");
		
		int customerid = 3;

		CustomerEntity ce = crs.getCustomerById(customerid);
		
		if (ce == null) {
			System.out.println("Customer id is fake");

		} else {

			OrderStatusEntity ose = new OrderStatusEntity();
			ose.setOrder_number(1001);
			ose.setOrdertype("Groceries");
			ose.setPaymenttype("Cash");
			ose.setShipmentdate("3Days");
			ose.setShipmenttype("Postman");

			ose.setCustomerInfo(ce);
			ors.save(ose);
		}
	}
}