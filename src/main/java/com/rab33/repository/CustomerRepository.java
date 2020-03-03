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

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
