package com.buer.edusys.pojo.entity.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("crate_time")
    private Long crateTime;

    @TableField("update_time")
    private Long updateTime;

    @TableField("user_id")
    private Long userId;

    @TableField("dept_id")
    private Long dept_id;

    @TableField("is_delete")
    private Byte isDelete;
}
