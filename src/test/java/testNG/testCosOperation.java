package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testCosOperation extends testNgBaseCalculatorTest {

    @Test(groups = "bug")
    public void testCosFunction(){
        Assert.assertEquals(calculator.cos(1), 0.54030230586d);
    }
}
