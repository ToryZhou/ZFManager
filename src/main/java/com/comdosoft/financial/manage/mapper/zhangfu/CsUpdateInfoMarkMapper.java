package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsUpdateInfoMark;
import java.util.List;

public interface CsUpdateInfoMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_update_info_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_update_info_marks
	 * @mbggenerated
	 */
	int insert(CsUpdateInfoMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_update_info_marks
	 * @mbggenerated
	 */
	CsUpdateInfoMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_update_info_marks
	 * @mbggenerated
	 */
	List<CsUpdateInfoMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_update_info_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsUpdateInfoMark record);
}