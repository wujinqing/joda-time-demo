package com.jin.jodatime.jdk8time;

import com.alibaba.fastjson.JSON;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * LocalDate 只含年月日，不含时分秒
 * LocalTime 只含时分秒，不含年月日
 * LocalDateTime 既含年月日，又含时分秒
 * Duration 两个时间的时间间隔，粒度是在秒和纳秒级别, 由于精确到秒级别所以不能用LocalDate构造
 * Period 也表示两个时间的时间间隔，粒度是在年月日级别，和Duration在粒度上有差别
 * Instant 这是机器使用的时间包含19000101到现在的秒数、纳秒数
 * ZoneDateTime 含时区的年月日时分秒时间
 * ZoneId 时区
 * DateTimeFormatter 日期格式化
 *
 * @author wu.jinqing
 * @date 2017年04月28日
 */
public class Jdk8TimeTest3 {
    public static void main(String[] args) {
        // LocalDate, LocalTime, LocalDateTime, Duration, Period, Instant,
        // ZoneDateTime, ZoneId, DateTimeFormatter

        LocalDate localDate = LocalDate.of(1990, 2, 10);

        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(21, 34, 50);

        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(1990, 2, 10, 21, 34, 50);
        LocalDateTime localDateTime2 = LocalDateTime.of(1990, 2, 10, 23, 14, 30);

        System.out.println(localDateTime);

        Duration duration = Duration.between(localDateTime, localDateTime2);

        System.out.println(duration.getSeconds());

        LocalDate localDate1 = LocalDate.of(1990, 10, 1);

        Period period = Period.between(localDate, localDate1);
        System.out.println(JSON.toJSONString(period));
        LocalDate localDate2 = LocalDate.now();
        LocalDate localDate3 = LocalDate.of(2017, 5, 12);
        System.out.println(localDate2.toEpochDay());
        System.out.println(localTime.toNanoOfDay());
        System.out.println(localDate2.until(localDate3, ChronoUnit.WEEKS));
    }
}
