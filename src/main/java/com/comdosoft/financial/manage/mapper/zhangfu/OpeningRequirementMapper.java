package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OpeningRequirement;
import java.util.List;

public interface OpeningRequirementMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table opening_requirements
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table opening_requirements
	 * @mbggenerated
	 */
	int insert(OpeningRequirement record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table opening_requirements
	 * @mbggenerated
	 */
	OpeningRequirement selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table opening_requirements
	 * @mbggenerated
	 */
	List<OpeningRequirement> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table opening_requirements
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OpeningRequirement record);
}