package day12_NestedIfStatement;

public class Age_group {

    public static void main(String[] args) {

       int age = 4;
       String ageGroup = "";

       if (age<=2 && age>=1){
            ageGroup = "infant";
        }else if(age<=5) {      //if   1<=age<=2 is not true, then compiler automatically gave age>=3, so we don't have to mention it in the else if conditon
           ageGroup="Toddler";
        }else if(age<=9 ) {     // same logic as above
           ageGroup="kid";


       }else if (age<=12) {
           ageGroup="pre-teenage";
        }else if(age<=17) {
           ageGroup="Teenager";
        }else if(age<=20) {
           ageGroup="Young adult";
        }else if (age<=39) {
           ageGroup="adult";
       }else if(age<=49) {
           ageGroup="Young-middle-aged adult";
       }else if(age<=54){
           ageGroup="Middle aged adult";
       }else if (age<=64) {
           ageGroup="Very young senior citizen";
       }else if(age<=74){
           ageGroup="Young senior citizen";
       }else if (age<=84) {
           ageGroup="Senior citizen";
       }else {
           ageGroup="Old senior citizen";
       }
        System.out.println(ageGroup);



    }
}
