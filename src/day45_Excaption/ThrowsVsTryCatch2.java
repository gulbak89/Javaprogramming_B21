package day45_Excaption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsVsTryCatch2 {

    public static void method1(){

        try {
            FileInputStream file= new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method2(){
        method1();
    }


}
