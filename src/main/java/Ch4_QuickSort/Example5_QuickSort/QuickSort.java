package Ch4_QuickSort.Example5_QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println(quickSort(Arrays.asList(10, 5, 2, 3)));
        System.out.println(myQuickSort(Arrays.asList(10, 5, 2, 3)));
    }

    public static List<Integer> quickSort(List<Integer> array) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        if (array.size() < 2) {
            // base case, if there are less than two elements, sorting is not required
            return array;
        } else {
            // recursive case
            Integer pivot = array.get(0); // Опорный элемент

            // sub-array of all the elements less than the pivot
            List<Integer> less = array.stream().skip(1).filter(x -> x <= pivot).collect(Collectors.toList());

            // // sub-array of all the elements greater than the pivot
            List<Integer> greater = array.stream().skip(1).filter(x -> x > pivot).collect(Collectors.toList());

            return Stream.of(quickSort(less).stream(),
                    Stream.of(pivot),
                    quickSort(greater).stream()).flatMap(Function.identity()).collect(Collectors.toList());
        }

    }

    public static List<Integer> myQuickSort(List<Integer> list) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        if (list.size() < 2) {
            return list;
        } else {
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            Integer pivot = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= pivot) {
                    less.add(list.get(i));
                } else {
                    greater.add(list.get(i));
                }
            }
            List<Integer> sortedList = new ArrayList<>();
            sortedList.addAll(myQuickSort(less));
            sortedList.add(pivot);
            sortedList.addAll(myQuickSort(greater));
            return sortedList;
        }
    }
}
