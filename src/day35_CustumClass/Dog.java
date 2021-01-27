package day35_CustumClass;

import java.time.LocalDate;

public class Dog {

    public String breed;  // instance variable
    public String size;
    public String color;
    public LocalDate dOB;
    public char gender;
    public String nickName;
    public int age;


//sets the instance variables of dog objects
    public void setInfo(String dogNickName,String dogBreed, String dogSize, String dogColor, LocalDate DogDOB, char dogGender){

        breed=dogBreed;
        size=dogSize;
        color=dogColor;
        dOB=DogDOB;
        nickName=dogNickName;
        gender=dogGender;
        age=LocalDate.now().getYear()-dOB.getYear();
             //         current year -  birth year

    }
//to print the info of the dog object
    public void getInfo(){

        System.out.println("Name: "+nickName+", Breed: "+breed+", Gender: "+gender+", Color: "+color+", Size: "+size+", Age:  "+age);
    }

    public void eat(String food){
        System.out.println(nickName+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(nickName+" is drinking"+drinks);
    }



}
