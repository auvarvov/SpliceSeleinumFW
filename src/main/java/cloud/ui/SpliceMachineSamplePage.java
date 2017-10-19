package cloud.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

/**
 * Created by auvarov on 10/12/17.
 */
public class SpliceMachineSamplePage extends AbstractPage {


    public SpliceMachineSamplePage(WebDriver driver) {
        super(driver);


    }


    public void clickOnNavigationSplicemachineButton() {
        getElement(LocatorType.XPATH, ".//*[@class='logo__Layout___CK3VB']").click();

    }

    public void clickOnNavigationDashboardButton() throws InterruptedException {

        sleep(2000);
        WebElement element = getElement(LocatorType.XPATH, ".//*[@href='/043545ba-9614-46dc-9e85-a8ee3b6e4282/dashboard']");
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }


    }

    public void clickOnNavigationEventsButton() {


        WebElement element = getElement(LocatorType.XPATH, ".//*[@href='/043545ba-9614-46dc-9e85-a8ee3b6e4282/events']");
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }

    }

    public void clickOnNavigationAccountButton() {
        getElement(LocatorType.XPATH, ".//*[@href='/043545ba-9614-46dc-9e85-a8ee3b6e4282/account']").click();

    }

    public void clickOnNavigationAccountDropDownButton() {
        getElement(LocatorType.XPATH, ".//*[@class='userBar__Layout___qKbeQ']").click();

    }

    public void clickOnNavigationProfileDropDownButton() {
        clickOnNavigationAccountDropDownButton();
        getElement(LocatorType.XPATH, "//span[text()='Profile']").click();

    }

    public void clickOnNavigationSettingsDropDownButton() {
        clickOnNavigationAccountDropDownButton();
        getElement(LocatorType.XPATH, "//span[text()='Settings']").click();

    }

    public void clickOnNavigationLogoutDropDownButton() {
        clickOnNavigationAccountDropDownButton();
        getElement(LocatorType.XPATH, "//span[text()='Logout']").click();

    }

}
