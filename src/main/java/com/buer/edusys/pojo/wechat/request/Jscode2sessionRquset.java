package com.buer.edusys.pojo.wechat.request;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Jscode2sessionRquset {

    /**
     * 小程序 appId
     * */
    @Value("${wechat.appid}")
    private String appid;

    /**
     *小程序 appSecret
     * */
    @Value("#{wechat.secret}")
    private String secret;

    /**
     * 登录时获取的 code，可通过wx.login获取
     * */
    private String js_code;

    /**
     * 授权类型，此处只需填写 authorization_code
     * */
    private String grant_type = "authorization_code";
}
