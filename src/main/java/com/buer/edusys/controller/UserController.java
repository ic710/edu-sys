package com.buer.edusys.controller;

import com.buer.edusys.pojo.entity.UserDO;
import com.buer.edusys.pojo.query.LoginQuery;
import com.buer.edusys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author CHEN Xi
 * @since 2023-06-01
 */
@Controller
@RequestMapping("/userDO")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public void login(@RequestBody LoginQuery query) {
        try {
            UserDO userDO = userService.login(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
