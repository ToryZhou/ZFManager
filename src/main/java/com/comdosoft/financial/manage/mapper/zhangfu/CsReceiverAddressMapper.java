package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsReceiverAddress;
import java.util.List;

public interface CsReceiverAddressMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_receiver_addresses
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_receiver_addresses
	 * @mbggenerated
	 */
	int insert(CsReceiverAddress record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_receiver_addresses
	 * @mbggenerated
	 */
	CsReceiverAddress selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_receiver_addresses
	 * @mbggenerated
	 */
	List<CsReceiverAddress> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_receiver_addresses
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsReceiverAddress record);
}