package com.rab33.repository;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.rab33.entity.CustomerEntity;

public class CustomerRepository {

	private SessionFactory sessionFactory;

	public void AutoCustomer(CustomerEntity customerEntity) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(customerEntity);
		session.getTransaction().commit();
		session.close();
	}

	public CustomerEntity getCustomerById(int id) { 			//update updated
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		
		CustomerEntity ce= (CustomerEntity) session.get(CustomerEntity.class,id);
		
		//Query query = session.createQuery("select c from CustomerEntity c where c.id =:id");
		//List<CustomerEntity> customer = query.list();

		session.getTransaction().commit();
		session.close();

		return ce;
	}

	public void update(CustomerEntity c) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(c);
		session.getTransaction().commit();
		session.close();											//update ended
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}