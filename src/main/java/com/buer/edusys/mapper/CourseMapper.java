package com.buer.edusys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buer.edusys.pojo.entity.CourseDO;
import com.buer.edusys.pojo.query.CurriclumQuery;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
public interface CourseMapper extends BaseMapper<CourseDO> {

    void listByStudentId(CurriclumQuery query);
}
