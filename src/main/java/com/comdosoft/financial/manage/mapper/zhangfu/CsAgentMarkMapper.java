package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsAgentMark;
import java.util.List;

public interface CsAgentMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_agent_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_agent_marks
	 * @mbggenerated
	 */
	int insert(CsAgentMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_agent_marks
	 * @mbggenerated
	 */
	CsAgentMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_agent_marks
	 * @mbggenerated
	 */
	List<CsAgentMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_agent_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsAgentMark record);
}