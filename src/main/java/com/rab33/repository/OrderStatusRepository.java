package com.rab33.repository;

import java.util.List;

import org.hibernate.Query;
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
																			//Select method by id/ordertype
	public OrderStatusEntity getOrderStatusByordertype(String ordertype) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query qu = session.createQuery("select o from OrderStatusEntity o where o.ordertype=:ordertype");
		qu.setParameter("ordertype", ordertype);

		List<OrderStatusEntity> orderStatus = (List<OrderStatusEntity>) qu.list();

		session.getTransaction().commit();

		return orderStatus.get(0);
	}
																			//select method/id/ordertype
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}