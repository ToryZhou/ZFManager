package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CsRefundMark {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_refund_marks.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_refund_marks.refund_id
	 * @mbggenerated
	 */
	private Integer refundId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_refund_marks.customer_id
	 * @mbggenerated
	 */
	private Integer customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_refund_marks.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_refund_marks.content
	 * @mbggenerated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_refund_marks.id
	 * @return  the value of cs_refund_marks.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_refund_marks.id
	 * @param id  the value for cs_refund_marks.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_refund_marks.refund_id
	 * @return  the value of cs_refund_marks.refund_id
	 * @mbggenerated
	 */
	public Integer getRefundId() {
		return refundId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_refund_marks.refund_id
	 * @param refundId  the value for cs_refund_marks.refund_id
	 * @mbggenerated
	 */
	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_refund_marks.customer_id
	 * @return  the value of cs_refund_marks.customer_id
	 * @mbggenerated
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_refund_marks.customer_id
	 * @param customerId  the value for cs_refund_marks.customer_id
	 * @mbggenerated
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_refund_marks.created_at
	 * @return  the value of cs_refund_marks.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_refund_marks.created_at
	 * @param createdAt  the value for cs_refund_marks.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_refund_marks.content
	 * @return  the value of cs_refund_marks.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_refund_marks.content
	 * @param content  the value for cs_refund_marks.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content;
	}
}