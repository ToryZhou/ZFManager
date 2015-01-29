package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.TerminalOpeningInfo;
import java.util.List;

public interface TerminalOpeningInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_opening_infos
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_opening_infos
     *
     * @mbggenerated
     */
    int insert(TerminalOpeningInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_opening_infos
     *
     * @mbggenerated
     */
    TerminalOpeningInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_opening_infos
     *
     * @mbggenerated
     */
    List<TerminalOpeningInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table terminal_opening_infos
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TerminalOpeningInfo record);
}