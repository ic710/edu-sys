package com.buer.edusys.utils;//


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.TypeReference;
import kong.unirest.GetRequest;
import kong.unirest.HttpRequestWithBody;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UnirestUtil {
    private static final Logger log = LoggerFactory.getLogger(UnirestUtil.class);

    public UnirestUtil() {
    }

    public static <T> T post(String url, Object reqBody, Class<T> t) {
        return post(url, (Object) null, reqBody, t, UnirestUtil.HttpHeaderConstant.header_JSON);
    }

    public static <T> T get(String url, Object queryParam, Class<T> t) {
        return get(url, queryParam, t, UnirestUtil.HttpHeaderConstant.header_JSON);
    }

    public static <T> T post(String url, Class<T> t) {
        return post(url, (Object) null, (Object) null, t, UnirestUtil.HttpHeaderConstant.header_JSON);
    }

    public static <T> T get(String url, Class<T> t) {
        return get(url, (Object) null, t, UnirestUtil.HttpHeaderConstant.header_JSON);
    }

    public static byte[] get(String url, Object queryParam, HashMap<String, String> hashMap) {
        return (byte[]) get(url, queryParam, byte[].class, hashMap);
    }

    public static byte[] post(String url, Object queryParam, Object reqBody, HashMap<String, String> hashMap) {
        return (byte[]) post(url, queryParam, reqBody, byte[].class, hashMap);
    }

    public static <T> T post(String url, Object queryParam, Object reqBody, Class<T> t, HashMap<String, String> hashMap) {
        String uuid = UUIDUtil.getUUIDForDate();
        Long stratTime = System.currentTimeMillis();
        log.info("[UnirestUtil] Send post request ====>request_UUID:{},URL:{},Body:{},Params:{},Header:{}", new Object[]{uuid, url, JSON.toJSONString(reqBody), JSON.toJSONString(queryParam), JSON.toJSONString(hashMap)});
        String result = (String) ((HttpRequestWithBody) ((HttpRequestWithBody) Unirest.post(url).headers(hashMap)).queryString((Map) JSON.parseObject(JSON.toJSONString(queryParam), new TypeReference<Map<String, Object>>() {
        }, new JSONReader.Feature[0]))).body(JSON.toJSONString(reqBody)).asString().getBody();
        log.info("[UnirestUtil] Received post response ====>response_UUID:{},URL:{},TotalTime:{},responseBody:{}", new Object[]{uuid, url, System.currentTimeMillis() - stratTime, result});
        return JSON.parseObject(result, t);
    }

    public static <T> T get(String url, Object queryParam, Class<T> t, HashMap<String, String> hashMap) throws UnirestException {
        String uuid = UUIDUtil.getUUIDForDate();
        Long stratTime = System.currentTimeMillis();
        log.info("[UnirestUtil] Send Get request====>request_UUID:{},URL:{},Params:{},Header:{}", new Object[]{uuid, url, JSON.toJSONString(queryParam), JSON.toJSONString(hashMap)});
        T result = ((GetRequest) ((GetRequest) Unirest.get(url).headers(hashMap))
                .queryString((Map) JSON.parseObject(JSON.toJSONString(queryParam), new TypeReference<Map<String, Object>>() {
                }, new JSONReader.Feature[0])))
                .asObject(t)
                .getBody();
        log.info("[UnirestUtil] Received Get response ====>response_UUID:{},URL:{},TotalTime:{},responseBody:{}", new Object[]{uuid, url, System.currentTimeMillis() - stratTime, JSON.toJSONString(result)});
        return result;
    }

    public static class HttpHeaderConstant {
        public static HashMap<String, String> header_JSON = new HashMap<String, String>() {
            {
                this.put("Content-Type", "application/json");
                this.put("Accept", "application/json");
            }
        };
        public static HashMap<String, String> header_FORM = new HashMap<String, String>() {
            {
                this.put("Content-Type", "application/x-www-form-urlencoded");
            }
        };

        public HttpHeaderConstant() {
        }
    }
}
