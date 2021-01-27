package day49_Abstraction.shapeTask;

import java.text.DecimalFormat;

public abstract class Shape {

    public String name;
    public static DecimalFormat df=new DecimalFormat("0.00");

    public Shape(String name) {

        if(name.isEmpty()){
            throw new RuntimeException("Name cannot be empty!");
        }

        for (int i=0; i<name.length();i++){
            char eachChar=name.charAt(i);
            if(!Character.isLetter(eachChar)){
                throw new RuntimeException("No such Shape");
            }
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + df.format(area()) + '\'' +
                "perimeter='" + df.format(perimeter()) + '\'' +
                '}';
    }
}
