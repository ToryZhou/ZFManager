package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class DictionaryCardType {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_card_types.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_card_types.card_type
	 * @mbggenerated
	 */
	private String cardType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_card_types.created_at
	 * @mbggenerated
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_card_types.id
	 * @return  the value of dictionary_card_types.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_card_types.id
	 * @param id  the value for dictionary_card_types.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_card_types.card_type
	 * @return  the value of dictionary_card_types.card_type
	 * @mbggenerated
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_card_types.card_type
	 * @param cardType  the value for dictionary_card_types.card_type
	 * @mbggenerated
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_card_types.created_at
	 * @return  the value of dictionary_card_types.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_card_types.created_at
	 * @param createdAt  the value for dictionary_card_types.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}