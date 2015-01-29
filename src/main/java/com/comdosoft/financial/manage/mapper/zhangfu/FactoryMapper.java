package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Factory;
import java.util.List;

public interface FactoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factories
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factories
	 * @mbggenerated
	 */
	int insert(Factory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factories
	 * @mbggenerated
	 */
	Factory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factories
	 * @mbggenerated
	 */
	List<Factory> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table factories
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Factory record);
}