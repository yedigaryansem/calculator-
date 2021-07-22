package testNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class testNgBaseCalculatorTest {
    Calculator calculator;

    @BeforeClass(groups = "main")
    public void setUp(){
        calculator = new Calculator();

    }

    @AfterClass
    public void tearDown(){
        calculator = null;
    }

}
