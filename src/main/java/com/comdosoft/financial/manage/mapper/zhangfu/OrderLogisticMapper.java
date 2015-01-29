package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OrderLogistic;
import java.util.List;

public interface OrderLogisticMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_logistics
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_logistics
	 * @mbggenerated
	 */
	int insert(OrderLogistic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_logistics
	 * @mbggenerated
	 */
	OrderLogistic selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_logistics
	 * @mbggenerated
	 */
	List<OrderLogistic> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_logistics
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OrderLogistic record);
}