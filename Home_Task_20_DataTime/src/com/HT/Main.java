package com.HT;

import java.time.*;
import java.time.format.DateTimeFormatter;
/*
* Сделал ввиде цикла. Ответ совпадает с необходимым
* Также есть вариант с простым присвоением начала и конца, что так же совпадает с необходимым ответом
*/

public class Main {

    public static void main(String[] args) {
        ZonedDateTime odessaS = ZonedDateTime.of(LocalDateTime.of(2021, 11, 11, 8, 0), ZoneId.of("EET"));
        ZonedDateTime odessaE = ZonedDateTime.of(LocalDateTime.of(2021, 11, 11, 17, 0), ZoneId.of("EET"));

        ZonedDateTime odessaStart = odessaS.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime odessaEnd = odessaE.withZoneSameInstant(ZoneId.of("UTC"));

        ZonedDateTime rioS = ZonedDateTime.of(LocalDateTime.of(2021, 11, 11, 8, 0), ZoneId.of("Brazil/East"));
        ZonedDateTime rioE = ZonedDateTime.of(LocalDateTime.of(2021, 11, 11, 17, 0), ZoneId.of("Brazil/East"));
        ZonedDateTime rioStart = rioS.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime rioEnd = rioE.withZoneSameInstant(ZoneId.of("UTC"));

//        odessaStart =  odessaStart.withHour(rioStart.getHour());
//        rioEnd =  rioEnd.withHour(odessaEnd.getHour());

        do {
            odessaStart = odessaStart.plusHours(1);

        } while (odessaStart.getHour() != rioStart.getHour());
        do {
            rioEnd = rioEnd.minusHours(1);
        } while (rioEnd.getHour() != odessaEnd.getHour());


        odessaS = odessaStart.withZoneSameInstant(ZoneId.of("EET"));
        odessaE = odessaEnd.withZoneSameInstant(ZoneId.of("EET"));
        rioS = rioStart.withZoneSameInstant(ZoneId.of(("Brazil/East")));
        rioE = rioEnd.withZoneSameInstant(ZoneId.of(("Brazil/East")));
        DateTimeFormatter utc = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("The meeting can be scheduled from " + utc.format(odessaS) + " to " + utc.format(odessaE) + " Odessa time ");
        System.out.println("Which corresponds " + utc.format(rioS) + " to " + utc.format(rioE) + " in Rio");

    }
    //13:00 - 17:00 odessa ("Europe/Kiev")
    //8:00 - 12:00 rio ("Brazil/Acre")Brazil/East
}
