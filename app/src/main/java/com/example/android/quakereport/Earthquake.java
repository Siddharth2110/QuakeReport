package com.example.android.quakereport;

public class Earthquake {

    private String magnitude;
    private String Location;
    private String date;
    private String time;
    private String url;

    public Earthquake(String magnitude,String location,String date,String time,String url) {

        this.magnitude = magnitude;
        this.Location=location;
        this.date=date;
        this.time=time;
        this.url =url;
    }
    public String getMagnitude(){
        return magnitude;
    }
    public String getLocation(){
        return Location;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){return time;}
    public String getUrl(){return url;}
}

