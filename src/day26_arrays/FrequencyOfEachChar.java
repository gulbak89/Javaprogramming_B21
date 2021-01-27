package day26_arrays;


public class FrequencyOfEachChar {

    public static void main(String[] args) {


        String str="aaabbc";   //a3b2c1
        String nonDup="";      //abc

        for(int i=0; i<str.length();i++){
            String eachChar=""+str.charAt(i);
            if(!nonDup.contains(eachChar)){
                nonDup+=eachChar;

            }

        }
        System.out.println(nonDup);
        String result = "";

        for(int j=0; j<nonDup.length();j++) {



            char ch = nonDup.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachCharacter = str.charAt(i);

                if (ch == eachCharacter) {
                    count++;
                }
            }


            result += "" + ch + count;


        }
        System.out.print(result);



    }
}
