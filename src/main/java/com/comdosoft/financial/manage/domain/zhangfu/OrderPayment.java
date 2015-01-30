package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class OrderPayment {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.order_id
	 * @mbggenerated
	 */
	private Integer orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.price
	 * @mbggenerated
	 */
	private Integer price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.pay_type
	 * @mbggenerated
	 */
	private Byte payType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.created_user_id
	 * @mbggenerated
	 */
	private Integer createdUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.created_user_type
	 * @mbggenerated
	 */
	private Byte createdUserType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_payments.created_at
	 * @mbggenerated
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.id
	 * @return  the value of order_payments.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.id
	 * @param id  the value for order_payments.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.order_id
	 * @return  the value of order_payments.order_id
	 * @mbggenerated
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.order_id
	 * @param orderId  the value for order_payments.order_id
	 * @mbggenerated
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.price
	 * @return  the value of order_payments.price
	 * @mbggenerated
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.price
	 * @param price  the value for order_payments.price
	 * @mbggenerated
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.pay_type
	 * @return  the value of order_payments.pay_type
	 * @mbggenerated
	 */
	public Byte getPayType() {
		return payType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.pay_type
	 * @param payType  the value for order_payments.pay_type
	 * @mbggenerated
	 */
	public void setPayType(Byte payType) {
		this.payType = payType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.created_user_id
	 * @return  the value of order_payments.created_user_id
	 * @mbggenerated
	 */
	public Integer getCreatedUserId() {
		return createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.created_user_id
	 * @param createdUserId  the value for order_payments.created_user_id
	 * @mbggenerated
	 */
	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.created_user_type
	 * @return  the value of order_payments.created_user_type
	 * @mbggenerated
	 */
	public Byte getCreatedUserType() {
		return createdUserType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.created_user_type
	 * @param createdUserType  the value for order_payments.created_user_type
	 * @mbggenerated
	 */
	public void setCreatedUserType(Byte createdUserType) {
		this.createdUserType = createdUserType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_payments.created_at
	 * @return  the value of order_payments.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_payments.created_at
	 * @param createdAt  the value for order_payments.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}