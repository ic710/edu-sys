package com.buer.edusys.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-02
 */
@Getter
@Setter
@TableName("course_layout")
public class CourseLayoutDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("student_id")
    private Long studentId;

    @TableField("course_id")
    private Long courseId;

    @TableField("teacher_id")
    private Long teacherId;

    @TableField("start")
    private LocalDateTime start;

    @TableField("end")
    private LocalDateTime end;
}
