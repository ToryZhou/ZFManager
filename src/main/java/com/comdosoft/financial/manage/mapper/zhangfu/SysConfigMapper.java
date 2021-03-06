package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.SysConfig;
import java.util.List;

public interface SysConfigMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated
	 */
	int insert(SysConfig record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated
	 */
	SysConfig selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated
	 */
	List<SysConfig> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_config
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SysConfig record);
}