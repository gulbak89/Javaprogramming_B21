package day27_ForEachLoop;

public class UniqueNumber {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 5, 1, 2};

        for (int j = 0; j < num.length; j++) {
            int n = num[j];
            int count = 0;

            for (int i = 0; i < num.length; i++) {
                if (n == num[i]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(n);

            }
        }
    }
}
