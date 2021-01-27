package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {

        char n = 'W';
        System.out.println(Character.isDigit(n));  // isDigit : boolean
        System.out.println(Character.isLetter(n));

        String str = "a1b2c3d4e5#$% *";
        String digits = "";
        String letters = "";

        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;

            }else if(Character.isLetter(each)){
                letters+=each;
            }else{
                specialChar+=each;
            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChar);
    }
}

/*
Password validation:
1. 8 character at least
2. There must be letter(at least one upper case one lower case)
3. There must be special character
4. There myst be digit
 */