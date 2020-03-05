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

	public CustomerEntity getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		CustomerEntity cn = (CustomerEntity) session.get(CustomerEntity.class, id);

		session.getTransaction().commit();
		session.close();

		return cn;
	}

	public void update(CustomerEntity cen) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(cen);
		session.getTransaction().commit();
		session.close(); // update ended
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}