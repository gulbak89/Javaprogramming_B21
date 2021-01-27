package day27_ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] names= {"amat","samat","ayshem"};

        for(int i=0; i<names.length; i++){

            System.out.println(names[i].substring(0,1).toUpperCase()+names[i].substring(1).toLowerCase());

        }


        System.out.println("================================");

        for(String each : names){
            System.out.println(each);
        }


        System.out.println("==================================");

        int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12};
        int countEven=0;
        int counOdd=0;

        for(int each : numbers){
            if (each%2==0) {
                countEven++ ;
            }

            if(each%2!=0){
                counOdd++;
            }
        }

        System.out.println(countEven);
        System.out.println(counOdd);


        System.out.println("=========================");

        int[] scores={1,3,2,4,2,5,7};
        int max=scores[0];
        int min=scores[0];

        for(int each: scores){
            if(each>max){
                max=each;
            }

            if(each<min){
                min=each;

            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
