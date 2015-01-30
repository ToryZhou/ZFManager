package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.City;
import java.util.List;

public interface CityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cities
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cities
	 * @mbggenerated
	 */
	int insert(City record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cities
	 * @mbggenerated
	 */
	City selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cities
	 * @mbggenerated
	 */
	List<City> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cities
	 * @mbggenerated
	 */
	int updateByPrimaryKey(City record);
}