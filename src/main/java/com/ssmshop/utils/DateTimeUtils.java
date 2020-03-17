package com.ssmshop.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Long dateToTimestamp(String date){
        Date dateObj = new Date();
        try{
           dateObj = simpleDateFormat.parse(date);
        }catch (ParseException e){
            e.getStackTrace();
        }
        return dateObj.getTime();
    }

    public static int dateToTimestamp(String date,int mark){
        Date dateObj = new Date();
        try{
            dateObj = simpleDateFormat.parse(date);
        }catch (ParseException e){
            e.getStackTrace();
        }
        return new Long(dateObj.getTime()/1000).intValue();
    }

    public static Date timestampToDate(Long timestamp){
        if (timestamp.toString().length()==10){
            return new Date(timestamp*1000);
        }
        if (timestamp.toString().length()==13){
            return new Date(timestamp);
        }
        return new Date();
    }
}
