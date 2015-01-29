package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CustomerIntentionMark;
import java.util.List;

public interface CustomerIntentionMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated
     */
    int insert(CustomerIntentionMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated
     */
    CustomerIntentionMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated
     */
    List<CustomerIntentionMark> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CustomerIntentionMark record);
}