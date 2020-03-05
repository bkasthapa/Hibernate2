package com.rab33.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rab33.entity.CustomerEntity;
import com.rab33.entity.OrderStatusEntity;
import com.rab33.repository.CustomerRepository;
import com.rab33.repository.OrderStatusRepository;

public class Main {

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

//		System.out.println("Select by id = 2");				
//																			//update method
//		CustomerEntity c1 = crs.getCustomerById(2);
//
//		c1.setName("Diamond");
//
//		crs.update(c1);
//	}

//		System.out.println("Select by name = Dipsa");						//ByNameMethod
//
//		CustomerEntity c1 = crs.getByName("Dipsa");
//
//		c1.setName("Radha");
//
//		crs.update(c1);
//
//	}
//		List<CustomerEntity> cen = (List<CustomerEntity>) crs.getByappointmentno("101"); 
//		if (cen != null) {
//			
//			System.out.println(cen.toString());
//		}
//
//		System.out.println("List of Customers by appointment no");
//		
//		for (CustomerEntity obj : cen) {
//			System.out.println(obj.toString());
//		}
//	}
//}