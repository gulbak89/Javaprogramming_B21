package offineHours.practice_11_27;

public class RemoveDigits {

    public static void main(String[] args) {

        String str="abcd12ef45ghi";

        String result="";

        for (int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))) {

                result += str.charAt(i);
            }



        }

        System.out.println(result);




    }
}
