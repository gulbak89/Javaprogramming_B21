package day22;

public class DupliactedCharacter {

    public static void main(String[] args) {

        String str="AAABBBCCV";

        String result="";

        for(int i=0; i<=str.length()-1; i++){
            String eachCharacter=str.charAt(i)+"";

            if(!result.contains(eachCharacter)){

                result+=eachCharacter;

            }
        }

        System.out.println(result);
    }
}


/*

OR:

for(int i=0, i<=str.length(); i++){

String eachCharacter=str.charAt(i)+"";
  if(result.contains(eachCharacter){
     continue;
   }else{
     result+=eachCharacter;
   }
}
System.out.println(result)



 */
