package com.comdosoft.financial.manage.domain.zhangfu;

public class Menu {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menus.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menus.menu_name
	 * @mbggenerated
	 */
	private String menuName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menus.parent_id
	 * @mbggenerated
	 */
	private Integer parentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menus.menu_url
	 * @mbggenerated
	 */
	private String menuUrl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menus.id
	 * @return  the value of menus.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menus.id
	 * @param id  the value for menus.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menus.menu_name
	 * @return  the value of menus.menu_name
	 * @mbggenerated
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menus.menu_name
	 * @param menuName  the value for menus.menu_name
	 * @mbggenerated
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menus.parent_id
	 * @return  the value of menus.parent_id
	 * @mbggenerated
	 */
	public Integer getParentId() {
		return parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menus.parent_id
	 * @param parentId  the value for menus.parent_id
	 * @mbggenerated
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menus.menu_url
	 * @return  the value of menus.menu_url
	 * @mbggenerated
	 */
	public String getMenuUrl() {
		return menuUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menus.menu_url
	 * @param menuUrl  the value for menus.menu_url
	 * @mbggenerated
	 */
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
}