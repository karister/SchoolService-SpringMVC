package com.karister.service;

import com.karister.dao.StudentDao;
import com.karister.pojo.Student;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author karister
 * @create 2021-07-29 3:21
 */
public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student getStuInfo(String stuid) {
        return studentDao.getStuInfo(stuid);
    }

    @Override
    public void addStu(Student student) {
        studentDao.addStu(student);
        this.modifyStuid(student);
    }

    @Override
    public void modifyStuid(Student student) {
        studentDao.modifyStuid(student);
    }

    @Override
    public Student queryStuByName(String username) {
        return studentDao.queryStuByName(username);
    }

    @Override
    public Student queryStuByStuID(String stuid) {
        return studentDao.queryStuByName(stuid);
    }
}


