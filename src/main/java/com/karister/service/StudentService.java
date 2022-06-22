package com.karister.service;

import com.karister.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

/**
 * @author karister
 * @create 2021-07-29 3:20
 */
public interface StudentService {
    //根据学号查询学生信息
    Student getStuInfo(String id);

    //增加学生
    void addStu(Student student);

    //修改用户名为学号
    void modifyStuid(Student student);

    //根据用户名查找学生
    Student queryStuByName(String username);

    //根据学号查找学生
    Student queryStuByStuID(String id);
}
