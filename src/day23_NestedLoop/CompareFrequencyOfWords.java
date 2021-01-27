package day23_NestedLoop;

public class CompareFrequencyOfWords {
    public static void main(String[] args) {

        String s="Cat Dog Cat Dog Cat dog cat dog";


        s=s.toLowerCase();  // to ignore case sensitivity.



        int count1=0;
        int count2=0;

        while(s.contains("dog")){
            s=s.replaceFirst("dog","");
            count1++;

        }

        while(s.contains("cat")){
            s=s.replaceFirst("cat","");
            count2++;
        }

        if(count1==count2){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}
