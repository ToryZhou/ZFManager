package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OrderReceiverAddress;
import java.util.List;

public interface OrderReceiverAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_receiver_addresses
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_receiver_addresses
     *
     * @mbggenerated
     */
    int insert(OrderReceiverAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_receiver_addresses
     *
     * @mbggenerated
     */
    OrderReceiverAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_receiver_addresses
     *
     * @mbggenerated
     */
    List<OrderReceiverAddress> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_receiver_addresses
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderReceiverAddress record);
}