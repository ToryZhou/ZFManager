package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsRepair;
import java.util.List;

public interface CsRepairMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repairs
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repairs
	 * @mbggenerated
	 */
	int insert(CsRepair record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repairs
	 * @mbggenerated
	 */
	CsRepair selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repairs
	 * @mbggenerated
	 */
	List<CsRepair> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repairs
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsRepair record);
}