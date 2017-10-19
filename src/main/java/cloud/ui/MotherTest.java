package cloud.ui;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

/**
 * Created by auvarov on 10/11/17.
 */
public class MotherTest {


    protected WebDriver driver;
    protected Configuration browser;
    protected ScreenShot takeScreenshot = ScreenShot.TAKE_SCREENSHOT_ON;


    @BeforeClass
    public void setup() throws MalformedURLException {
        browser = new Configuration(BrowserType.FIREFOX, "https://cloud.splicemachine-qa.io");
        driver = browser.getWebDriver();
        //driver.manage().window().maximize();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {

    }


    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) throws Exception {
        if (ITestResult.FAILURE == result.getStatus() && takeScreenshot.equals(ScreenShot.TAKE_SCREENSHOT_ON)) {
            browser.takeScreenshot();
        }
        browser.killBrowser();

    }


}
