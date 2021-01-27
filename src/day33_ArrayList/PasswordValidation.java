package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {

        String passWord="Password#7";

        String upperLetters="";
        String lowerLetter="";
        String digits="";
        String specialChar="";

        for (char each: passWord.toCharArray()){
            if(Character.isUpperCase(each)){              // verify if the character is upperCase
                upperLetters+=each;

            }else if(Character.isLowerCase(each)){
                lowerLetter+=each;
            }else if(Character.isDigit(each)){
                digits+=each;
            }else{
                specialChar+=each;
            }
        }

        if(upperLetters.length()>0 && lowerLetter.length()>0 && passWord.length()>=8 && digits.length()>0 && specialChar.length()>0){
            System.out.println("is valid passWord");
        }else{
            System.err.println("Invalid passWord");
        }

        System.out.println("===================================================");

        boolean atLeast8Char=passWord.length()>=8;
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasDigits=false;
        boolean hasSpecialChar=false;

        for (int i=0; i<=passWord.length()-1; i++){
            char each=passWord.charAt(i);
            if(Character.isUpperCase(passWord.charAt(i))){
                hasUpperCase=true;
            }else if(Character.isLowerCase(passWord.charAt(i))){
                hasLowerCase=true;
            }else if(Character.isDigit(passWord.charAt(i))){
                hasDigits=true;
            }else{
                hasSpecialChar=true;
            }
        }

        boolean isValid=atLeast8Char && hasDigits && hasLowerCase && hasSpecialChar && hasUpperCase;

        System.out.println(isValid);










    }
}
/*
1. 8 character at least
2. must be a digit
3. must be a letter (at least one upperCase, ont lowerCase)
4. must be a special character
 */