package com.andy.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,10,8,0);
        Car car = new Car("AA-0001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60);
        System.out.println(hours);
        System.out.println(hours*30);
//        java8();
//        java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //T=time Z=毫秒 Instant 預設格林威治時間
        //local 顯示現在地區時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other =
                LocalDateTime.of(2018,11,23,8,0,0);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2018/11/25 08:00:00";
        Date other = null;
        try {
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(other);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }
}
