package com.karister.controller;

import com.karister.pojo.Student;
import com.karister.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author karister
 * @create 2021-07-29 15:31
 */
@Controller
@RequestMapping("/admin")
public class RegisterController {

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    Map<String, Object> map = new HashMap<String, Object>();

    @RequestMapping("/register")
    @ResponseBody
    String register(HttpServletRequest request, HttpServletResponse response) {
        Student student = new Student();
        student.setName(request.getParameter("stuName"));
        student.setId(request.getParameter("stuid"));
        student.setFaculty(request.getParameter("faculty"));
        student.setStuClass(request.getParameter("stuClass"));
        student.setPhone(request.getParameter("phone"));
        System.out.println(student);
        studentService.addStu(student);
        return "";
    }
}
