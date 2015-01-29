package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CustomerIntentionMark {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.intention_id
	 * @mbggenerated
	 */
	private Integer intentionId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.custom_id
	 * @mbggenerated
	 */
	private Integer customId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.process_user_id
	 * @mbggenerated
	 */
	private Integer processUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.process_user_name
	 * @mbggenerated
	 */
	private String processUserName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_intention_marks.content
	 * @mbggenerated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.id
	 * @return  the value of customer_intention_marks.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.id
	 * @param id  the value for customer_intention_marks.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.intention_id
	 * @return  the value of customer_intention_marks.intention_id
	 * @mbggenerated
	 */
	public Integer getIntentionId() {
		return intentionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.intention_id
	 * @param intentionId  the value for customer_intention_marks.intention_id
	 * @mbggenerated
	 */
	public void setIntentionId(Integer intentionId) {
		this.intentionId = intentionId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.custom_id
	 * @return  the value of customer_intention_marks.custom_id
	 * @mbggenerated
	 */
	public Integer getCustomId() {
		return customId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.custom_id
	 * @param customId  the value for customer_intention_marks.custom_id
	 * @mbggenerated
	 */
	public void setCustomId(Integer customId) {
		this.customId = customId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.created_at
	 * @return  the value of customer_intention_marks.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.created_at
	 * @param createdAt  the value for customer_intention_marks.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.process_user_id
	 * @return  the value of customer_intention_marks.process_user_id
	 * @mbggenerated
	 */
	public Integer getProcessUserId() {
		return processUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.process_user_id
	 * @param processUserId  the value for customer_intention_marks.process_user_id
	 * @mbggenerated
	 */
	public void setProcessUserId(Integer processUserId) {
		this.processUserId = processUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.process_user_name
	 * @return  the value of customer_intention_marks.process_user_name
	 * @mbggenerated
	 */
	public String getProcessUserName() {
		return processUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.process_user_name
	 * @param processUserName  the value for customer_intention_marks.process_user_name
	 * @mbggenerated
	 */
	public void setProcessUserName(String processUserName) {
		this.processUserName = processUserName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_intention_marks.content
	 * @return  the value of customer_intention_marks.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_intention_marks.content
	 * @param content  the value for customer_intention_marks.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content;
	}
}