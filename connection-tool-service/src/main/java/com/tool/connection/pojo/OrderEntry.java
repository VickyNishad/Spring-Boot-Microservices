package com.tool.connection.pojo;

public class OrderEntry {

	public OrderEntry() {
		// TODO Auto-generated constructor stub
	}
	
	
	private double price;
	private int security_id;
	private int entity_id;
	private long order_no;
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the security_id
	 */
	public int getSecurity_id() {
		return security_id;
	}
	/**
	 * @param security_id the security_id to set
	 */
	public void setSecurity_id(int security_id) {
		this.security_id = security_id;
	}
	/**
	 * @return the entity_id
	 */
	public int getEntity_id() {
		return entity_id;
	}
	/**
	 * @param entity_id the entity_id to set
	 */
	public void setEntity_id(int entity_id) {
		this.entity_id = entity_id;
	}
	/**
	 * @return the order_no
	 */
	public long getOrder_no() {
		return order_no;
	}
	/**
	 * @param order_no the order_no to set
	 */
	public void setOrder_no(long order_no) {
		this.order_no = order_no;
	}

	
	
}
