package com.rab33.repository;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.rab33.entity.OrderStatusEntity;


public class OrderStatusRepository {

	private SessionFactory sessionFactory;

	public void save(OrderStatusEntity os) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(os);
		session.getTransaction().commit();
		session.close();
	}

//	public OrderStatusEntity getOrderStatusByordertype(String odtype) {
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		Query qu = session.createQuery("select o from OrderStatusEntity o where o.odtype=:odtype");
//		qu.setParameter("odtype", odtype);
//
//		List<OrderStatusEntity> orderStatus = (List<OrderStatusEntity>) qu.list();
//
//		session.getTransaction().commit();
//
//		return orderStatus.get(0);
//
//	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}