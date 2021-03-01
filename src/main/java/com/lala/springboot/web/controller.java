package com.lala.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lala.model.Student;
import com.lala.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;
    @RequestMapping("student")
    public String query(Model model, Integer id){
        Student student=studentService.queryStudent(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }
    @GetMapping("count")
    public String count(Model model){
        Integer count=studentService.studentCount();
        model.addAttribute("count",count);
        return "studentDetail";
    }
}
