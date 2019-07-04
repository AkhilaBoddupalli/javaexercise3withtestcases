package com.stackroute.java3;
import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;

public class FirstandLastDate {
    public String dateCalculate() {
//
        Calendar c =GregorianCalendar.getInstance();
        SimpleDateFormat dateForm = new SimpleDateFormat("E/MM/dd/YY");
        String startDate = "", endDate = "";
        c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY); //sets day as Tuesday
        startDate = dateForm.format(c.getTime());
        c.add(Calendar.DATE, 6); //adds 6 days to set day
        endDate = dateForm.format(c.getTime());
        String date = startDate + "," + endDate;


        return date;
    }
}
