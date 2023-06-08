package com.buer.edusys.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

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
@TableName("student_to_course")
public class StudentToCourseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("course_id")
    private Long courseId;

    @TableField("student_id")
    private Long studentId;
}
