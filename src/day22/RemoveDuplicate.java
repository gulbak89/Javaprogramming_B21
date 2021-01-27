package day22;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str="AAABBCCNNHHHHJJJJJKKKKAA";
        String result="";

        for(int i=0; i<=str.length()-1; i++){

            String eachCharacter= str.charAt(i)+"";

            if(result.contains(eachCharacter)){
                continue;
            }else{
                result+=eachCharacter;
            }




        }

        System.out.println(result);



    }
}
