package day39_StaticBlock;

//import library.Data;      // imports everything that are static and non static

import static library.Data.data1;  // calling static variable data1
import static library.Data.data2;


public class Test {
    public static void main(String[] args) {

        System.out.println(StaticBlock.company);
        System.out.println(StaticBlock.employee1);
        System.out.println(StaticBlock.a);


        StaticBlock.company="Bank of America";
        System.out.println(StaticBlock.company);


        System.out.println("===================================");

        System.out.println(data1);
        System.out.println(data2);








    }
}
