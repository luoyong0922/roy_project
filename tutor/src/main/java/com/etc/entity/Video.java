package com.etc.entity;

public class Video {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.videoid
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    private Integer videoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.vaddress
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    private String vaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.vcategory
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    private String vcategory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.videoid
     *
     * @return the value of t_video.videoid
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public Integer getVideoid() {
        return videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.videoid
     *
     * @param videoid the value for t_video.videoid
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.vaddress
     *
     * @return the value of t_video.vaddress
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public String getVaddress() {
        return vaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.vaddress
     *
     * @param vaddress the value for t_video.vaddress
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public void setVaddress(String vaddress) {
        this.vaddress = vaddress == null ? null : vaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.vcategory
     *
     * @return the value of t_video.vcategory
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public String getVcategory() {
        return vcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.vcategory
     *
     * @param vcategory the value for t_video.vcategory
     *
     * @mbg.generated Mon Sep 17 14:15:18 CST 2018
     */
    public void setVcategory(String vcategory) {
        this.vcategory = vcategory == null ? null : vcategory.trim();
    }
}