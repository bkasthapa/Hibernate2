package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.OrderStatusEntity;
import com.rab33.repository.OrderStatusRepository;

public class Main {

	public static void main(String[] args) {

		ApplicationContext act = new ClassPathXmlApplicationContext("application-context.xml");

		OrderStatusRepository ors = (OrderStatusRepository) act.getBean("orderStatusRepository");

		System.out.println("Select by customerid = 2"); // select by id/ordertype
		OrderStatusEntity o1 = ors.getOrderStatusByordertype("Macbook");

		if (o1 != null) {
			System.out.println(o1.toString());
		} 												// select by id/ordertype
	}
}
