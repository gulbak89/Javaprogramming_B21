package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharactersList {

    public static void main(String[] args) {

       String str="abcd%$#&123hijklmn948" ;

        ArrayList<String> digit=new ArrayList<>();
        digit.addAll(Arrays.asList(str.split("")));
        digit.removeIf(p->!Character.isDigit(p.charAt(0)));  // removes the characters that are not digits
        System.out.println(digit);



        ArrayList<String> letters=new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p->!Character.isLetter(p.charAt(0)));  // remove the characters that are not letters
        System.out.println(letters);


        ArrayList<String> specialChar=new ArrayList<>(Arrays.asList(str.split("")));
        specialChar.removeAll(digit);   // remove the collection of digits=> all the digits
        specialChar.removeAll(letters);  // remove the collection of letters=> all the letters

        System.out.println(specialChar);














    }
}
