package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};

        System.out.println(BinarySearchDef(arr, 3));
    }

    public static int BinarySearchDef(int[] arr, int item) {
        if (isEmpty(arr)) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int guess;

        while(low <= high) {
            mid = (low + high) / 2;
            guess = arr[mid];
            if (guess == item) {
                return mid;
            }

            if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static boolean isEmpty(int[] arr) {
        if (arr == null) {
            return true;
        }
        return false;
    }
}
