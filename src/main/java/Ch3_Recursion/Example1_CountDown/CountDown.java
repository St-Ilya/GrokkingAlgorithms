package Ch3_Recursion.Example1_CountDown;

public class CountDown {
    public static void main(String[] args) {
        int i = 10;
        //countDown(i);
        countDownBase(i);
    }

    // infinite func
    public static void countDown (int i) {
        System.out.println(i);
        countDown(i - 1);
    }

    public static void countDownBase(int i) {
        System.out.println(i);
        if (i <= 1) {
            return;
        } else {
            countDownBase(i - 1);
        }
    }
}
