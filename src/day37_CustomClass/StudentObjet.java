package day37_CustomClass;

import sun.jvm.hotspot.runtime.StubRoutines;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjet {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str=new String("Batch 21");

        Student student1=new Student();

        student1.setInfo("Mike",'M',LocalDate.of(1990,4,5),"s2013589",3.5);

        System.out.println(list);
        System.out.println(str);


        System.out.println(student1.toString());
        System.out.println(student1);

        System.out.println("==================================");

        Student student2=new Student();
        student2.setInfo("Nancy",'F',LocalDate.of(1991,6,1),"s2014765",3.6);

        System.out.println(student2.toString().isEmpty());  // to apply String manipulation you must call the toString() method

        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();

        student3.setInfo("EysaJan",'M',LocalDate.of(1989,10,4),"s2012387",3.7);
        System.out.println(student3);

        student4.setInfo("Melike",'F',LocalDate.of(1990,5,6),"2014982",3.3);
        student5.setInfo("Alim",'M',LocalDate.of(1991,9,17),"2014283",3.2);

        System.out.println("====================================");
        ArrayList<Student> studentList=new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));
        System.out.println(studentList);

        LocalDate youngest=studentList.get(0).dOB;
        LocalDate oldest=studentList.get(0).dOB;
        String yougestOne="";
        Student youngesStudent=null; // null is default of all non primitive.
        Student oldestStudent=null;

        for (Student each: studentList){
            if(each.dOB.isAfter(youngest)){
                youngest=each.dOB;
                yougestOne=each.name;
                youngesStudent=each;
            }

            if(each.dOB.isBefore(oldest)){
                oldest=each.dOB;
                oldestStudent=each;
            }


        }



        System.out.println(yougestOne+youngest);
        System.out.println(youngesStudent);

        System.out.println(oldest);
        System.out.println(oldestStudent);
        System.out.println("=========================-");

        double highGpa=studentList.get(0).gpa;
        double lowGpa=studentList.get(0).gpa;
        Student hGpa=null;
        Student lGpa=null;

        for (Student each: studentList){
            if(each.gpa>highGpa){
                highGpa=each.gpa;
                hGpa=each;
            }

            if(each.gpa<lowGpa){
                lowGpa=each.gpa;
                lGpa=each;
            }
        }

        System.out.println(highGpa);
        System.out.println(hGpa);

        System.out.println(lowGpa);
        System.out.println(lGpa);

        System.out.println("======================================");

        ArrayList<Student> maleList=new ArrayList<>(studentList);
        maleList.removeIf(p->p.gender=='F');
        System.out.println(maleList.size());

        ArrayList<Student> femaleList=new ArrayList<>(studentList);
        femaleList.removeIf(p->p.gender=='M');
        System.out.println(femaleList.size());







        System.out.println("=======================================");

        Student[] arr={student1,student2,student3};

        System.out.println(Arrays.toString(arr));

        System.out.println("===========================================");

        for (Student each: arr){

            System.out.println(each);
        }

        System.out.println("============================================");













    }
}
