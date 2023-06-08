package com.buer.edusys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buer.edusys.mapper.UserMapper;
import com.buer.edusys.pojo.entity.UserDO;
import com.buer.edusys.pojo.query.LoginQuery;
import com.buer.edusys.pojo.wechat.response.Jscode2sessionResponse;
import com.buer.edusys.service.IUserService;
import com.buer.edusys.service.IWeChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements IUserService {

    @Autowired
    private IWeChatService weChatService;

    @Override
    public UserDO login(LoginQuery query) throws Exception {
        Jscode2sessionResponse response = weChatService.getJscode2session(query.getJsCode());
        if (BeanUtil.isEmpty(response) || 0 != response.getErrcode()) {
            throw new Exception("登陆失败！");
        }

        UserDO userDO = getOne(new LambdaQueryWrapper<UserDO>()
                .eq(UserDO::getName, query.getName())
                .eq(UserDO::getPassword, query.getPassword()));
        if (BeanUtil.isEmpty(userDO)) {
            throw new Exception("登陆失败！");
        }

        return userDO;
    }
}
