package com.rab33.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderStatus")

public class OrderStatusEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;

	@Column(name = "order_number")
	private int order_number;

	@Column(name = "ordertype")
	private String ordertype;

	@Column(name = "paymenttype")
	private String paymenttype;

	@Column(name = "shipmentdate")
	private String shipmentdate;

	@Column(name = "shipmenttype")
	private String shipmenttype;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid")
	private CustomerEntity CustomerInfo;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_number() {
		return order_number;
	}

	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getShipmentdate() {
		return shipmentdate;
	}

	public void setShipmentdate(String shipmentdate) {
		this.shipmentdate = shipmentdate;
	}

	public String getShipmenttype() {
		return shipmenttype;
	}

	public void setShipmenttype(String shipmenttype) {
		this.shipmenttype = shipmenttype;
	}

	public CustomerEntity getCustomerInfo() {
		return CustomerInfo;
	}

	public void setCustomerInfo(CustomerEntity customerInfo) {
		CustomerInfo = customerInfo;
	}

	@Override
	public String toString() {
		return "OrderStatusEntity [order_id=" + order_id + ", order_number=" + order_number + ", ordertype=" + ordertype
				+ ", paymenttype=" + paymenttype + ", shipmentdate=" + shipmentdate + ", shipmenttype=" + shipmenttype
				+ ", CustomerInfo=" + CustomerInfo + "]";
	}

}