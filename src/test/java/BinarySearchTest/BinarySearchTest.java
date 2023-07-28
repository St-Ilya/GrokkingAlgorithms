package BinarySearchTest;

import BinarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
            public void testBinarySearchGiveArrayAndItemReturnIndexOfItem() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9};
        Assert.assertEquals(1, binarySearch.BinarySearchDef(arr, 3));
    }
}
