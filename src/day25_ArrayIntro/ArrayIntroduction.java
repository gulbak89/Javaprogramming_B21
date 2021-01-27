package day25_ArrayIntro;

public class ArrayIntroduction {

    public static void main(String[] args) {

        String[] names={"Azad", "Arman", "Arzu","Guli"};
       //index:           0,      1,       2,       3

       String name1= names[0];

        System.out.println(names[2]);



        int[] scores={90,80,97,92};

        int score3=scores[2];

        System.out.println(score3);

      //  System.out.println(names[1]+": "+scores[1]);
       // System.out.println(names[2]+": "+scores[2]);
        //System.out.println(names[3]+": "+scores[3]);
        //System.out.println(names[0]+": "+scores[0]);

        for(int i=0; i<=names.length-1; i++) {
            System.out.println(names[i] + ": " + scores[i]);
        }



    }
}
