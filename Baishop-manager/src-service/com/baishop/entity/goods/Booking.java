package com.baishop.entity.goods;

import java.io.Serializable;
import java.util.Date;

public class Booking implements Serializable {

	private static final long serialVersionUID = 4108549829017497771L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.booking_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Long bookingId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.user_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Long userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.email
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String email;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.consignee
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String consignee;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.phone
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String phone;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.goods_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Long goodsId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.goods_desc
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String goodsDesc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.goods_number
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Integer goodsNumber;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.booking_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Date bookingTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.is_dispose
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Byte isDispose;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.dispose_user
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String disposeUser;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.dispose_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private Date disposeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_booking.dispose_note
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    private String disposeNote;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.booking_id
     *
     * @return the value of bai_booking.booking_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Long getBookingId() {
        return bookingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.booking_id
     *
     * @param bookingId the value for bai_booking.booking_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.user_id
     *
     * @return the value of bai_booking.user_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.user_id
     *
     * @param userId the value for bai_booking.user_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.email
     *
     * @return the value of bai_booking.email
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.email
     *
     * @param email the value for bai_booking.email
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.consignee
     *
     * @return the value of bai_booking.consignee
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.consignee
     *
     * @param consignee the value for bai_booking.consignee
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.phone
     *
     * @return the value of bai_booking.phone
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.phone
     *
     * @param phone the value for bai_booking.phone
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.goods_id
     *
     * @return the value of bai_booking.goods_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.goods_id
     *
     * @param goodsId the value for bai_booking.goods_id
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.goods_desc
     *
     * @return the value of bai_booking.goods_desc
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.goods_desc
     *
     * @param goodsDesc the value for bai_booking.goods_desc
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.goods_number
     *
     * @return the value of bai_booking.goods_number
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.goods_number
     *
     * @param goodsNumber the value for bai_booking.goods_number
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.booking_time
     *
     * @return the value of bai_booking.booking_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Date getBookingTime() {
        return bookingTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.booking_time
     *
     * @param bookingTime the value for bai_booking.booking_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.is_dispose
     *
     * @return the value of bai_booking.is_dispose
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Byte getIsDispose() {
        return isDispose;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.is_dispose
     *
     * @param isDispose the value for bai_booking.is_dispose
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setIsDispose(Byte isDispose) {
        this.isDispose = isDispose;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.dispose_user
     *
     * @return the value of bai_booking.dispose_user
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getDisposeUser() {
        return disposeUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.dispose_user
     *
     * @param disposeUser the value for bai_booking.dispose_user
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setDisposeUser(String disposeUser) {
        this.disposeUser = disposeUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.dispose_time
     *
     * @return the value of bai_booking.dispose_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public Date getDisposeTime() {
        return disposeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.dispose_time
     *
     * @param disposeTime the value for bai_booking.dispose_time
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setDisposeTime(Date disposeTime) {
        this.disposeTime = disposeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_booking.dispose_note
     *
     * @return the value of bai_booking.dispose_note
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public String getDisposeNote() {
        return disposeNote;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_booking.dispose_note
     *
     * @param disposeNote the value for bai_booking.dispose_note
     *
     * @ibatorgenerated Sun Oct 09 17:51:01 CST 2011
     */
    public void setDisposeNote(String disposeNote) {
        this.disposeNote = disposeNote;
    }
}