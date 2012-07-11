package com.baishop.entity.sale;

import java.io.Serializable;

public class Payment implements Serializable {

	private static final long serialVersionUID = 7570476570516708510L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.pay_id
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private Integer payId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.pay_type
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private Byte payType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.pay_name
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private String payName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.pay_desc
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private String payDesc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.pay_config
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private String payConfig;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.sort
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private Integer sort;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_payment.enabled
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    private Byte enabled;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.pay_id
     *
     * @return the value of bai_payment.pay_id
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public Integer getPayId() {
        return payId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.pay_id
     *
     * @param payId the value for bai_payment.pay_id
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.pay_type
     *
     * @return the value of bai_payment.pay_type
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.pay_type
     *
     * @param payType the value for bai_payment.pay_type
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.pay_name
     *
     * @return the value of bai_payment.pay_name
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.pay_name
     *
     * @param payName the value for bai_payment.pay_name
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.pay_desc
     *
     * @return the value of bai_payment.pay_desc
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public String getPayDesc() {
        return payDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.pay_desc
     *
     * @param payDesc the value for bai_payment.pay_desc
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.pay_config
     *
     * @return the value of bai_payment.pay_config
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public String getPayConfig() {
        return payConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.pay_config
     *
     * @param payConfig the value for bai_payment.pay_config
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setPayConfig(String payConfig) {
        this.payConfig = payConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.sort
     *
     * @return the value of bai_payment.sort
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.sort
     *
     * @param sort the value for bai_payment.sort
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_payment.enabled
     *
     * @return the value of bai_payment.enabled
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_payment.enabled
     *
     * @param enabled the value for bai_payment.enabled
     *
     * @ibatorgenerated Sun Oct 09 16:50:58 CST 2011
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}