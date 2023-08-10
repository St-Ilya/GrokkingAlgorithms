package Recursion;

public class CountDown {
    public static void main(String[] args) {
        int i = 10;
        countDown(i);
    }

    // infinite func
    public static void countDown (int i) {
        System.out.println(i);
        countDown(i - 1);
    }
}
