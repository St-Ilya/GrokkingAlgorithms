package BinarySearchTest;

import Ch1_BinarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    /*
    BinarySearch - вернет индекс числа, которое мы ищем
     */
    @Test
    public void testBinarySearchGiveArrayAndItemReturnIndexOfItem() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9};
        Assert.assertEquals(1, binarySearch.BinarySearchDef(arr, 3));
    }
}
