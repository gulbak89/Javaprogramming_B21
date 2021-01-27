package offineHours.practice_11_4;

public class FrequencyOfChar2 {

    public static void main(String[] args) {

        String str="abbacaa";
        String result="";

        for(int j=0; j<str.length(); j++){

        char ch=str.charAt(j);
        int count=0;

        for(int i=0; i<str.length(); i++) {

            if (ch == str.charAt(i)) {
                count++;
            }
        }

        if(!result.contains(ch+"")){
            result+=""+ch+count;
        }

        }


        System.out.println(result);


    }
}
