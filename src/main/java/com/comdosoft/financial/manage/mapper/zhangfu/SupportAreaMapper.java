package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.SupportArea;
import java.util.List;

public interface SupportAreaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_areas
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_areas
	 * @mbggenerated
	 */
	int insert(SupportArea record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_areas
	 * @mbggenerated
	 */
	SupportArea selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_areas
	 * @mbggenerated
	 */
	List<SupportArea> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_areas
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SupportArea record);
}