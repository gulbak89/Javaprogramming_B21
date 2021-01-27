package library;

import java.util.Arrays;

public class StringUtility {

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }
    /*
    returns the frequency of the given character in the given string
     */

    public static String unique(String str) {

        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int count = frequency(str, each);
            if (count == 1) {
                unique += each;
            }

        }

        return unique;
    }
    /*
    returns the unique characters for the given string
     */

    public static String CharFrequency(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int count = frequency(str, str.charAt(i));
            if (result.contains(each + "")) {
                continue;
            } else {
                result += "" + each + count;

            }
        }
        return result;
    }
    /*
    returns the frequency of the every single character from the string
     */

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;


    }
    /*
    returns the reversed the string
     */

    public static String removeDuplicateChar(String str) {
        String result = "";
        for (String each : str.split("")) {
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }
        }
        return result;
    }
    /*
    removes the duplicartes from the string
     */

    public static boolean anagram(String str1, String str2) {

        str1 = removeDuplicateChar(str1);
        str2 = removeDuplicateChar(str2);

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

    public static boolean isPalindrome(String str) {

        return reverse(str).equalsIgnoreCase(str);

    }

    public static int frequencyOfWord(String s, String word) {

        s = s.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;
        while (s.contains(word)) {
            s = s.replaceFirst(word, "");
            frequency++;

        }

        return frequency;

    }

}



