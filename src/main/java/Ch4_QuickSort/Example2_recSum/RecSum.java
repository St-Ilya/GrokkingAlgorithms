package Ch4_QuickSort.Example2_recSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecSum {
    public static void main(String[] args) {
        System.out.println(sum(new ArrayList<>(Arrays.asList(1,2,3,4))));
    }

    public static int sum(List<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        return arr.get(0) + sum(arr.subList(1, arr.size()));

    }
}
