package offineHours.practice_11_4;

public class UniqueCharAndDuplicates {
    public static void main(String[] args) {

        String str="aabccs";

        String unique="";//designed to contain the expected result:"bs"
        String duplicate="";

        for(int j=0; j<str.length(); j++) {
           char ch = str.charAt(j);
           int count = 0;

           for (int i = 0; i < str.length(); i++) {
               if (ch == str.charAt(i)) {
                   count++;
               }
           }

           if(count==1){
               unique+=ch;
           }

           if(count>1 &&!duplicate.contains(ch+"")){
               duplicate+=ch;

           }



       }
        System.out.println(unique);
        System.out.println(duplicate);


    }
}
