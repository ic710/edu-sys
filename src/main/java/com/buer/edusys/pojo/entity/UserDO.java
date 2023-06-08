package com.buer.edusys.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

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
@TableName("user")
public class UserDO extends BaseDO {

    /**
     * 用户名
     */
    @TableField("name")
    private String name;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户类型
     */
    @TableField("type")
    private Byte type;

    /**
     * 小程序用户唯一标识
     */
    @TableField("openpid")
    private Long openpid;

    @TableField("is_delete")
    private Byte isDelete;
}
