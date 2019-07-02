package com.stackroute.java3;
import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;

public class FirstandLastDate {
    public String dateCalculate() {
//        Date thisDate=new Date();
//        for(int i=0;i<=7;i++) {
//            SimpleDateFormat dateForm = new SimpleDateFormat("E/MM/dd/YY");
//
//            return dateForm.format(thisDate);
//
//        }
//        return null;
        Calendar c =GregorianCalendar.getInstance();
        SimpleDateFormat dateForm = new SimpleDateFormat("E/MM/dd/YY");
        String startDate = "", endDate = "";
        c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        startDate = dateForm.format(c.getTime());
        c.add(Calendar.DATE, 6);
        endDate = dateForm.format(c.getTime());
        String date = startDate + "," + endDate;


        return date;
    }
}
