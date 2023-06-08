package com.buer.edusys.service;

import com.buer.edusys.pojo.wechat.response.Jscode2sessionResponse;

public interface IWeChatService {

    String TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token";

    String JS_CODE2_SESSION = "https://api.weixin.qq.com/sns/jscode2session";


    String getAccessToken();

    Jscode2sessionResponse getJscode2session(String jsCode);
}
