package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testDivOperation extends testNgBaseCalculatorTest {

    @Test(groups = "bug")
    public void testDivFunction(){
        Assert.assertEquals(calculator.div(5, 2), 2.5d, "Invalid result of divide operation ");
    }
}
