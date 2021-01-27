package day45_Excaption;

public class ThrowsVsTryCatch {



       public static void method1(){

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void method2() throws InterruptedException{
           Thread.sleep(3000);
        }

        public static void sleep(long seconds){
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args)  {

        method1();
        System.out.println("Try & Catch");

        //method2();   // disadvantages of the throws occur during method call
        //System.out.println("throw key word");

        sleep(3);

        System.out.println("Test completed");



    }







}
