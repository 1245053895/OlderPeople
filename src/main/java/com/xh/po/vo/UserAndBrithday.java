package com.xh.po.vo;

import com.xh.po.User;

public class UserAndBrithday extends User {
    private String Year;
    private  String Month;
    private  String  Day;

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }
}
