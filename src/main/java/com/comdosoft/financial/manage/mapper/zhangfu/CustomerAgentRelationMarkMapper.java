package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CustomerAgentRelationMark;
import java.util.List;

public interface CustomerAgentRelationMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_agent_relation_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_agent_relation_marks
	 * @mbggenerated
	 */
	int insert(CustomerAgentRelationMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_agent_relation_marks
	 * @mbggenerated
	 */
	CustomerAgentRelationMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_agent_relation_marks
	 * @mbggenerated
	 */
	List<CustomerAgentRelationMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_agent_relation_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CustomerAgentRelationMark record);
}