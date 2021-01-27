package day25_ArrayIntro;

public class RemoveTheUniqueCharacter {

    public static void main(String[] args) {

        String str="ababsd";
        String result="";

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            int count=0;

            for(int j=0; j<str.length(); j++){
                char eachCharacter=str.charAt(j);

                if(eachCharacter==ch){
                    count++;
                }
            }

            if(count>1 && !result.contains(""+ch)){
                result+=ch;

            }
        }

        System.out.println(result);
    }
}
