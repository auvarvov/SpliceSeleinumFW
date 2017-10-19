package cloud.ui;

import org.openqa.selenium.WebDriver;

/**
 * Created by auvarov on 10/12/17.
 */
public class SplicemachineSettingsPage extends SpliceMachineSamplePage {

    public SplicemachineSettingsPage(WebDriver driver) {
        super(driver);


    }

    public void clickOnBillingActivityTab()
    {
        getElement(LocatorType.XPATH, ".//*[text()='Billing Activity']").click();

    }

    public void clickOnUsersTab()
    {
        getElement(LocatorType.XPATH, ".//*[text()='Users']").click();

    }


    public void clickOnCompanyInformationTab()
    {
        getElement(LocatorType.XPATH, ".//*[text()='Company Information']").click();

    }




}
