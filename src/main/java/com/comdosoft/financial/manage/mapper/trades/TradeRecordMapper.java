package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeRecord;
import java.util.List;

public interface TradeRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_records
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_records
	 * @mbggenerated
	 */
	int insert(TradeRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_records
	 * @mbggenerated
	 */
	TradeRecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_records
	 * @mbggenerated
	 */
	List<TradeRecord> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_records
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TradeRecord record);
}