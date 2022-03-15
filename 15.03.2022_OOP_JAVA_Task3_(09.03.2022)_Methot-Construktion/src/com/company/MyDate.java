package com.company;

public class MyDate {
   public int day;
   public int month;
   public int year;
       public MyDate(int day ,int month , int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString() {
        return "MyDate{" +
                "day: " + day +
                ", month: " + month +
                ", year: " + year +
                '}';
    }

}
