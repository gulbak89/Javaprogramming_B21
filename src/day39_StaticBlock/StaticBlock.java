package day39_StaticBlock;

public class StaticBlock {

    public static String company;

    public static day37_CustomClass.Employee employee1=new day37_CustomClass.Employee();
    public static int a, b;
    public static boolean isEmployeed;

   static{         // Employee object can be initialized through static block, because we declared it as static variables.
        company="Pfizer";
        employee1.setInfo("Marry","Pfizer","Researcher","PZ348273","F",55,40);
        a=200;
        b=100;


    }     // static blocks only accept static variables, they do not accept Instance Variables. Static Variables only initializing within the Static Block


   /* public static void main(String[] args) {  // we can't initialize static and instance variables in Main Method and call it in other Classes.

        company="HP";
        isEmployeed=true;
        employee1=new day37_CustomClass.Employee();
        employee1.setInfo("Mat","HP","QA","dfkdsj","M",55,40);
        a=100;
        b=200;
    }*/









}
