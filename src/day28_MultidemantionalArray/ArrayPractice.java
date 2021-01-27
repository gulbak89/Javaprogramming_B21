package day28_MultidemantionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {


        String[][] scrumTeam={
                {"Dorin","Adil","Faith","Subhi"},
                {"Alimja","Gulshen","Azad"},
                {"Gul"},
                {"Mike"},
                {"Asiye"}

        };

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("----------------------------------------------");

       for (int i=0; i<scrumTeam.length;i++){
           System.out.println(Arrays.toString(scrumTeam[i]));


           for (int j=0; j<scrumTeam[i].length; j++){

               System.out.println(scrumTeam[i][j]);
           }
       }

        System.out.println("-------------------------------------------");

       for (String[] eachGroup:scrumTeam){
           System.out.println(Arrays.toString(eachGroup));

           for(String eachName: eachGroup){
               System.out.println(eachName);
           }
       }

    }
}
