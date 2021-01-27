package offineHours.practice_11_27;

public class RemoveSpecialCharacter {

    public static void main(String[] args) {

        String str="ab!cd#%efg&hi$jk";

        String result="";

        for (char each: str.toCharArray()){

            if(Character.isLetterOrDigit(each)){

                result+=each;

            }



        }

        System.out.println(result);






    }
}
