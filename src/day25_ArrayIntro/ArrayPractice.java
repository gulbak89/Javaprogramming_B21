package day25_ArrayIntro;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] students=new String[5];  // size of this array is 5.  String[] students={"xx", "xxx", "yy", "yyy", "zz"};

       // Max, Marry, Murad, Matt, Mike

        students[0]="Max";
        students[1]="Marry";
        students[2]="Murad";
        students[3]="Matt";
        students[4]="Mike";

       /* System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
        */

       for(int i=0; i<=students.length-1; i++){
           System.out.println(students[i]);
       }


    }
}
