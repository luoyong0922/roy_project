package com.etc.entity;

import org.springframework.stereotype.Component;

public class Courseinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.courseid
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private Integer courseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.course
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private String course;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.grade
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private String grade;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.price
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.sum
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private Integer sum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_courseinfo.teaname
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    private String teaname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.courseid
     *
     * @return the value of t_courseinfo.courseid
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.courseid
     *
     * @param courseid the value for t_courseinfo.courseid
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.course
     *
     * @return the value of t_courseinfo.course
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public String getCourse() {
        return course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.course
     *
     * @param course the value for t_courseinfo.course
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.grade
     *
     * @return the value of t_courseinfo.grade
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.grade
     *
     * @param grade the value for t_courseinfo.grade
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.price
     *
     * @return the value of t_courseinfo.price
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.price
     *
     * @param price the value for t_courseinfo.price
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.sum
     *
     * @return the value of t_courseinfo.sum
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.sum
     *
     * @param sum the value for t_courseinfo.sum
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_courseinfo.teaname
     *
     * @return the value of t_courseinfo.teaname
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public String getTeaname() {
        return teaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_courseinfo.teaname
     *
     * @param teaname the value for t_courseinfo.teaname
     *
     * @mbg.generated Thu Sep 20 13:58:20 CST 2018
     */
    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
    }

    public Courseinfo() {
    }

    public Courseinfo(String course, String grade, String teaname) {
        this.course = course;
        this.grade = grade;
        this.teaname = teaname;
    }

    @Override
    public String toString() {
        return "Courseinfo{" +
                "courseid=" + courseid +
                ", course='" + course + '\'' +
                ", grade='" + grade + '\'' +
                ", price=" + price +
                ", sum=" + sum +
                ", teaname='" + teaname + '\'' +
                '}';
    }

    //
//    public void setCourse(Teacher teacher) {
//    }
//
//    public void setGrade(Teacher teacher) {
//    }
}