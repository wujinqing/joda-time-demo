package com.jin.jodatime.jdk8time;

import com.alibaba.fastjson.JSON;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

/**
 * @author wu.jinqing
 * @date 2017年04月28日
 */
public class Jdk8TimeTest4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println(now);

        LocalTime shanghai = LocalTime.now(ZoneId.of("Asia/Shanghai"));
        LocalTime tokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(shanghai);
        System.out.println(tokyo);

        LocalDate date1 = LocalDate.of(2017, 4, 18);
        LocalDate date2 = LocalDate.of(2017, 4, 28);

        ValueRange valueRange = date1.range(ChronoField.YEAR);

        System.out.println(JSON.toJSONString(valueRange));
    }
}
