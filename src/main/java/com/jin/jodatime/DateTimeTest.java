package com.jin.jodatime;

import com.alibaba.fastjson.JSON;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

/**
 * @author wu.jinqing
 * @date 2017年04月18日
 */
public class DateTimeTest {
    public static void main(String[] args) {
        DateTime now = DateTime.now();
        System.out.println(now);

        System.out.println("=======================");

        DateTimeZone dtz = DateTimeZone.getDefault();
        System.out.println(JSON.toJSONString(dtz));

        System.out.println("=======================");

        DateTime dateTime1 = DateTime.parse("20170418", DateTimeFormat.forPattern("yyyyMMdd"));

        System.out.println(dateTime1);

        System.out.println("=======================");

        DateTime now1 = DateTime.now();

        String dtStr = DateTimeFormat.forPattern("yyyyMMdd").print(now1);

        System.out.println(dtStr);
    }
}
