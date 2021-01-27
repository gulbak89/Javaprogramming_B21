package day28_MultidemantionalArray;

public class LongestStringinArray {
    public static void main(String[] args) {

        String[] name={"Gulbakram","Xepket","Tumaris","Amine"};

        String longest=name[0];
        String shortest=name[0];

        for (String each:name){

            if(each.length()>name[0].length()){

                longest=each;
            }

            if(each.length()<name[0].length()){
                shortest=each;
            }
        }

        System.out.println(longest);
        System.out.println(shortest);


    }
}
