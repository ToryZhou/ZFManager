package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.TerminalMark;
import java.util.List;

public interface TerminalMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table terminal_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table terminal_marks
	 * @mbggenerated
	 */
	int insert(TerminalMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table terminal_marks
	 * @mbggenerated
	 */
	TerminalMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table terminal_marks
	 * @mbggenerated
	 */
	List<TerminalMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table terminal_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TerminalMark record);
}