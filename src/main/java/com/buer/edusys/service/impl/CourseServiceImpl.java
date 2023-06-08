package com.buer.edusys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buer.edusys.mapper.CourseMapper;
import com.buer.edusys.pojo.entity.CourseDO;
import com.buer.edusys.pojo.query.CourseEntryQuery;
import com.buer.edusys.pojo.query.CurriclumQuery;
import com.buer.edusys.service.ICourseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, CourseDO> implements ICourseService {

    @Override
    public void listByStudentId(CurriclumQuery query) {
        baseMapper.listByStudentId(query);
    }

    @Override
    public void entryByQuery(CourseEntryQuery query) throws Exception {
        CourseDO courseDO = getOne(new LambdaQueryWrapper<CourseDO>()
                .eq(CourseDO::getId, query.getCourseId()));
        if (BeanUtil.isEmpty(courseDO)) {
            throw new Exception("Not find the course!");
        }

        LocalDateTime startTime = courseDO.getStart();
        for (int i = 0; i < courseDO.getDuration(); i++) {

        }

    }

}
