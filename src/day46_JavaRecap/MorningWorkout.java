package day46_JavaRecap;

public class MorningWorkout {

    public static void main(String[] args) {

        for (int i=1; i<=30; i++){
            System.out.println(i+" push up");
            sleep(1.5);
        }

        for (int i=1; i<=20; i++){
            System.out.println(i+" Pull up");
            sleep(2.5);
        }
    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
