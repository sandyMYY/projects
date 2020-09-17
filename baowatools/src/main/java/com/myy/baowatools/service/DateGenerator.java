package com.myy.baowatools.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateGenerator {
    public DateGenerator() {
    }

    public static String dateRangeRandom(String startDate, String stopDate) {
        Calendar calendar = Calendar.getInstance();

        String date = "";
        String[] dateStart = startDate.split("-");
        String[] dateStop = stopDate.split("-");
        int yearStart = Integer.valueOf(dateStart[0]);
        int monthStart = Integer.valueOf(dateStart[1]);
        int dayStart = Integer.valueOf(dateStart[2]);
        int yearStop = Integer.valueOf(dateStop[0]);
        int monthStop = Integer.valueOf(dateStop[1]);
        int dayStop = Integer.valueOf(dateStop[2]);
        calendar.set(yearStart, monthStart, dayStart);
        long start = calendar.getTime().getTime();
        calendar.set(yearStop, monthStop, dayStop);
        long stop = calendar.getTime().getTime();
        double random = Math.random();
        long distance = stop - start;
        double randomDate = random * (double)distance + (double)start;
        calendar.setTimeInMillis(Math.round(randomDate));
        Date dateFinal = calendar.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        date = df.format(dateFinal);
        return date;
    }

    public static void main(String[] args) {
        String d = dateRangeRandom("2016/1/31", "2019/7/13");
        System.out.print(d);
    }
}
