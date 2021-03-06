package com.roy.model;

public class Subject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.subject_id
     *
     * @mbg.generated
     */
    private String subjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.teac_course_id
     *
     * @mbg.generated
     */
    private Long teacCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.exam_id
     *
     * @mbg.generated
     */
    private Integer examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.dificult
     *
     * @mbg.generated
     */
    private String dificult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_subject.answer
     *
     * @mbg.generated
     */
    private String answer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.id
     *
     * @return the value of t_subject.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.id
     *
     * @param id the value for t_subject.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.subject_id
     *
     * @return the value of t_subject.subject_id
     *
     * @mbg.generated
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.subject_id
     *
     * @param subjectId the value for t_subject.subject_id
     *
     * @mbg.generated
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.teac_course_id
     *
     * @return the value of t_subject.teac_course_id
     *
     * @mbg.generated
     */
    public Long getTeacCourseId() {
        return teacCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.teac_course_id
     *
     * @param teacCourseId the value for t_subject.teac_course_id
     *
     * @mbg.generated
     */
    public void setTeacCourseId(Long teacCourseId) {
        this.teacCourseId = teacCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.exam_id
     *
     * @return the value of t_subject.exam_id
     *
     * @mbg.generated
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.exam_id
     *
     * @param examId the value for t_subject.exam_id
     *
     * @mbg.generated
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.title
     *
     * @return the value of t_subject.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.title
     *
     * @param title the value for t_subject.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.dificult
     *
     * @return the value of t_subject.dificult
     *
     * @mbg.generated
     */
    public String getDificult() {
        return dificult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.dificult
     *
     * @param dificult the value for t_subject.dificult
     *
     * @mbg.generated
     */
    public void setDificult(String dificult) {
        this.dificult = dificult == null ? null : dificult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_subject.answer
     *
     * @return the value of t_subject.answer
     *
     * @mbg.generated
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_subject.answer
     *
     * @param answer the value for t_subject.answer
     *
     * @mbg.generated
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}