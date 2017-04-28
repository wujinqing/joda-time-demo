package com.jin.jodatime;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * @author wu.jinqing
 * @date 2017年04月25日
 */
public class JodaTest2 {
    public static void main(String[] args) {
        DateTime today = new DateTime();

        DateTime tomorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("-------------------------");
        LocalDate localDate1 = new LocalDate(1990, 2, 10);

        LocalDate localDate2 = LocalDate.now();

        System.out.println(localDate1.toString("yyyy-MM-dd"));
        System.out.println(localDate2.toString("yyyy-MM-dd"));
        Period period = new Period(localDate1, localDate2, PeriodType.yearMonthDay());

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(JSON.toJSONString(period, SerializerFeature.PrettyFormat));
    }
}
