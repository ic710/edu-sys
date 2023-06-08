package com.buer.edusys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buer.edusys.pojo.entity.UserDO;
import com.buer.edusys.pojo.query.LoginQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
public interface IUserService extends IService<UserDO> {

    UserDO login(LoginQuery query) throws Exception;
}
