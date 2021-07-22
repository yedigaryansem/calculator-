package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testSumOperation extends testNgBaseCalculatorTest {

    @Test(dataProvider = "dataForSumFunction")
    public void testSumFunction(long firstTestValue, long secondTestValue, long expectedSumResult){
        Assert.assertEquals(calculator.sum(firstTestValue, secondTestValue), expectedSumResult, "Invalid result of sum operation");
    }

    @DataProvider(name = "dataForSumFunction")
    public Object[][] dataForSumFunction(){
        return new Object[][]{
                {10, 10, 20},
                {10, -10, 0},
                {-10, -10, -20}
        };
    }
}
