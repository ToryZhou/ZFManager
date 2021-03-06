package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.SysShufflingFigure;
import java.util.List;

public interface SysShufflingFigureMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_shuffling_figures
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_shuffling_figures
	 * @mbggenerated
	 */
	int insert(SysShufflingFigure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_shuffling_figures
	 * @mbggenerated
	 */
	SysShufflingFigure selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_shuffling_figures
	 * @mbggenerated
	 */
	List<SysShufflingFigure> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_shuffling_figures
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SysShufflingFigure record);
}