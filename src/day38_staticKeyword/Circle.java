package day38_staticKeyword;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, perimeter;

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = calculateArea();
        perimeter = calculatePremeter();
    }


    public double calculateArea(){

        return Math.PI*radius*radius;
    }

    public double calculatePremeter(){

        return Math.PI*diameter;
    }


    @Override
    public String toString() {

        DecimalFormat df=new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }


    public boolean equals(Circle circle){

        if(this.radius==circle.radius){
            return true;
        }else{
            return false;
        }


    }
}
