package offineHours.Practice_11_26;

public class LoopsPractice {

    public static void main(String[] args) {


        for (int i=1; i<=50; i++){
            System.out.print(i+" ");
        }


        System.out.println();

        for (int i=1; i<=50; i+=2){
            System.out.print(i+" ");
            if(i==29){
                break;    //loop will exits after printing 29.
            }
        }

        System.out.println();





    }



}
