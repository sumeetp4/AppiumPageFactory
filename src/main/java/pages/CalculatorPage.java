package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class CalculatorPage extends BasePage {

    public CalculatorPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement button7;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
    private MobileElement button9;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private MobileElement buttonAdd;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private MobileElement buttonEq;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private MobileElement resultScreen;

    public void clickButton7()
    {
        button7.click();
    }

    public void clickButton9()
    {
        button9.click();
    }

    public void clickButtonAdd()
    {
        buttonAdd.click();
    }

    public void clickButtonEq()
    {
        buttonEq.click();
    }

    public String getResult() {
        return resultScreen.getText();
    }
}
