package day28_MultidemantionalArray;

public class LongestString2 {
    public static void main(String[] args) {

        String[] names={"Gulbakram", "Xapketjan", "Zumret", "Aminihan","Tumake"};

        String longest=names[0];
        String shortest=names[0];



        for (String each: names){

            if(each.length()>longest.length()) {

                longest = each;
            }

            if(each.length()<shortest.length())   {
                shortest=each;
            }


        }


        for (String each:names){

            if(longest.length()==each.length()){
                System.out.println(each+" ");

            }



            if(shortest.length()==each.length()){

                System.out.println(each+" ");
            }
        }









    }
}
