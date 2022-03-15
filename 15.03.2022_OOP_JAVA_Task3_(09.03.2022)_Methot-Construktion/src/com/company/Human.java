package com.company;

public class Human {
       public String firstName;
       public String lastName;




       public Human(String firstName, String lastName){
           this.firstName =firstName;
           this.lastName =lastName;


       }

    @Override
    public String toString() {
        return "{" +
                "Name: " + firstName + '\'' +
                ", Family name:" + lastName + '\'' +
                '}';
    }
}
