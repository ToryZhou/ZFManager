package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.ExchangeGoodsRecord;
import java.util.List;

public interface ExchangeGoodsRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table exchange_goods_records
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table exchange_goods_records
	 * @mbggenerated
	 */
	int insert(ExchangeGoodsRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table exchange_goods_records
	 * @mbggenerated
	 */
	ExchangeGoodsRecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table exchange_goods_records
	 * @mbggenerated
	 */
	List<ExchangeGoodsRecord> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table exchange_goods_records
	 * @mbggenerated
	 */
	int updateByPrimaryKey(ExchangeGoodsRecord record);
}