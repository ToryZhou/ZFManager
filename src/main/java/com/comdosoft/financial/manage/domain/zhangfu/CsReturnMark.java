package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CsReturnMark {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_return_marks.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_return_marks.cs_return_id
     *
     * @mbggenerated
     */
    private Integer csReturnId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_return_marks.customer_id
     *
     * @mbggenerated
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_return_marks.created_at
     *
     * @mbggenerated
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_return_marks.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_return_marks.id
     *
     * @return the value of cs_return_marks.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_return_marks.id
     *
     * @param id the value for cs_return_marks.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_return_marks.cs_return_id
     *
     * @return the value of cs_return_marks.cs_return_id
     *
     * @mbggenerated
     */
    public Integer getCsReturnId() {
        return csReturnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_return_marks.cs_return_id
     *
     * @param csReturnId the value for cs_return_marks.cs_return_id
     *
     * @mbggenerated
     */
    public void setCsReturnId(Integer csReturnId) {
        this.csReturnId = csReturnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_return_marks.customer_id
     *
     * @return the value of cs_return_marks.customer_id
     *
     * @mbggenerated
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_return_marks.customer_id
     *
     * @param customerId the value for cs_return_marks.customer_id
     *
     * @mbggenerated
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_return_marks.created_at
     *
     * @return the value of cs_return_marks.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_return_marks.created_at
     *
     * @param createdAt the value for cs_return_marks.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_return_marks.content
     *
     * @return the value of cs_return_marks.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_return_marks.content
     *
     * @param content the value for cs_return_marks.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }
}