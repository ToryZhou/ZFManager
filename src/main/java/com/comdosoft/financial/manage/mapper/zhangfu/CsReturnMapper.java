package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsReturn;
import java.util.List;

public interface CsReturnMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_returns
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_returns
	 * @mbggenerated
	 */
	int insert(CsReturn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_returns
	 * @mbggenerated
	 */
	CsReturn selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_returns
	 * @mbggenerated
	 */
	List<CsReturn> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_returns
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsReturn record);
}