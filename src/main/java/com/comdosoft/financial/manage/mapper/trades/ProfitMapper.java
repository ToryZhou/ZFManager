package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.Profit;
import java.util.List;

public interface ProfitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profits
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profits
     *
     * @mbggenerated
     */
    int insert(Profit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profits
     *
     * @mbggenerated
     */
    Profit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profits
     *
     * @mbggenerated
     */
    List<Profit> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profits
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Profit record);
}