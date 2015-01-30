package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.DictionaryReplaceReason;
import java.util.List;

public interface DictionaryReplaceReasonMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_replace_reasons
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_replace_reasons
	 * @mbggenerated
	 */
	int insert(DictionaryReplaceReason record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_replace_reasons
	 * @mbggenerated
	 */
	DictionaryReplaceReason selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_replace_reasons
	 * @mbggenerated
	 */
	List<DictionaryReplaceReason> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_replace_reasons
	 * @mbggenerated
	 */
	int updateByPrimaryKey(DictionaryReplaceReason record);
}