package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CsChangelMark {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.cs_changel_id
     *
     * @mbggenerated
     */
    private Integer csChangelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.custom_id
     *
     * @mbggenerated
     */
    private Integer customId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.created_at
     *
     * @mbggenerated
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.id
     *
     * @return the value of cs_changel_marks.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.id
     *
     * @param id the value for cs_changel_marks.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.cs_changel_id
     *
     * @return the value of cs_changel_marks.cs_changel_id
     *
     * @mbggenerated
     */
    public Integer getCsChangelId() {
        return csChangelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.cs_changel_id
     *
     * @param csChangelId the value for cs_changel_marks.cs_changel_id
     *
     * @mbggenerated
     */
    public void setCsChangelId(Integer csChangelId) {
        this.csChangelId = csChangelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.custom_id
     *
     * @return the value of cs_changel_marks.custom_id
     *
     * @mbggenerated
     */
    public Integer getCustomId() {
        return customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.custom_id
     *
     * @param customId the value for cs_changel_marks.custom_id
     *
     * @mbggenerated
     */
    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.content
     *
     * @return the value of cs_changel_marks.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.content
     *
     * @param content the value for cs_changel_marks.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.created_at
     *
     * @return the value of cs_changel_marks.created_at
     *
     * @mbggenerated
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.created_at
     *
     * @param createdAt the value for cs_changel_marks.created_at
     *
     * @mbggenerated
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}