package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsRepairMark;
import java.util.List;

public interface CsRepairMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repair_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repair_marks
	 * @mbggenerated
	 */
	int insert(CsRepairMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repair_marks
	 * @mbggenerated
	 */
	CsRepairMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repair_marks
	 * @mbggenerated
	 */
	List<CsRepairMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_repair_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsRepairMark record);
}