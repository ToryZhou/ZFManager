package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.DictionaryReturnReason;
import java.util.List;

public interface DictionaryReturnReasonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_return_reasons
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_return_reasons
     *
     * @mbggenerated
     */
    int insert(DictionaryReturnReason record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_return_reasons
     *
     * @mbggenerated
     */
    DictionaryReturnReason selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_return_reasons
     *
     * @mbggenerated
     */
    List<DictionaryReturnReason> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_return_reasons
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DictionaryReturnReason record);
}