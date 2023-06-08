package com.buer.edusys.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class UUIDUtil {
    public UUIDUtil() {
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String getUUIDForDate() {
        int code = UUID.randomUUID().toString().hashCode();
        code = code < 0 ? -code : code;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String s = format.format(new Date());
        return s + code;
    }
}
