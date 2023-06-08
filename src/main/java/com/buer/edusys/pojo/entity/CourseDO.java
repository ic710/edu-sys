package com.buer.edusys.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import com.buer.edusys.pojo.entity.base.BaseDO;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Getter
@Setter
@TableName("course")
public class CourseDO extends BaseDO{

    @TableField("student_id")
    private Long studentId;

    @TableField("course_id")
    private Long courseId;

    @TableField("start")
    private LocalDateTime start;

    @TableField("end")
    private LocalDateTime end;

    /**
     * 课程名
     * */
    @TableField("name")
    private String name;

    /**
     * 学科
     * */
    @TableField("subject")
    private String subject;

    /**
     * 学周
     * */
    @TableField("duration")
    private Byte duration;

    /**
     * 星期几 （0-6）
     * */
    @TableField("day_of_week")
    private Byte dayOfWeek;

    /**
     * 单节课学时
     * */
    @TableField("class_period")
    private Integer classPeriod;

}
