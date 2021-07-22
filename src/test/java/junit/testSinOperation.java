package junit;

import org.junit.Assert;
import org.junit.Test;

public class testSinOperation extends junitBaseCalculatorTest {

    @Test
    public void testSinFunction(){
        Assert.assertEquals(0.8414709848, calculator.sin(1));
    }
}
