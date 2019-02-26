package com.roy.mapper;


import java.util.List;

import com.roy.model.HomeWork;
import com.roy.model.HomeWorkExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    long countByExample(HomeWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int deleteByExample(HomeWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int insert(HomeWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int insertSelective(HomeWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    List<HomeWork> selectByExample(HomeWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    HomeWork selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") HomeWork record, @Param("example") HomeWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HomeWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_homework
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HomeWork record);
}