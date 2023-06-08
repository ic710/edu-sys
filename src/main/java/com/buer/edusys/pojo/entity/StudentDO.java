package com.buer.edusys.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.buer.edusys.pojo.entity.base.BaseDO;
import lombok.Data;
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
@Data
@TableName("student")
public class StudentDO extends BaseDO {

    @TableField("name")
    private String name;

    @TableField("sex")
    private Byte sex;

    @TableField("age")
    private Byte age;

    @TableField("number")
    private String number;
}
