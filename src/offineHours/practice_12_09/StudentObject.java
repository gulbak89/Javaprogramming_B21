package offineHours.practice_12_09;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

      AtlanStudent student1=new AtlanStudent();
      AtlanStudent student2=new AtlanStudent();
      AtlanStudent student3=new AtlanStudent();


      student1.setInfo("Qasimjan",25,'M');
        student2.setInfo("Ayzohra",23,'F');
        student3.setInfo("Daniyar",21,'M');

        System.out.println(student1);

        ArrayList<AtlanStudent> studentList=new ArrayList<>(Arrays.asList(student1,student2,student3));

        for (AtlanStudent each: studentList){


            if(each.age<24){
                System.out.println(each.name);
            }
        }










    }
}
