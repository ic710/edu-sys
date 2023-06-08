package com.buer.edusys.controller;

import com.buer.edusys.pojo.entity.StudentDO;
import com.buer.edusys.pojo.entity.StudentToCourseDO;
import com.buer.edusys.service.IStudentService;
import com.buer.edusys.service.IStudentToCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private IStudentToCourseService studentToCourseService;

    @PostMapping("/detail")
    public void detail(Long id) {
        studentService.getById(id);
    }

    @PostMapping("/save")
    public Object save(@RequestBody StudentDO studentDO) {
        studentService.saveOrUpdate(studentDO);
        return null;
    }

    @PostMapping("/delete")
    public  void delete(Long id) {
        studentService.removeById(id);
    }

    @PostMapping("/course-enter")
    public void courseEnter(@RequestBody StudentToCourseDO studentCourse) {
        studentToCourseService.save(studentCourse);
    }
}
