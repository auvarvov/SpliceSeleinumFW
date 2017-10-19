package cloud.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by auvarov on 10/11/17.
 */
public class SplicemachineFrontPage extends SpliceMachineSamplePage {


    public SplicemachineFrontPage(WebDriver driver) {
        super(driver);


    }

    public void clickOnCreateClusterButton() {
        getElement(LocatorType.XPATH, "/html/body/div/div/div[1]/div/div[1]/div[2]/div[1]/button[2]").click();

    }


    public void clickOncluster(String clustername) {

        getElement(LocatorType.XPATH, ".//*[text()='" + clustername + "']").click();

    }

    public String getClusterStatusbyName(String clusterName) {
        return getElement(LocatorType.XPATH, ".//*[@id='root']/div/div[1]/div/div[1]/div[2]/div[2]/div/table/tbody/*//a[text()='" + clusterName + "']/../../*//div[contains(@class,' wrapper__StatusLabel')]/*//span").getText();

    }


}
