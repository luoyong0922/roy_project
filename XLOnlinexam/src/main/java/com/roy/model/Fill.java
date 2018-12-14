package com.roy.model;

public class Fill {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.fill_id
     *
     * @mbg.generated
     */
    private String fillId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.teac_course_id
     *
     * @mbg.generated
     */
    private Long teacCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.exam_id
     *
     * @mbg.generated
     */
    private Integer examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.dificult
     *
     * @mbg.generated
     */
    private String dificult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.answer1
     *
     * @mbg.generated
     */
    private String answer1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.answer2
     *
     * @mbg.generated
     */
    private String answer2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_fill.answer3
     *
     * @mbg.generated
     */
    private String answer3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.id
     *
     * @return the value of t_fill.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.id
     *
     * @param id the value for t_fill.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.fill_id
     *
     * @return the value of t_fill.fill_id
     *
     * @mbg.generated
     */
    public String getFillId() {
        return fillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.fill_id
     *
     * @param fillId the value for t_fill.fill_id
     *
     * @mbg.generated
     */
    public void setFillId(String fillId) {
        this.fillId = fillId == null ? null : fillId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.teac_course_id
     *
     * @return the value of t_fill.teac_course_id
     *
     * @mbg.generated
     */
    public Long getTeacCourseId() {
        return teacCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.teac_course_id
     *
     * @param teacCourseId the value for t_fill.teac_course_id
     *
     * @mbg.generated
     */
    public void setTeacCourseId(Long teacCourseId) {
        this.teacCourseId = teacCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.exam_id
     *
     * @return the value of t_fill.exam_id
     *
     * @mbg.generated
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.exam_id
     *
     * @param examId the value for t_fill.exam_id
     *
     * @mbg.generated
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.title
     *
     * @return the value of t_fill.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.title
     *
     * @param title the value for t_fill.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.dificult
     *
     * @return the value of t_fill.dificult
     *
     * @mbg.generated
     */
    public String getDificult() {
        return dificult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.dificult
     *
     * @param dificult the value for t_fill.dificult
     *
     * @mbg.generated
     */
    public void setDificult(String dificult) {
        this.dificult = dificult == null ? null : dificult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.answer1
     *
     * @return the value of t_fill.answer1
     *
     * @mbg.generated
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.answer1
     *
     * @param answer1 the value for t_fill.answer1
     *
     * @mbg.generated
     */
    public void setAnswer1(String answer1) {
        this.answer1 = answer1 == null ? null : answer1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.answer2
     *
     * @return the value of t_fill.answer2
     *
     * @mbg.generated
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.answer2
     *
     * @param answer2 the value for t_fill.answer2
     *
     * @mbg.generated
     */
    public void setAnswer2(String answer2) {
        this.answer2 = answer2 == null ? null : answer2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_fill.answer3
     *
     * @return the value of t_fill.answer3
     *
     * @mbg.generated
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_fill.answer3
     *
     * @param answer3 the value for t_fill.answer3
     *
     * @mbg.generated
     */
    public void setAnswer3(String answer3) {
        this.answer3 = answer3 == null ? null : answer3.trim();
    }

    public Fill() {
    }

    public Fill(Long id, String fillId,
                Long teacCourseId, Integer examId, String title, String dificult,
                String answer1, String answer2, String answer3) {
        this.id = id;
        this.fillId = fillId;
        this.teacCourseId = teacCourseId;
        this.examId = examId;
        this.title = title;
        this.dificult = dificult;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    @Override
    public String toString() {
        return "Fill{" +
                "id=" + id +
                ", fillId='" + fillId + '\'' +
                ", teacCourseId=" + teacCourseId +
                ", examId=" + examId +
                ", title='" + title + '\'' +
                ", dificult='" + dificult + '\'' +
                ", answer1='" + answer1 + '\'' +
                ", answer2='" + answer2 + '\'' +
                ", answer3='" + answer3 + '\'' +
                '}';
    }
}