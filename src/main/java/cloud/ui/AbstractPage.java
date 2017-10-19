package cloud.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by auvarov on 10/11/17.
 */
public abstract class AbstractPage {
    protected WebDriver drv;

    protected WebDriverWait wait;


    public WebDriver getDrv() {
        return drv;
    }

    public AbstractPage(WebDriver driver) {
        drv = driver;
        wait = new WebDriverWait(getDrv(), 10);


    }


    public String getTextByXpath(String xpath) throws InterruptedException {

        By by = new By.ByXPath(xpath);
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webElement.getText();
    }

    public boolean isElementPresented(String xpath) {
        return drv.findElement(By.xpath(xpath)).isDisplayed();
    }

    public WebElement getElement(LocatorType locatorType, String element) {
        switch (locatorType) {
            case CSS:
                return getDrv().findElement(By.cssSelector(element));
            case XPATH:
                return getDrv().findElement(By.xpath(element));
            case NAME:
                return getDrv().findElement(By.name(element));
        }
        return null;
    }

    public WebElement getElementByCSS(String element) {

        return getDrv().findElement(By.cssSelector(element));

    }

    public WebElement getElementByXpath(String element) {

        return getDrv().findElement(By.xpath(element));

    }

    public WebElement getElementByName(String element) {

        return getDrv().findElement(By.name(element));

    }


    public boolean urlContains(String subpath) {
        wait.until(ExpectedConditions.urlContains(subpath));
        return getDrv().getCurrentUrl().contains(subpath);
    }


}
