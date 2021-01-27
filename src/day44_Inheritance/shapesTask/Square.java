package day44_Inheritance.shapesTask;

public class Square extends Shape {

    public double side;

    public Square(double side){
        super("Square");
        this.side=side;

    }



    public double calArea(){
        return side*side;
    }


    public double calPerimeter(){
        return side*4;
    }





}
