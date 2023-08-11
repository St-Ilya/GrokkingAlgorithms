package Ch4_QuickSort.Example3_recCount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }

    public static int count(List<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        return 1 + count(arr.subList(1, arr.size()));
    }
}
