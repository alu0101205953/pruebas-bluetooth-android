package com.iris.StayAwake;

/* Esquema para las medidas tomadas de las pulsaciones */

public class HeartRate {
    private String value;
    private String day;
    private String month;
    private String year;
    private String hour;
    private String minute;
    private String dev_code;

    public HeartRate (String value, String day, String month, String year, String hour, String minute) {
        this.value = value;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public String getValue() {
        return value;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

}
