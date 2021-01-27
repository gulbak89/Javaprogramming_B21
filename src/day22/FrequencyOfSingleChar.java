package day22;

public class FrequencyOfSingleChar {

    public static void main(String[] args) {

        String s="ababababa";   // count how many "a" in this String

        int count=0;

        for(int i=0; i<=s.length()-1; i++){

           char eachCharacter= s.charAt(i);

           if(eachCharacter=='a'){
               count++;



           }


        }

        System.out.println(count);
    }


}
