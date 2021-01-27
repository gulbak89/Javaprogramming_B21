package day46_JavaRecap.ShapeTask;

import java.util.InputMismatchException;

public class Shape {

    public String name;

    public Shape(String name){

        if(name.isEmpty()){
            throw new InputMismatchException("Shape name cannot be empty");   // throw exception while the name is not given in the constructor
        }

        for(int i=0; i<=name.length()-1; i++){

            char eachChar=name.charAt(i);

            if(!Character.isLetter(eachChar)){
                throw new RuntimeException("No such shape");   //throw exception while the name contains digits or special characters.
            }

        }

        this.name=name;
    }



    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area ="+area()+" scm "+
                ", perimeter ="+perimeter()+" cm "+
                '}';
    }
}
