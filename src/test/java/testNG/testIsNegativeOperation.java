package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testIsNegativeOperation extends testNgBaseCalculatorTest {

    @Test(dataProvider = "dataForSumFunction")
    public void testIsNegativeFunction(long testValue, boolean expected) {
        Assert.assertEquals(calculator.isNegative(testValue), expected);
    }

    @DataProvider(name = "dataForSumFunction")
    public Object[][] dataForIsNegative1() {
        return new Object[][]{
                {-5, true},
                {5, false},
                {0, false}
        };
    }
}
