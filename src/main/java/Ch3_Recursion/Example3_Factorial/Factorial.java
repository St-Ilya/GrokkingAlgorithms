package Ch3_Recursion.Example3_Factorial;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int x) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        if (x == 1) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
