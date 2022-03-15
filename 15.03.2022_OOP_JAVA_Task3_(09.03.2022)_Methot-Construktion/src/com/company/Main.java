package com.company;

public class Main {

    public static void main(String[] args) {
        MyDate myDateStart= new MyDate(5,5,2020);
        MyDate myDateFinish= new MyDate(24,2,2021);
        Human tutor= new Human("Zigmund","Fraid");
        Human intern= new Human("Alfred","Hitchkock");
        Practice practice= new Practice("History",tutor,intern,myDateStart,myDateFinish);
        System.out.println(practice);





    }
}
