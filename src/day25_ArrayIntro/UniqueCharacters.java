package day25_ArrayIntro;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="abcabcde";
        String result="";



         for(int j=0; j<=str.length()-1; j++) {// j represents the index num of the str
             char ch = str.charAt(j);
             int frequency = 0;


             for (int i = 0; i <= str.length() - 1; i++) {  // i represents the index of str.
                 char eachCharacter = str.charAt(i);     // each character
                 if (eachCharacter == ch) {
                     frequency++;
                 }

             }
             if(frequency==1){
                 result+=ch;
         }


        }

        System.out.println(result);
    }
}
