package offineHours.practice_1_6;

import java.io.FileNotFoundException;

public class ExceptionTypes {

    public static void main(String[] args) {

        String str=null;

        try {

            System.out.println(str.charAt(0));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }








    }
}
