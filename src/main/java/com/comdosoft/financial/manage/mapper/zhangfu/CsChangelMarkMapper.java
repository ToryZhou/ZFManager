package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsChangelMark;
import java.util.List;

public interface CsChangelMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated
     */
    int insert(CsChangelMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated
     */
    CsChangelMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated
     */
    List<CsChangelMark> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CsChangelMark record);
}