package day38_staticKeyword;

public class StudentObject {

    public static void main(String[] args) {



        HarwardStudent student1=new HarwardStudent();
        HarwardStudent student2=new HarwardStudent();
        HarwardStudent student3=new HarwardStudent();
        HarwardStudent student4=new HarwardStudent();
        HarwardStudent student5=new HarwardStudent();


       // System.out.println(student1.schoolName+student1);

        System.out.println(HarwardStudent.schoolName); // better to call the static method by the class

        student1.setInfo("Mamutjan",21,15,'M');
        student2.setInfo("Melike",20,10,'F');
        student3.setInfo("Ayqiz",19,9,'F');

        System.out.println(student1);
        System.out.println(student5);







    }
}
