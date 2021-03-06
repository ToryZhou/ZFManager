package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Good;
import com.comdosoft.financial.manage.utils.page.PageRequest;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated
	 */
	int insert(Good record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated
	 */
	Good selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated
	 */
	List<Good> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Good record);

	List<Good> findPageGoodsByKeys(@Param("pageRequest") PageRequest pageRequest,
			@Param("status") Byte status, @Param("keys") String keys);
			
	long countByKeys(@Param("status") Byte status, @Param("keys") String keys);
	
	Good findGoodInfo(Integer id);
	
	Good findPageRowGood(Integer id);

	List<Good> selectByStatusAndName(@Param("status") Byte status, @Param("keys") String keys);

    long countByCategoryId(Integer categoryId);

    List<Good> selectRelativeGoods(Integer goodId);

    Good findGoodLazyInfo(Integer id);

}