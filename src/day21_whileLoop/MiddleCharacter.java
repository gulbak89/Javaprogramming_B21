package day21_whileLoop;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word= "lala";


        if(word.length()%2==0){
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));
        }else{
            System.out.println(word.substring(word.length()/2, word.length()/2+1));
        }
    }
}
