package day27_ForEachLoop;

public class First3Char {

    public static void main(String[] args) {

        String[] names={"amat","samat", "anarhan","sarihan"};

        for (String each:names){
            System.out.println(each.substring(0,3));
        }
    }
}
