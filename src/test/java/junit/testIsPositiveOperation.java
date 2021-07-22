package junit;

import org.junit.Assert;
import org.junit.Test;

public class testIsPositiveOperation extends junitBaseCalculatorTest {

    @Test
    public void testIsPositiveFunction(){
        Assert.assertTrue(calculator.isPositive(1));
    }
}
