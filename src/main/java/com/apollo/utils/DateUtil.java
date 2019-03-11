package com.apollo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期格式化
 */
public final class DateUtil {

    public final static String Format_Year_To_Day = "yyyy-MM-dd";
    public final static String Format_Year_To_Second = "yyyy-MM-dd HH:mm:ss";
    public final static String FormatYear = "yyyyMMddHHmmssssss";

    // date类型转换为String类型
    // formatType格式为yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    // data Date类型的时间
    public static String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }

    // long类型转换为String类型
    // currentTime要转换的long类型的时间
    // formatType要转换的string类型的时间格式
    public static String longToString(long currentTime, String formatType) {
        Date date = longToDate(currentTime, formatType); // long类型转成Date类型
        String strTime = dateToString(date, formatType); // date类型转成String
        return strTime;
    }

    // string类型转换为date类型
    // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
    // HH时mm分ss秒，
    // strTime的时间格式必须要与formatType的时间格式相同
    public static Date stringToDate(String strTime, String formatType) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        try {
            date = formatter.parse(strTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // long转换为Date类型
    // currentTime要转换的long类型的时间
    // formatType要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    public static Date longToDate(long currentTime, String formatType) {
        Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
        String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
        Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
        return date;
    }

    // string类型转换为long类型
    // strTime要转换的String类型的时间
    // formatType时间格式
    // strTime的时间格式和formatType的时间格式必须相同
    public static long stringToLong(String strTime, String formatType) {
        Date date = stringToDate(strTime, formatType); // String类型转成date类型
        if (date == null) {
            return 0;
        } else {
            long currentTime = dateToLong(date); // date类型转成long类型
            return currentTime;
        }
    }

    // date类型转换为long类型
    // date要转换的date类型的时间
    public static long dateToLong(Date date) {
        return date.getTime();
    }

    /**
     * 判断两个时间是否相差指定分钟
     *
     * @param _time1 时间戳1
     * @param _time2 时间戳2
     * @param minute 指定分钟
     * @return 超过指定分钟:false;未超过:true
     */
    public static boolean isTwoTimeDeltaMinute(long _time1, long _time2, int minute) {
        long deltaSecond = Math.abs(_time1 - _time2);
        long deltaMinute = deltaSecond / (1000 * 60);
        int curMinute = new Long(deltaMinute).intValue();
        return curMinute < minute;
    }

    public static long forwardDays(long currentTimestamp, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimestamp);
        calendar.add(Calendar.DATE, days);
        return calendar.getTimeInMillis();
    }

    public static int daysOfTwoTimestamp(long timestamp1, long timestamp2) {
        Calendar c1 = Calendar.getInstance();
        c1.setTimeInMillis(timestamp1);
        Calendar c2 = Calendar.getInstance();
        c2.setTimeInMillis(timestamp2);

        return Math.abs(c1.get(Calendar.DAY_OF_YEAR) - c2.get(Calendar.DAY_OF_YEAR));

    }

    public static long setLastSecondToTimestamp(long sourceTimestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sourceTimestamp);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);

        return calendar.getTimeInMillis();
    }

    public static long setCustomTimetamp(long sourceTimestamp, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sourceTimestamp);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);

        return calendar.getTimeInMillis();
    }


//    public static void main(String[] args) {
//        long timeStamp = stringToLong("2018-06-06", Format_Year_To_Day);
//        System.out.println("timeStamp=" + timeStamp);
//        String dateStr = longToString(timeStamp, Format_Year_To_Day);
//        System.out.println("dateStr=" + dateStr);
//    }

}
