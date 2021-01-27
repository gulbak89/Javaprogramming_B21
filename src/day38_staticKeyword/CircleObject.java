package day38_staticKeyword;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1=new Circle();
        Circle circle2=new Circle();
        Circle circle3=new Circle();
        Circle circle4=new Circle();
        Circle circle5=new Circle();


        circle1.setInfo(5);
        circle2.setInfo(2.5);
        circle3.setInfo(3);
        circle4.setInfo(1.5);
        circle5.setInfo(1.5);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println(circle5);

        System.out.println(circle4.equals(circle1));











    }
}
