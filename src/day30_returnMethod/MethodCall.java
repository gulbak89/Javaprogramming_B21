package day30_returnMethod;

import library.StringUtility;

public class MethodCall {

    public static void main(String[] args) {

        String str="level";
        String reverseName=StringUtility.reverse(str);
        System.out.println(reverseName);

        System.out.println(StringUtility.removeDuplicateChar(str));

        System.out.println(StringUtility.CharFrequency(str));

        System.out.println(StringUtility.unique(str));

        System.out.println(StringUtility.frequency(str,'v'));

        String s1="aaabbbcccc";    // abc
        String s2="abbbcccabbc";   // abc

        boolean isAnagram=StringUtility.anagram(s1,s2);
        System.out.println(isAnagram);

        boolean isPalindrome=StringUtility.isPalindrome(str);
        System.out.println(isPalindrome);



    }
}
