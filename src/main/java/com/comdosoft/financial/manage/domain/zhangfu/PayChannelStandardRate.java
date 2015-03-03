package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class PayChannelStandardRate {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.pay_channel_id
	 * @mbggenerated
	 */
	private Integer payChannelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.standard_rate
	 * @mbggenerated
	 */
	private Integer standardRate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.description
	 * @mbggenerated
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pay_channel_standard_rates.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.id
	 * @return  the value of pay_channel_standard_rates.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.id
	 * @param id  the value for pay_channel_standard_rates.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.pay_channel_id
	 * @return  the value of pay_channel_standard_rates.pay_channel_id
	 * @mbggenerated
	 */
	public Integer getPayChannelId() {
		return payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.pay_channel_id
	 * @param payChannelId  the value for pay_channel_standard_rates.pay_channel_id
	 * @mbggenerated
	 */
	public void setPayChannelId(Integer payChannelId) {
		this.payChannelId = payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.name
	 * @return  the value of pay_channel_standard_rates.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.name
	 * @param name  the value for pay_channel_standard_rates.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.standard_rate
	 * @return  the value of pay_channel_standard_rates.standard_rate
	 * @mbggenerated
	 */
	public Integer getStandardRate() {
		return standardRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.standard_rate
	 * @param standardRate  the value for pay_channel_standard_rates.standard_rate
	 * @mbggenerated
	 */
	public void setStandardRate(Integer standardRate) {
		this.standardRate = standardRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.description
	 * @return  the value of pay_channel_standard_rates.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.description
	 * @param description  the value for pay_channel_standard_rates.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.created_at
	 * @return  the value of pay_channel_standard_rates.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.created_at
	 * @param createdAt  the value for pay_channel_standard_rates.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pay_channel_standard_rates.updated_at
	 * @return  the value of pay_channel_standard_rates.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pay_channel_standard_rates.updated_at
	 * @param updatedAt  the value for pay_channel_standard_rates.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}