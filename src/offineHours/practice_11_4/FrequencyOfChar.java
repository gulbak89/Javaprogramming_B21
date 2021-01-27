package offineHours.practice_11_4;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str="aaabcd";

        for(int j=0; j<str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char eachCha = str.charAt(i);
                if (ch == eachCha) {
                    count++;
                }
            }
            if(count==1) {
                System.out.println(ch);

            }





        }


    }
}
