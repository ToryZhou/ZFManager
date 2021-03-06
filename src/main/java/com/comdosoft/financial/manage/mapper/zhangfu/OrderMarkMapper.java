package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OrderMark;
import java.util.List;

public interface OrderMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_marks
	 * @mbggenerated
	 */
	int insert(OrderMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_marks
	 * @mbggenerated
	 */
	OrderMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_marks
	 * @mbggenerated
	 */
	List<OrderMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OrderMark record);
}