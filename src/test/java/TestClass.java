import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class TestClass extends BaseClass {

    @Test
    public void calculation() {
        CalculatorPage cp = new CalculatorPage(driver);
        cp.clickButton7();
        cp.clickButtonAdd();
        cp.clickButton9();
        cp.clickButtonEq();
        Assert.assertEquals(cp.getResult(),"16");
    }
}
