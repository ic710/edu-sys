package com.buer.edusys.pojo.wechat.response;

import lombok.Data;

@Data
public class TokenResponse {

    /**
     * 获取到的凭证
     * */
    private String access_token;

    /**
     * 凭证有效时间，单位：秒。目前是7200秒之内的值
     * */
    private Long expires_in;
}
