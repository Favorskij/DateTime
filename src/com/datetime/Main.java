package com.datetime;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println("-------------");

        Instant instant1 = Instant.now();
        String output = instant1.toString();
        System.out.println(output);

        System.out.println("-------------");

        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(now);

        System.out.println("-------------");

        ZonedDateTime nowTime = ZonedDateTime.now(ZoneId.of("Asia/Sakhalin"));
        System.out.println(nowTime);

        System.out.println("-------------");

        ZoneId z = ZoneId.of( "Asia/Sakhalin" );
        ZonedDateTime zdt = instant.atZone( z );
        System.out.println(zdt);

        System.out.println("-------------");

        ZoneId z1 = ZoneId.of( "UTC" );
        ZonedDateTime zdt1 = instant.atZone( z1 );
        System.out.println(zdt1);

        System.out.println("-------------");

        Instant instant4 = Instant.now();
        Timestamp timestamp = Timestamp.from(instant4);
        System.out.println(timestamp);

        // Для записи в базу данных MySQL необходимо использовать Timestamp.

        Date date = Timestamp.from(Instant.now());

        Date date1 = Timestamp.from(Instant.now().plus(3, ChronoUnit.DAYS));

    }
}
