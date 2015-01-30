package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import java.util.List;

public interface CustomerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int insert(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	Customer selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	List<Customer> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Customer record);
	
	Customer selectByLogin(String passport,String password);
}