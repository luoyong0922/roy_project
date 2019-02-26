package com.etc.dao;

import com.etc.entity.Teacher;
import com.etc.entity.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface TeacherDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    long countByExample(TeacherExample example);

////////////////////////////////////////////////////////////////////
    long countTeanameAndPassword(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int deleteByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int deleteByPrimaryKey(Integer teaid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int insert(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int insertSelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    List<Teacher> selectByExampleWithBLOBs(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    List<Teacher> selectByExample(TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    Teacher selectByPrimaryKey(Integer teaid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_teacher
     *
     * @mbg.generated Mon Sep 17 14:15:17 CST 2018
     */
    int updateByPrimaryKey(Teacher record);

//    int editinfobyid(Integer teaid);
//    int selectid(String teaname);

    //对stucount进行加一
    int updatestucount(String teaname);

    //根据teaname获取图片
    Teacher selectByTeaname(String teaname);

    List<Teacher> selectcourseAndgrade(TeacherExample example);
}