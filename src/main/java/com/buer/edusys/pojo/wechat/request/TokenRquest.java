package com.buer.edusys.pojo.wechat.request;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class TokenRquest {

    private String grant_type = "client_credential";

    /**
     * 小程序唯一凭证
     */
    @Value("#{wechat.appid}")
    private String appid;

    /**
     * 小程序唯一凭证密钥
     */
    @Value("#{wechat.secret}")
    private String secret;

}
