package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.AgentGoodName;
import java.util.List;

public interface AgentGoodNameMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agent_good_names
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agent_good_names
	 * @mbggenerated
	 */
	int insert(AgentGoodName record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agent_good_names
	 * @mbggenerated
	 */
	AgentGoodName selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agent_good_names
	 * @mbggenerated
	 */
	List<AgentGoodName> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table agent_good_names
	 * @mbggenerated
	 */
	int updateByPrimaryKey(AgentGoodName record);
}