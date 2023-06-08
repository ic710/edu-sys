package com.buer.edusys.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.buer.edusys.pojo.entity.CourseLayoutDO;
import com.buer.edusys.service.ICourseLayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-02
 */
@Controller
@RequestMapping("/courseLayoutDO")
public class CourseLayoutController {

    @Autowired
    private ICourseLayoutService courseLayoutService;

    @RequestMapping("list-by-studentid")
    public void listByStudentId(Long studnetId) {
        List<CourseLayoutDO> courseLayoutDOs = courseLayoutService.list(new LambdaQueryWrapper<CourseLayoutDO>()
                .eq(CourseLayoutDO::getStudentId, studnetId));
    }

    @RequestMapping("list-by-teacherid")
    public void listByTeacherId(Long teacherId) {
        List<CourseLayoutDO> courseLayoutDOs = courseLayoutService.list(new LambdaQueryWrapper<CourseLayoutDO>()
                .eq(CourseLayoutDO::getTeacherId, teacherId));
    }

    @RequestMapping("/save")
    public void save(@RequestBody CourseLayoutDO courseLayoutDO) {
        courseLayoutService.saveOrUpdate(courseLayoutDO);
    }

    @RequestMapping("/delete")
    public void delete(Long id) {
        courseLayoutService.removeById(id);
    }
}
