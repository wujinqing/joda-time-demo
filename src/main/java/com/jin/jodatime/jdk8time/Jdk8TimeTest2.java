package com.jin.jodatime.jdk8time;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author wu.jinqing
 * @date 2017年04月26日
 */
public class Jdk8TimeTest2 {
    public static void main(String[] args) {
//        Clock clock = Clock.systemDefaultZone();
//        System.out.println(JSON.toJSONString(clock, SerializerFeature.PrettyFormat));
//        System.out.println(clock.millis());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        ZonedDateTime instant1 = instant.atZone(ZoneId.systemDefault());

        System.out.println(instant);
        System.out.println(instant1);

        System.out.println("---------------------");
        System.out.println(instant1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")));
        System.out.println("---------------------");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        System.out.println("---------------------");

        DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());

        System.out.println(dayOfWeek);
    }
}
