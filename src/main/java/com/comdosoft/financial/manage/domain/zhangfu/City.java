package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class City {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.parent_id
	 * @mbggenerated
	 */
	private Integer parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.sort_index
	 * @mbggenerated
	 */
	private Integer sortIndex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.pinyin
	 * @mbggenerated
	 */
	private String pinyin;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cities.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.id
	 * @return  the value of cities.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.id
	 * @param id  the value for cities.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.name
	 * @return  the value of cities.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.name
	 * @param name  the value for cities.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.parent_id
	 * @return  the value of cities.parent_id
	 * @mbggenerated
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.parent_id
	 * @param parentId  the value for cities.parent_id
	 * @mbggenerated
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.sort_index
	 * @return  the value of cities.sort_index
	 * @mbggenerated
	 */
	public Integer getSortIndex() {
		return sortIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.sort_index
	 * @param sortIndex  the value for cities.sort_index
	 * @mbggenerated
	 */
	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.pinyin
	 * @return  the value of cities.pinyin
	 * @mbggenerated
	 */
	public String getPinyin() {
		return pinyin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.pinyin
	 * @param pinyin  the value for cities.pinyin
	 * @mbggenerated
	 */
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.created_at
	 * @return  the value of cities.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.created_at
	 * @param createdAt  the value for cities.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cities.updated_at
	 * @return  the value of cities.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cities.updated_at
	 * @param updatedAt  the value for cities.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	private City parentCity;

    public City getParentCity() {
        return parentCity;
    }

    public void setParentCity(City parentCity) {
        this.parentCity = parentCity;
    }
}