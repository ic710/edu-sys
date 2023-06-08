package com.buer.edusys.controller;

import com.buer.edusys.pojo.entity.TeacherDO;
import com.buer.edusys.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Controller
@RequestMapping("/teacherDO")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @PostMapping("/detail")
    public void detail(Long id) {
        teacherService.getById(id);
    }

    @PostMapping("/save")
    public Object save(@RequestBody TeacherDO teacherDO) {
        teacherService.saveOrUpdate(teacherDO);
        return null;
    }

    @PostMapping("/delete")
    public void delete(Long id) {
        teacherService.removeById(id);
    }
}
