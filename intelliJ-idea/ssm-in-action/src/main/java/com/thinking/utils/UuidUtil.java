package com.thinking.utils;

import java.util.UUID;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/6/23
 */
public class UuidUtil {

    public static String get32UUID(){
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }
}
