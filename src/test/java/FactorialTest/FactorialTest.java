package FactorialTest;

import Ch3_Recursion.Example3_Factorial.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorialEqualsNumber() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(120, factorial.fact(5));
    }

    @Test
    public void testFactorialNotEqualsNumber() {
        Factorial factorial = new Factorial();
        Assert.assertNotEquals(24, factorial.fact(5));
    }
}
