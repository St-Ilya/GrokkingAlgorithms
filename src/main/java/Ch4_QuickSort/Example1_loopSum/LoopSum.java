package Ch4_QuickSort.Example1_loopSum;

public class LoopSum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int x : arr) {
            total += x;
        }
        return total;
    }
}
