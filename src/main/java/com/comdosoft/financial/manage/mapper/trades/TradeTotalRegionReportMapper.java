package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeTotalRegionReport;
import java.util.List;

public interface TradeTotalRegionReportMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_total_region_reports
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_total_region_reports
	 * @mbggenerated
	 */
	int insert(TradeTotalRegionReport record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_total_region_reports
	 * @mbggenerated
	 */
	TradeTotalRegionReport selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_total_region_reports
	 * @mbggenerated
	 */
	List<TradeTotalRegionReport> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_total_region_reports
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TradeTotalRegionReport record);
}