package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.SupportTradeType;
import java.util.List;

public interface SupportTradeTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_trade_types
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_trade_types
	 * @mbggenerated
	 */
	int insert(SupportTradeType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_trade_types
	 * @mbggenerated
	 */
	SupportTradeType selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_trade_types
	 * @mbggenerated
	 */
	List<SupportTradeType> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table support_trade_types
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SupportTradeType record);
}