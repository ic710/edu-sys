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
 * @since 2023-06-01
 */
@Getter
@Setter
@TableName("teacher")
public class TeacherDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("name")
    private String name;

    @TableField("sex")
    private Byte sex;

    @TableField("age")
    private Byte age;
}
