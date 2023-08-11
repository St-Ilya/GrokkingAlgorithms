package Ch4_QuickSort.Example4_MaxValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxValueRec {
    public static void main(String[] args) {
        System.out.println(maxValue(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
    }

    public static Integer maxValue(List<Integer> arr) {
        if (arr.isEmpty()) {
            return null;
        }
        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            Integer maxNum = maxValue(arr.subList(1, arr.size()));
            return arr.get(0) > maxNum ? arr.get(0) : maxNum;
        }
    }
}
