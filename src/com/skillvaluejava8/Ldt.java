package com.skillvaluejava8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ldt {

    public static void main(String[] args){


        LocalDateTime localDateTime  = LocalDateTime.parse("2019-07-10 14:06", DateTimeFormatter.ofPattern("yyy-MM--dd HH:mm"));
        ZoneId zoneId = ZoneId.of("+02:00");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime());

        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
}
