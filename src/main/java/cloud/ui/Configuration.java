package cloud.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


/**
 * Created by auvarov on 10/11/17.
 */
public class Configuration {

    private final BrowserType browser;
    private final String url;
    private StringBuffer verificationErrors = new StringBuffer();
    WebDriver driver;


    public Configuration(BrowserType browser, String url) throws MalformedURLException {
        this.browser = browser;
        this.url = url;
        this.driver = setBrowserDriver(browser);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);

    }

    public WebDriver getWebDriver() {

        return driver;

    }


    public WebDriver setBrowserDriver(BrowserType browser) throws MalformedURLException {

        switch (browser) {
            case FIREFOX:
                return new FirefoxDriver();
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/Users/auvarov/Downloads/chromedriver");
                return new ChromeDriver();
            default:
                throw new MalformedURLException("Unsopported browser Type");
        }


    }


    public void killBrowser() {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);

        }

    }


    public void takeScreenshot() throws IOException {
        Utils.takeScreensht(driver);
    }
}
