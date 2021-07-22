package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testSubOperation extends baseCalculatorTest{

    @Test
    public void testSubFunction(){
        Assert.assertEquals(calculator.sub(1, 2), -1, "Invalid result of sum operation");
    }
}
