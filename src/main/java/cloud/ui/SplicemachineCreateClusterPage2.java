package cloud.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by auvarov on 10/19/17.
 */
public class SplicemachineCreateClusterPage2 extends SpliceMachineSamplePage {

    public SplicemachineCreateClusterPage2(WebDriver driver) {
        super(driver);
    }

    public WebElement getConfirmCheckBox() {
        return getElement(LocatorType.XPATH, ".//*[@id='termsAccepted']");

    }

    public void clickConfirrmCheckBox() {
        getConfirmCheckBox().click();

    }
    public void clickOnLaunchButton() {
        getElement(LocatorType.XPATH, ".//*[@id='cancel']/../button[3]").click();

    }


}
