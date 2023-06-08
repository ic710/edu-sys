package com.buer.edusys.controller;

import com.buer.edusys.pojo.entity.CourseDO;
import com.buer.edusys.pojo.query.CourseEntryQuery;
import com.buer.edusys.pojo.query.CurriclumQuery;
import com.buer.edusys.service.ICourseLayoutService;
import com.buer.edusys.service.ICourseService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Log4j2
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping("detail")
    private void detail(Long id) {
        courseService.getById(id);
    }

    @PostMapping("save")
    private Object save(@RequestBody CourseDO courseDO) {
        courseService.saveOrUpdate(courseDO);
        return null;
    }

    @PostMapping("delete")
    private void delete(Long id) {
        courseService.removeById(id);
    }


    @PostMapping("/list/student-id")
    public Object listByStudentId(@RequestBody CurriclumQuery query){
        courseService.listByStudentId(query);
        return null;
    }

    @PostMapping("/entry/query")
    public void entryByQuery(@RequestBody CourseEntryQuery query) {
        try {
            courseService.entryByQuery(query);
        } catch (Exception e) {
            log.error("{}", e);
        }
    }
}
