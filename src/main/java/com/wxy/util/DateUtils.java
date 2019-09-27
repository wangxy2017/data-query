package com.wxy.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author wangxy
 * @Date 2019/6/17 10:29
 * @Description 日期工具类
 **/
public class DateUtils {
    /**
     * 获取标准 UTC 时间
     *
     * @return
     */
    public static String utcTime() {
        String utcTime = LocalDateTime.now().minusHours(8).toString();
        utcTime = utcTime.lastIndexOf(".") == -1 ? utcTime + "Z" : utcTime.substring(0, utcTime.lastIndexOf(".")) + "Z";
        return utcTime;
    }

    /**
     * 格式化时间
     *
     * @param date
     * @param pattern
     * @return
     */
    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 获取当前日期
     *
     * @return
     */
    public static String nowDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    /**
     * 获取当前时间
     *
     * @return
     */
    public static String nowTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
