package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testTgOperation extends testNgBaseCalculatorTest {

    @Test(groups = "bug")
    public void testTgFunction(){
        Assert.assertEquals(calculator.tg(1), 1.55740772465d);
    }
}
