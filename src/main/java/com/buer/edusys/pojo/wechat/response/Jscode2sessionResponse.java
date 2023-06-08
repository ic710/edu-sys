package com.buer.edusys.pojo.wechat.response;

import lombok.Data;

@Data
public class Jscode2sessionResponse {

    /**
     * 会话密钥
     * */
    private String session_key;

    /**
     * 用户在开放平台的唯一标识符，若当前小程序已绑定到微信开放平台帐号下会返回
     * */
    private String unionid;

    /**
     * 错误信息
     * */
    private String errmsg;

    /**
     * 用户唯一标识
     * */
    private String openid;

    /**
     * 错误码
     * */
    private Integer errcode;
}
