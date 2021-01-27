package day49_Abstraction.shapeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObject {

    public static void main(String[] args) {


        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(7);
        Cube cube = new Cube(9);
        Cylinder cylinder = new Cylinder(5, 3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(cube);
        System.out.println(cylinder);

        System.out.println("===============");

        Shape shape1=new Circle(3.5);
        Shape shape2=new Rectangle(6,8);

        Shape shape3=new Rectangle(5,7);

        Shape[] shapes={circle,rectangle,square,cube,cylinder,new Circle(12)};

        for (Shape each: shapes){
            if(each.name.equals("Circle")){
                System.out.println(each);
            }
        }
        System.out.println("========================");

        ArrayList<Shape> circles=new ArrayList<>(Arrays.asList(shapes));
        System.out.println(circles);

        circles.removeIf(p->!p.name.equals("Circle"));

        System.out.println(circles.size());
        circles.forEach(p->{
            System.out.println(p);
        });

        System.out.println("=====================");

       circles.forEach(each->{  // it is a collection method
           if(each.area()>400){
               System.out.println(each);
           }
       });

        System.out.println("========================");

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.forEach(each->{
            if(each%2!=0){
                System.out.println(each);
            }
        });

        System.out.println("===============================");
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> oddNum=new ArrayList<>();
        ArrayList<Integer> evenNum=new ArrayList<>();
        ArrayList<Integer> greaterThan5=new ArrayList<>();

        numbers.forEach(p->{
            if(p%2==0)
                evenNum.add(p);else oddNum.add(p);
        });

        System.out.println(oddNum);
        System.out.println(evenNum);

        numbers.forEach(p->{
            if(p>5) greaterThan5.add(p);
        });

        System.out.println(greaterThan5);


















    }
}
