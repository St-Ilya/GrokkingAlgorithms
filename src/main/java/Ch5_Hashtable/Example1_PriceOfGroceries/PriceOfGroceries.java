package Ch5_Hashtable.Example1_PriceOfGroceries;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PriceOfGroceries {
    public static void main(String[] args) {
        Map<String, BigDecimal> book = new HashMap<>();
        book.put("apple", new BigDecimal("0.67"));
        book.put("milk", new BigDecimal("1.49"));
        book.put("avocado", new BigDecimal("1.49"));

        System.out.println(book);
    }
}
