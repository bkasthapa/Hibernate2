package com.rab33.repository;

import java.util.List;

import org.hibernate.Query;
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

//	public CustomerEntity getCustomerById(int id) { // update updated
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		CustomerEntity ce = (CustomerEntity) session.get(CustomerEntity.class, id);
//
//		session.getTransaction().commit();
//		session.close();
//
//		return ce;
//	}
//
//	public void update(CustomerEntity c) {
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		session.merge(c);
//		session.getTransaction().commit();
//		session.close(); // update ended
//	}
	
//	public CustomerEntity getCustomerByName(String name) {
//		
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		
//		CustomerEntity ce = (CustomerEntity) session.get(CustomerEntity.class, name);
//		
//		session.getTransaction().commit();
//		session.close();
//		
//		return ce;
//		
//	}
	
	public CustomerEntity getByName(String pname) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("select ce from CustomerEntity ce where ce.name =:name");
		query.setParameter("name", pname);

		List<CustomerEntity> customers = query.list();

		session.getTransaction().commit();
		session.close();

		return customers.get(0);
	}

	
	public void update (CustomerEntity c) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
		session.merge(c);
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