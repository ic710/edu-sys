package com.buer.edusys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buer.edusys.pojo.entity.CourseDO;
import com.buer.edusys.pojo.query.CourseEntryQuery;
import com.buer.edusys.pojo.query.CurriclumQuery;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
public interface ICourseService extends IService<CourseDO> {

    void listByStudentId(CurriclumQuery query);

    void entryByQuery(CourseEntryQuery query) throws Exception;
}
