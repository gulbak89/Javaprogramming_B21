package day45_Excaption;

public class ThrowsKeyWord {
    public static void main(String[] args) throws InterruptedException{  // Throw key word: only for checked exceptions; must be given within the method signature
                                                                         // cheaper way to handle the exceptions; it is fast and simple; just for temporary;

        /*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Step2");
        */

        Thread.sleep(3000);

        System.out.println("Step2");





    }
}
