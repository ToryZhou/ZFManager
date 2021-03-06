package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.PosCategory;
import java.util.List;

public interface PosCategoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pos_categories
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pos_categories
	 * @mbggenerated
	 */
	int insert(PosCategory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pos_categories
	 * @mbggenerated
	 */
	PosCategory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pos_categories
	 * @mbggenerated
	 */
	List<PosCategory> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pos_categories
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PosCategory record);
}