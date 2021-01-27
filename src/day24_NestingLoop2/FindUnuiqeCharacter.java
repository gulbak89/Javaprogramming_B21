package day24_NestingLoop2;

public class FindUnuiqeCharacter {

    public static void main(String[] args) {

        String str="AABCCD";



        for(int index=0; index<str.length(); index++ ){  // index<=length()-1

           int frequency=0;


           //   charAt(index)==> each character


           for(int inner=0; inner<str.length(); inner++){
               // charAt

               if(str.charAt(index)==str.charAt(inner)){
                   frequency++;
               }
           }

           if(frequency==1){
               System.out.println(str.charAt(index));
           }



        }
    }
}
