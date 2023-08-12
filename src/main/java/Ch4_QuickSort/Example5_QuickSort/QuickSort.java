package Ch4_QuickSort.Example5_QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(new ArrayList<>(Arrays.asList(10, 5, 2, 3))));
    }

    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            int pivot = array.get(0);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();

            for (Integer integer : array) {
                if (integer <= pivot) {
                    less.add(integer);
                } else {
                    greater.add(integer);
                }
            }
            List<Integer> sortedLess = quickSort(less);
            List<Integer> sortedGreater = quickSort(greater);

            List<Integer> sortedArray = new ArrayList<>();
            sortedArray.addAll(sortedLess);
            sortedArray.add(pivot);
            sortedArray.addAll(sortedGreater);

            return sortedArray;
        }

    }
}
