package day27_ForEachLoop;

public class UniqueString {

    public static void main(String[] args) {
        String[] str = {"yashar", "gubek", "yashar", "gubek", "bodek"};

        for (int j = 0; j < str.length; j++) {
            String word = str[j];
            int count = 0;

            for (int i = 0; i < str.length; i++) {
                if (word.equalsIgnoreCase(str[i])) {
                    count++;
                }


                }
            if (count == 1) {
                System.out.println(word);
            }
        }
    }
}