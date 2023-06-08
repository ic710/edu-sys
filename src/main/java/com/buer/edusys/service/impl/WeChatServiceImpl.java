package com.buer.edusys.service.impl;

import com.buer.edusys.pojo.wechat.request.Jscode2sessionRquset;
import com.buer.edusys.pojo.wechat.request.TokenRquest;
import com.buer.edusys.pojo.wechat.response.Jscode2sessionResponse;
import com.buer.edusys.pojo.wechat.response.TokenResponse;
import com.buer.edusys.service.IWeChatService;
import com.buer.edusys.utils.UnirestUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class WeChatServiceImpl implements IWeChatService {

    /**
     * 获取接口调用凭据
     * */
    @Override
    public String getAccessToken() {
        TokenRquest rquest = new TokenRquest();
        TokenResponse response = null;
        try {
            response = UnirestUtil.get(TOKEN_URL, rquest, TokenResponse.class);
        }catch (Exception e) {
            log.error("{}", e);
        }

        return response.getAccess_token();
    }

    /**
     * 小程序登录
     * */
    public Jscode2sessionResponse getJscode2session(String jsCode) {
        Jscode2sessionRquset rquest = new Jscode2sessionRquset();
        rquest.setJs_code(jsCode);

        Jscode2sessionResponse response = null;
        try {
            response = UnirestUtil.get(JS_CODE2_SESSION, rquest, Jscode2sessionResponse.class);
        }catch (Exception e) {
            log.error("{}", e);
        }

        return response;
    }
}
