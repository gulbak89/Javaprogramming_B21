package day27_ForEachLoop;

public class UniqueIntegers2 {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 4, 2, 5, 6};
        for (int Each : numbers) {

            int count = 0;

            for (int each : numbers) {
                if (each == Each) {
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(Each);
            }
        }
    }
}