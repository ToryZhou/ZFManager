package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;
import java.util.List;

public class Good {
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.second_title
	 * @mbggenerated
	 */
	private String secondTitle;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.key_worlds
	 * @mbggenerated
	 */
	private String keyWorlds;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.factory_id
	 * @mbggenerated
	 */
	private Integer factoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.pos_category_id
	 * @mbggenerated
	 */
	private Integer posCategoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.model_number
	 * @mbggenerated
	 */
	private String modelNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.encrypt_card_way_id
	 * @mbggenerated
	 */
	private Integer encryptCardWayId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.sign_order_way_id
	 * @mbggenerated
	 */
	private Integer signOrderWayId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.battery_info
	 * @mbggenerated
	 */
	private String batteryInfo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.shell_material
	 * @mbggenerated
	 */
	private String shellMaterial;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.retail_price
	 * @mbggenerated
	 */
	private Integer retailPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.purchase_price
	 * @mbggenerated
	 */
	private Integer purchasePrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.floor_price
	 * @mbggenerated
	 */
	private Integer floorPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.floor_purchase_quantity
	 * @mbggenerated
	 */
	private Integer floorPurchaseQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.has_purchase
	 * @mbggenerated
	 */
	private Boolean hasPurchase;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.quantity
	 * @mbggenerated
	 */
	private Integer quantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.total_score
	 * @mbggenerated
	 */
	private Integer totalScore;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.total_comment
	 * @mbggenerated
	 */
	private Integer totalComment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.price
	 * @mbggenerated
	 */
	private Integer price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.has_lease
	 * @mbggenerated
	 */
	private Boolean hasLease;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.lease_price
	 * @mbggenerated
	 */
	private Integer leasePrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.lease_time
	 * @mbggenerated
	 */
	private Integer leaseTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.status
	 * @mbggenerated
	 */
	private Byte status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.is_published
	 * @mbggenerated
	 */
	private Boolean isPublished;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.good_brands_id
	 * @mbggenerated
	 */
	private Integer goodBrandsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.created_user_id
	 * @mbggenerated
	 */
	private Integer createdUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.created_user_type
	 * @mbggenerated
	 */
	private Byte createdUserType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.belongs_to
	 * @mbggenerated
	 */
	private Integer belongsTo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.published_at
	 * @mbggenerated
	 */
	private Date publishedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.volume_number
	 * @mbggenerated
	 */
	private Integer volumeNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.purchase_number
	 * @mbggenerated
	 */
	private Integer purchaseNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.lease_deposit
	 * @mbggenerated
	 */
	private Integer leaseDeposit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.return_time
	 * @mbggenerated
	 */
	private Integer returnTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.description
	 * @mbggenerated
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.lease_description
	 * @mbggenerated
	 */
	private String leaseDescription;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.lease_agreement
	 * @mbggenerated
	 */
	private String leaseAgreement;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.id
	 * @return  the value of goods.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.id
	 * @param id  the value for goods.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.title
	 * @return  the value of goods.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.title
	 * @param title  the value for goods.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.second_title
	 * @return  the value of goods.second_title
	 * @mbggenerated
	 */
	public String getSecondTitle() {
		return secondTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.second_title
	 * @param secondTitle  the value for goods.second_title
	 * @mbggenerated
	 */
	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.key_worlds
	 * @return  the value of goods.key_worlds
	 * @mbggenerated
	 */
	public String getKeyWorlds() {
		return keyWorlds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.key_worlds
	 * @param keyWorlds  the value for goods.key_worlds
	 * @mbggenerated
	 */
	public void setKeyWorlds(String keyWorlds) {
		this.keyWorlds = keyWorlds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.factory_id
	 * @return  the value of goods.factory_id
	 * @mbggenerated
	 */
	public Integer getFactoryId() {
		return factoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.factory_id
	 * @param factoryId  the value for goods.factory_id
	 * @mbggenerated
	 */
	public void setFactoryId(Integer factoryId) {
		this.factoryId = factoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.pos_category_id
	 * @return  the value of goods.pos_category_id
	 * @mbggenerated
	 */
	public Integer getPosCategoryId() {
		return posCategoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.pos_category_id
	 * @param posCategoryId  the value for goods.pos_category_id
	 * @mbggenerated
	 */
	public void setPosCategoryId(Integer posCategoryId) {
		this.posCategoryId = posCategoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.model_number
	 * @return  the value of goods.model_number
	 * @mbggenerated
	 */
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.model_number
	 * @param modelNumber  the value for goods.model_number
	 * @mbggenerated
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.encrypt_card_way_id
	 * @return  the value of goods.encrypt_card_way_id
	 * @mbggenerated
	 */
	public Integer getEncryptCardWayId() {
		return encryptCardWayId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.encrypt_card_way_id
	 * @param encryptCardWayId  the value for goods.encrypt_card_way_id
	 * @mbggenerated
	 */
	public void setEncryptCardWayId(Integer encryptCardWayId) {
		this.encryptCardWayId = encryptCardWayId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.sign_order_way_id
	 * @return  the value of goods.sign_order_way_id
	 * @mbggenerated
	 */
	public Integer getSignOrderWayId() {
		return signOrderWayId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.sign_order_way_id
	 * @param signOrderWayId  the value for goods.sign_order_way_id
	 * @mbggenerated
	 */
	public void setSignOrderWayId(Integer signOrderWayId) {
		this.signOrderWayId = signOrderWayId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.battery_info
	 * @return  the value of goods.battery_info
	 * @mbggenerated
	 */
	public String getBatteryInfo() {
		return batteryInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.battery_info
	 * @param batteryInfo  the value for goods.battery_info
	 * @mbggenerated
	 */
	public void setBatteryInfo(String batteryInfo) {
		this.batteryInfo = batteryInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.shell_material
	 * @return  the value of goods.shell_material
	 * @mbggenerated
	 */
	public String getShellMaterial() {
		return shellMaterial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.shell_material
	 * @param shellMaterial  the value for goods.shell_material
	 * @mbggenerated
	 */
	public void setShellMaterial(String shellMaterial) {
		this.shellMaterial = shellMaterial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.retail_price
	 * @return  the value of goods.retail_price
	 * @mbggenerated
	 */
	public Integer getRetailPrice() {
		return retailPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.retail_price
	 * @param retailPrice  the value for goods.retail_price
	 * @mbggenerated
	 */
	public void setRetailPrice(Integer retailPrice) {
		this.retailPrice = retailPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.purchase_price
	 * @return  the value of goods.purchase_price
	 * @mbggenerated
	 */
	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.purchase_price
	 * @param purchasePrice  the value for goods.purchase_price
	 * @mbggenerated
	 */
	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.floor_price
	 * @return  the value of goods.floor_price
	 * @mbggenerated
	 */
	public Integer getFloorPrice() {
		return floorPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.floor_price
	 * @param floorPrice  the value for goods.floor_price
	 * @mbggenerated
	 */
	public void setFloorPrice(Integer floorPrice) {
		this.floorPrice = floorPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.floor_purchase_quantity
	 * @return  the value of goods.floor_purchase_quantity
	 * @mbggenerated
	 */
	public Integer getFloorPurchaseQuantity() {
		return floorPurchaseQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.floor_purchase_quantity
	 * @param floorPurchaseQuantity  the value for goods.floor_purchase_quantity
	 * @mbggenerated
	 */
	public void setFloorPurchaseQuantity(Integer floorPurchaseQuantity) {
		this.floorPurchaseQuantity = floorPurchaseQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.has_purchase
	 * @return  the value of goods.has_purchase
	 * @mbggenerated
	 */
	public Boolean getHasPurchase() {
		return hasPurchase;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.has_purchase
	 * @param hasPurchase  the value for goods.has_purchase
	 * @mbggenerated
	 */
	public void setHasPurchase(Boolean hasPurchase) {
		this.hasPurchase = hasPurchase;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.quantity
	 * @return  the value of goods.quantity
	 * @mbggenerated
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.quantity
	 * @param quantity  the value for goods.quantity
	 * @mbggenerated
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.total_score
	 * @return  the value of goods.total_score
	 * @mbggenerated
	 */
	public Integer getTotalScore() {
		return totalScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.total_score
	 * @param totalScore  the value for goods.total_score
	 * @mbggenerated
	 */
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.total_comment
	 * @return  the value of goods.total_comment
	 * @mbggenerated
	 */
	public Integer getTotalComment() {
		return totalComment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.total_comment
	 * @param totalComment  the value for goods.total_comment
	 * @mbggenerated
	 */
	public void setTotalComment(Integer totalComment) {
		this.totalComment = totalComment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.price
	 * @return  the value of goods.price
	 * @mbggenerated
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.price
	 * @param price  the value for goods.price
	 * @mbggenerated
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.has_lease
	 * @return  the value of goods.has_lease
	 * @mbggenerated
	 */
	public Boolean getHasLease() {
		return hasLease;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.has_lease
	 * @param hasLease  the value for goods.has_lease
	 * @mbggenerated
	 */
	public void setHasLease(Boolean hasLease) {
		this.hasLease = hasLease;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.lease_price
	 * @return  the value of goods.lease_price
	 * @mbggenerated
	 */
	public Integer getLeasePrice() {
		return leasePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.lease_price
	 * @param leasePrice  the value for goods.lease_price
	 * @mbggenerated
	 */
	public void setLeasePrice(Integer leasePrice) {
		this.leasePrice = leasePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.lease_time
	 * @return  the value of goods.lease_time
	 * @mbggenerated
	 */
	public Integer getLeaseTime() {
		return leaseTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.lease_time
	 * @param leaseTime  the value for goods.lease_time
	 * @mbggenerated
	 */
	public void setLeaseTime(Integer leaseTime) {
		this.leaseTime = leaseTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.status
	 * @return  the value of goods.status
	 * @mbggenerated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.status
	 * @param status  the value for goods.status
	 * @mbggenerated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.is_published
	 * @return  the value of goods.is_published
	 * @mbggenerated
	 */
	public Boolean getIsPublished() {
		return isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.is_published
	 * @param isPublished  the value for goods.is_published
	 * @mbggenerated
	 */
	public void setIsPublished(Boolean isPublished) {
		this.isPublished = isPublished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.good_brands_id
	 * @return  the value of goods.good_brands_id
	 * @mbggenerated
	 */
	public Integer getGoodBrandsId() {
		return goodBrandsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.good_brands_id
	 * @param goodBrandsId  the value for goods.good_brands_id
	 * @mbggenerated
	 */
	public void setGoodBrandsId(Integer goodBrandsId) {
		this.goodBrandsId = goodBrandsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.created_user_id
	 * @return  the value of goods.created_user_id
	 * @mbggenerated
	 */
	public Integer getCreatedUserId() {
		return createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.created_user_id
	 * @param createdUserId  the value for goods.created_user_id
	 * @mbggenerated
	 */
	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.created_user_type
	 * @return  the value of goods.created_user_type
	 * @mbggenerated
	 */
	public Byte getCreatedUserType() {
		return createdUserType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.created_user_type
	 * @param createdUserType  the value for goods.created_user_type
	 * @mbggenerated
	 */
	public void setCreatedUserType(Byte createdUserType) {
		this.createdUserType = createdUserType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.created_at
	 * @return  the value of goods.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.created_at
	 * @param createdAt  the value for goods.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.updated_at
	 * @return  the value of goods.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.updated_at
	 * @param updatedAt  the value for goods.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.belongs_to
	 * @return  the value of goods.belongs_to
	 * @mbggenerated
	 */
	public Integer getBelongsTo() {
		return belongsTo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.belongs_to
	 * @param belongsTo  the value for goods.belongs_to
	 * @mbggenerated
	 */
	public void setBelongsTo(Integer belongsTo) {
		this.belongsTo = belongsTo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.published_at
	 * @return  the value of goods.published_at
	 * @mbggenerated
	 */
	public Date getPublishedAt() {
		return publishedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.published_at
	 * @param publishedAt  the value for goods.published_at
	 * @mbggenerated
	 */
	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.volume_number
	 * @return  the value of goods.volume_number
	 * @mbggenerated
	 */
	public Integer getVolumeNumber() {
		return volumeNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.volume_number
	 * @param volumeNumber  the value for goods.volume_number
	 * @mbggenerated
	 */
	public void setVolumeNumber(Integer volumeNumber) {
		this.volumeNumber = volumeNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.purchase_number
	 * @return  the value of goods.purchase_number
	 * @mbggenerated
	 */
	public Integer getPurchaseNumber() {
		return purchaseNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.purchase_number
	 * @param purchaseNumber  the value for goods.purchase_number
	 * @mbggenerated
	 */
	public void setPurchaseNumber(Integer purchaseNumber) {
		this.purchaseNumber = purchaseNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.lease_deposit
	 * @return  the value of goods.lease_deposit
	 * @mbggenerated
	 */
	public Integer getLeaseDeposit() {
		return leaseDeposit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.lease_deposit
	 * @param leaseDeposit  the value for goods.lease_deposit
	 * @mbggenerated
	 */
	public void setLeaseDeposit(Integer leaseDeposit) {
		this.leaseDeposit = leaseDeposit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.return_time
	 * @return  the value of goods.return_time
	 * @mbggenerated
	 */
	public Integer getReturnTime() {
		return returnTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.return_time
	 * @param returnTime  the value for goods.return_time
	 * @mbggenerated
	 */
	public void setReturnTime(Integer returnTime) {
		this.returnTime = returnTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.description
	 * @return  the value of goods.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.description
	 * @param description  the value for goods.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.lease_description
	 * @return  the value of goods.lease_description
	 * @mbggenerated
	 */
	public String getLeaseDescription() {
		return leaseDescription;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.lease_description
	 * @param leaseDescription  the value for goods.lease_description
	 * @mbggenerated
	 */
	public void setLeaseDescription(String leaseDescription) {
		this.leaseDescription = leaseDescription;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.lease_agreement
	 * @return  the value of goods.lease_agreement
	 * @mbggenerated
	 */
	public String getLeaseAgreement() {
		return leaseAgreement;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.lease_agreement
	 * @param leaseAgreement  the value for goods.lease_agreement
	 * @mbggenerated
	 */
	public void setLeaseAgreement(String leaseAgreement) {
		this.leaseAgreement = leaseAgreement;
	}

	public static final byte STATUS_WAITING_FIRST_CHECK = 1;	// 待审核
	public static final byte STATUS_FIRST_UN_CHECKED = 2;	// 初审不通过
	public static final byte STATUS_FIRST_CHECKED = 3;		// 初审通过
	public static final byte STATUS_UN_CHECKED = 4;			// 审核不通过
	public static final byte STATUS_CHECKED = 5;				// 正常
	public static final byte STATUS_STOP = 6;				// 已停用

	private Factory factory;
	private PosCategory posCategory;
	private GoodBrand goodBrand;
	private DictionarySignOrderWay signOrderWay;
	private DictionaryEncryptCardWay encryptCardWay;
	private List<PayChannel> channels;
	private List<GoodsPicture> pictures;
	private List<DictionaryCardType> cardTypes;
	private List<Good> relativeGoods;

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public PosCategory getPosCategory() {
		return posCategory;
	}

	public void setPosCategory(PosCategory posCategory) {
		this.posCategory = posCategory;
	}

	public GoodBrand getGoodBrand() {
		return goodBrand;
	}

	public void setGoodBrand(GoodBrand goodBrand) {
		this.goodBrand = goodBrand;
	}

	public DictionarySignOrderWay getSignOrderWay() {
		return signOrderWay;
	}

	public void setSignOrderWay(DictionarySignOrderWay signOrderWay) {
		this.signOrderWay = signOrderWay;
	}

	public DictionaryEncryptCardWay getEncryptCardWay() {
		return encryptCardWay;
	}

	public void setEncryptCardWay(DictionaryEncryptCardWay encryptCardWay) {
		this.encryptCardWay = encryptCardWay;
	}

	public List<PayChannel> getChannels() {
		return channels;
	}
	
	public void setChannels(List<PayChannel> channels) {
		this.channels = channels;
	}

	public List<GoodsPicture> getPictures() {
		return pictures;
	}

	public void setPictures(List<GoodsPicture> pictures) {
		this.pictures = pictures;
	}

	public List<DictionaryCardType> getCardTypes() {
		return cardTypes;
	}

	public void setCardTypes(List<DictionaryCardType> cardTypes) {
		this.cardTypes = cardTypes;
	}

	public List<Good> getRelativeGoods() {
		return relativeGoods;
	}

	public void setRelativeGoods(List<Good> relativeGoods) {
		this.relativeGoods = relativeGoods;
	}
	
}