package com.roy.service.serviceImpl;

import com.roy.mapper.HomeWorkMapper;
import com.roy.mapper.StuCourseMapper;
import com.roy.mapper.StudentMapper;
import com.roy.model.*;
import com.roy.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentDao;
    @Resource
    private StuCourseMapper stuCourseDao;
    @Resource
    private HomeWorkMapper homeWorkDao;

    /**
     * 根据学号查询学生信息
     * @param stuNum
     * @return
     */
    @Override
    public Student selectByAccount(String stuNum) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStuNumEqualTo(stuNum);
        List<Student> students = studentDao.selectByExample(example);
        Student student = new Student();
        if(students.size()>0){
            student = students.get(0);
        }
        return student;
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateByPrimaryKeySelective(student)>0;
    }

    /**
     * 根据 学生ID 和 教师课程ID 查询 学生课程信息
     * @param stuCourse
     * @return
     */
    @Override
    public List searchStuCourse(StuCourse stuCourse) {
        StuCourseExample example = new StuCourseExample();
        StuCourseExample.Criteria criteria = example.createCriteria();
        criteria.andTeacCourseIdEqualTo(stuCourse.getTeacCourseId()).andStuIdEqualTo(stuCourse.getStuId());
        return stuCourseDao.selectByExample(example);
    }

    /**
     * 添加学生课程信息
     * @param stuCourse
     * @return
     */
    @Override
    public boolean addStuCourse(StuCourse stuCourse) {
        return stuCourseDao.insertSelective(stuCourse)>0;
    }

    /**
     * 根据教师课程id查询最新作业信息
     * @param teacCourseId
     * @return
     */
    @Override
    public HomeWork getHomeWorkByTcId(Long teacCourseId){
        HomeWork homeWork = new HomeWork();
        HomeWorkExample example = new HomeWorkExample();
        HomeWorkExample.Criteria criteria = example.createCriteria();
        criteria.andTeacCourseIdEqualTo(teacCourseId);
        List<HomeWork> homeWorkList = homeWorkDao.selectByExample(example);
        if(homeWorkList.size()>0){
            homeWork = homeWorkList.get(homeWorkList.size()-1);
        }
        return homeWork;
    }

}
