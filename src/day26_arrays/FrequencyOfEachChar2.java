package day26_arrays;

public class FrequencyOfEachChar2 {

    public static void main(String[] args) {

        String str="aaabbcaaabbbddddddeeewwwiii";    //a3b2c1
        str=str.replace(" ","");  //this part is only needed if we need to ignore the spaces

        String expectedResult="";


        for(int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {   // index of str
                char eachChar = str.charAt(i);

                if (eachChar == ch) {
                    count++;
                }

            }

            if(expectedResult.contains(""+ch)){
                continue;
            }else {

                expectedResult += "" + ch + count+" ";
            }
        }

        System.out.println(expectedResult);





    }
}
